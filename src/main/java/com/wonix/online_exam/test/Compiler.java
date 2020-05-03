package com.wonix.online_exam.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Compiler
{
    @RequestMapping("/compiler")
    public String compiler()
    {
        return "compiler";
    }
}
