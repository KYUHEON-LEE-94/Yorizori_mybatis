package lee.yorizori_mybatis.cookbook.controller;

import lee.yorizori_mybatis.common.error.ErrorCode;
import lee.yorizori_mybatis.common.error.YzRuntimeException;
import lee.yorizori_mybatis.cookbook.dto.Cookbook;
import lee.yorizori_mybatis.cookbook.service.CookbookServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping("/cookbook/register.do")
public class CookbookFormController {

    @Autowired
    private CookbookServiceImpl cookbookService;

    @GetMapping
    public String doGet(HttpServletRequest request, Model model){
        Cookbook cookbook = new Cookbook();
        model.addAttribute("cookbook",cookbook);

        Cookie[] cookies = request.getCookies();
        String loginId = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equalsIgnoreCase("loginId")) {
                    loginId = cookie.getValue();
                    model.addAttribute("loginId",loginId);
                }
            }
        }

        if (loginId == null) {
            throw new YzRuntimeException(ErrorCode.LOGIN_ERROR.getMessage(), "/user/loginform.do");
        } else {
            return "/views/cookbook/cookbookForm";
        }

    }


    @PostMapping
    public String doPost(@ModelAttribute Cookbook cookbook){
        cookbookService.create(cookbook);

        return "redirect:/";
    }
}
