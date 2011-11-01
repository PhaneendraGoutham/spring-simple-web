
package ${groupId}.controller;

import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class IndexController {

    private static final Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping("/")
    public RedirectView defaultHandler(HttpServletResponse response) {

        /* 301 redirect */
        RedirectView redirectView = new RedirectView("index");
        redirectView.setStatusCode(HttpStatus.MOVED_PERMANENTLY);
        return redirectView;
    }

    @RequestMapping("/index")
    public ModelAndView indexHandler() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");

        return mav;
    }
}
