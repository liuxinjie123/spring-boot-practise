package com.dream.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonPageController {

    @GetMapping(value = "/login")
    public String loginPage() {
        return "/login";
    }
}
