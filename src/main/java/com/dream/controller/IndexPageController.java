package com.dream.controller;

import com.dream.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 在 template 目录下的所有页面只能通过 controller 跳转
 * 需要模板引擎
 */
@Controller
public class IndexPageController {

    @GetMapping(value = {"","index"})
    public String indexPage(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        model.addAttribute("welcome", "<h1>Welcome</h1>");

        List<UserVo> userList = new ArrayList<>();
        UserVo user = new UserVo();
        user.setId(1L).setName("jack").setPhone("15685856696");
        userList.add(user);
        user = new UserVo();
        user.setId(2L).setName("tom").setPhone("88888888");
        userList.add(user);
        user = new UserVo();
        user.setId(3L).setName("hello").setPhone("15656568966");
        userList.add(user);
        model.addAttribute("userList", userList);
        return "index";
    }

}
