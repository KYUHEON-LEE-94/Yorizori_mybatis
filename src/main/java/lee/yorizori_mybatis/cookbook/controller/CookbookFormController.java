package lee.yorizori_mybatis.cookbook.controller;

import lee.yorizori_mybatis.common.error.YzRuntimeException;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/cookbook/register.do")
public class CookbookFormController {

    @Autowired
    private CookbookServiceImpl cookbookService;

    @GetMapping
    public String doGet(@CookieValue(value = "loginid", required = false, defaultValue = "") Cookie loginid,
                     HttpServletRequest request,
                        Model model){

        Cookbook cookbook = new Cookbook();
        model.addAttribute("cookbook",cookbook);

                if (loginid != null) {
                    model.addAttribute("loginId",loginid.getValue());
                }



        if (loginid == null) {
            throw new YzRuntimeException("요리책 등록하려면 로그인이 필요합니다.", "/user/loginform.do");
        } else {
            return "/views/cookbook/cookbookForm";
        }

    }


    @PostMapping
    public String doPost(@ModelAttribute Cookbook cookbook){

        log.info("쿡붑{}",cookbook);
        cookbookService.create(cookbook);

        return "redirect:/";
    }
}
