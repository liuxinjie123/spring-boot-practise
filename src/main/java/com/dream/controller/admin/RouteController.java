package com.dream.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "admin")
public class RouteController {

    @GetMapping(value = {"", "/", "/index", "/home"})
    public String indexPage() {
        return "admin/index";
    }

    @GetMapping(value = "/level1/{page}")
    public String level1Page(@PathVariable("page") String page) {
        return "admin/level1/" + page;
    }

    @GetMapping(value = "/level2/{page}")
    public String level2Page(@PathVariable("page") String page) {
        return "admin/level2/" + page;
    }

    @GetMapping(value = "/level3/{page}")
    public String level3Page(@PathVariable("page") String page) {
        return "admin/level3/" + page;
    }


}
