package lee.yorizori_mybatis.common.error;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class YorizoRiErrorController {

    @ExceptionHandler({YzRuntimeException.class})
    public   String GlobalException(Model model){
    Exception exception = new Exception();
    model.addAttribute("exception", exception);

    String RedirectUrl = ((YzRuntimeException) exception).getRediectUrl();
    model.addAttribute("RedirectUrl", RedirectUrl);
    return "error/error_yorizori";
    }




}
