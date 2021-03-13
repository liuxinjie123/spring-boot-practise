package com.dream.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

    @GetMapping(value = {"", "/", "/index", "/home"})
    public String indexPage() {
        return "admin/index";
    }
}
