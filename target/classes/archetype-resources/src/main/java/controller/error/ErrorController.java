
package ${groupId}.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {

    @RequestMapping("/error/404")
    public ModelAndView error404Handler() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("404");
        return mav;
    }
}
