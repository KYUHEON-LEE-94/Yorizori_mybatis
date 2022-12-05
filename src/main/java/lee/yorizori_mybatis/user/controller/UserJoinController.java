package lee.yorizori_mybatis.user.controller;

import lee.yorizori_mybatis.user.dto.User;
import lee.yorizori_mybatis.user.service.UserServiceImpl;
import lee.yorizori_mybatis.user.validation.UserValidation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/*
회원가입 컨트롤러
 */
@Slf4j
@Controller
@RequestMapping("/user/regist.do")
public class UserJoinController {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private  UserValidation userValidation;

    @GetMapping
    public String doGet(Model model){
        User user = new User();
        model.addAttribute("user",user);

        return "/views/user/form";
    }



    @PostMapping
    public String doPost(@Validated @ModelAttribute User user,
                         BindingResult bindingResult,
                         RedirectAttributes redirect
                         ){

        userValidation.validate(user,bindingResult);

        //회원가입 실패시 다시 가입화면으로
        if(bindingResult.hasErrors()){
            log.info("bindingResult : {}", bindingResult);
            return "/views/user/form";
        }

        userService.create(user);

        redirect.addAttribute("id", user.getId());
        redirect.addAttribute("name", user.getName());
        redirect.addAttribute("email", user.getEmail());

//회원가입이 완료되면 회원가입 결과 페이지로 redirect
        return "redirect:/user/result.do";

    }






}
