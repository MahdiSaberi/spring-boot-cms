package ir.example.springbootcms.controller;

import io.swagger.annotations.SecurityDefinition;
import ir.example.springbootcms.mapper.UserMapper;
import ir.example.springbootcms.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final UserMapper userMapper;

    @GetMapping
    public ModelAndView getPanel(){
        return new ModelAndView("admin-panel");
    }
}
