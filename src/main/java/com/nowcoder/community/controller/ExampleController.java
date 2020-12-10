package com.nowcoder.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/example")
public class ExampleController {
    @RequestMapping("/yes")
    @ResponseBody
    public String sayyes(){
        return "yes!";
    }
}
