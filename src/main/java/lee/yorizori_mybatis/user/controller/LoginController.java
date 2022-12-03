package lee.yorizori_mybatis.user.controller;



import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.service.UserServiceImpl;
import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/user/login.do")
    public String getLogOut(@CookieValue(value = "loginid", required = false, defaultValue = "") Cookie loginid,
                            @CookieValue(value = "saveid", required = false, defaultValue = "") Cookie saveid,
                            HttpServletRequest request,
                            HttpServletResponse response,
                            RedirectAttributes redirect) {

            //Login 쿠키가 있을 경우 경로와 유효기간을 설정해서 바로 로그아웃 시킴
                if (loginid != null) {
                    loginid.setPath("/");
                    loginid.setMaxAge(0);
                    response.addCookie(new Cookie(loginid.getName(),loginid.getValue()));


                    //saveId가 있을 경우 URL에 값을 저장해두고 사용함
                }
                if (saveid != null) {
                    redirect.addAttribute("saveid",saveid.getValue());

                }
        return "redirect:/";
    }

    @PostMapping("/user/login.do")
    public String Login(@RequestParam("id") String id,
                        @RequestParam("passwd") String passwd,
                        @RequestParam("saveid") String saveid,
                        HttpServletRequest request,
                        HttpServletResponse response,
                        RedirectAttributes redirect,
                        Model model
                        ){

        User loginUser = userService.findByIdAndPasswd(id,passwd);


        if (loginUser != null) {
            Cookie loginCookie = new Cookie("loginid", loginUser.getId());
            loginCookie.setPath("/");
            response.addCookie(loginCookie);
            redirect.addAttribute("loginid",loginUser.getId());
            redirect.addAttribute("loginStat", true);

            if (saveid != null) {
                Cookie saveidCookie = new Cookie("saveid", loginUser.getId());
                saveidCookie.setPath("/");
                saveidCookie.setMaxAge(60 * 60 * 24 * 30);
                response.addCookie(saveidCookie);


            }


            return "redirect:/";
        } else {
            // 회원가입이 안되어있으면 로그인 화면으로 다시 유도
            return  "redirect:/user/loginform.do";
        }



    }


}
