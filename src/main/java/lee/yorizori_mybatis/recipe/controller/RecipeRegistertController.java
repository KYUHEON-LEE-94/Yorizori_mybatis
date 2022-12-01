package lee.yorizori_mybatis.recipe.controller;

import lee.yorizori_mybatis.common.web.YzRuntimeException;
import lee.yorizori_mybatis.recipe.dto.Recipe;
import lee.yorizori_mybatis.recipe.dto.RecipeJoinRecipePro;
import lee.yorizori_mybatis.recipe.serviece.RecipeServiceImpl;
import lee.yorizori_mybatis.recipeProcedure.dto.ReciepeProcedure;
import lee.yorizori_mybatis.recipeProcedure.service.RecipeProcedureServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.standard.expression.Each;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

@Slf4j
@Controller
@RequestMapping("/recipe/register.do")
public class RecipeRegistertController {

    @Value("${file.dir}")
    private String location;

    @Autowired
    private RecipeServiceImpl recipeService;

    @Autowired
    private RecipeProcedureServiceImpl recipeProcedureService;

    @GetMapping
    public String doGet(HttpServletRequest request,
                        @RequestParam("bookId") int bookId,
                        Model model){

        //th:object와 field 사용을 위해서
        Recipe recipe = new Recipe();
        model.addAttribute("recipe",recipe);

        ReciepeProcedure ReciepeProcedure = new ReciepeProcedure();
        model.addAttribute("ReciepeProcedure",ReciepeProcedure);
        //----

        //쿼리 스트링으로 넘어온 bookid값을 읽어서 recipeForm.jsp의 value에 기록할 수 있게 전달
        model.addAttribute("bookId", bookId);

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
        // 로그인 하지 않은 경우
        if (loginId == null) {
            throw new YzRuntimeException("레시피를 등록하려면 로그인이 필요합니다.", "/user/loginform.do");
        } else {
            return "/views/reciepe/recipeForm";
        }

    }




    @PostMapping
    public String doPost(@ModelAttribute("recipe") Recipe recipe,
                         @RequestParam(value = "procedure", required = false, defaultValue = "") String[] procedure){




        MultipartFile imgfilename = recipe.getImgfilename();
        String FileName = recipe.getImgfilename().getOriginalFilename();
        String contentType = null;

        try {
            if (!imgfilename.isEmpty()) {
                Path path = Paths.get(location + FileName);
                contentType = Files.probeContentType(path);
                imgfilename.transferTo(new File(path.toString()));
            }

        }catch (IOException e){
            throw  new YzRuntimeException();
        }


        //recipeID를  넣어주기 위한 PFK 생성
        Random rd = new Random();//랜덤 객체 생성
        int RecipeId = (rd.nextInt(500)+1);
        RecipeJoinRecipePro recipeJoinRecipePro = new RecipeJoinRecipePro();

        //recipeJoinRecipePro는 mybatis와 String mapping을 하기위해서 사용
            //그렇기 떄문에 service.create()에 recipeJoinRecipePro를 사용해야함 -> recipe객체를 사용하면 setImgfilename()이 Multipartfile 타입이라 mapping되지 못함
                //Springboot의 Modelattribute 장점을 살리지 못하는게 아쉽지만, 이게 최선의 방법이라고 생각해서 선택

        recipeJoinRecipePro.setRecipetime(recipe.getRecipetime());
        recipeJoinRecipePro.setRecipelevel(recipe.getRecipelevel());
        recipeJoinRecipePro.setRecipename(recipe.getRecipename());
        recipeJoinRecipePro.setWriterid(recipe.getWriterid());
        recipeJoinRecipePro.setImgconttype(contentType);
        recipeJoinRecipePro.setIngredients(recipe.getIngredients());
        recipeJoinRecipePro.setBookid(recipe.getBookid());
        recipeJoinRecipePro.setRecipeid(RecipeId);
        recipeJoinRecipePro.setImgfilename(FileName);
        recipeService.create(recipeJoinRecipePro);


        //procedure가 배열이어서 반복문으로 돌려가면서 등록해줌
        ReciepeProcedure rp = new ReciepeProcedure();
        for(int i = 0; i<procedure.length; i++){
            rp.setRecipeid(RecipeId);
            rp.setSeqNum((i+1));
            rp.setProcedure(procedure[0]);
            recipeProcedureService.create(rp);
        }






        return "redirect:/cookbook/list.do";
    }



}
