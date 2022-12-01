package lee.yorizori_mybatis.recipe.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Recipe {

    private int recipeid, bookid, recipetime, recipelevel;
    private String recipename, ingredients, imgconttype, writerid; //,imgfilename;
    MultipartFile imgfilename;
}
