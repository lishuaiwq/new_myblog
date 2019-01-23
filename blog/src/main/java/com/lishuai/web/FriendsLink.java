package com.lishuai.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:shui.li
 * @Date:2019/1/2213:33
 */
@Controller
public class FriendsLink {

    @GetMapping("/firend")
    public String about() {
        return "firends";
    }
}
