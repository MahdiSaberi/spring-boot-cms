package ir.example.springbootcms.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class PageController {

    @GetMapping("/login-process")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @GetMapping("/access-denied")
    public ModelAndView getAccessDenied() {
        return new ModelAndView("403");
    }
}
