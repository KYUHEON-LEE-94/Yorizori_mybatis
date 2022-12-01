package lee.yorizori_mybatis.recipe.dto;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
/*
Reciper Join RecipeProcedure 결과를 받기위한 Bean
 */
public class RecipeJoinRecipePro {
    //Recipe
    private int recipeid, bookid, recipetime, recipelevel;
    private String recipename, ingredients, imgconttype, writerid;
//    MultipartFile imgfilename;
    String imgfilename;
    //RecipeProcedure
    private int seqNum;
    private String procedure;
}
