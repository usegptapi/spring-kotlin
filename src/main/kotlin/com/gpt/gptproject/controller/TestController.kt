package com.gpt.gptproject.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TestController {

    @GetMapping("/")
    @ResponseBody
    fun test(): String {
        return "Hello~~~~~~~~!";
    }

}