package com.kgisl.spring1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")

        public ModelAndView show(){
            ModelAndView v=new ModelAndView();
            v.setViewName("welcome.jsp");
            v.addObject("welcome", "Happy to welcome"+" you");
            return v;
        }
}
