package com.wonix.online_exam.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EditorTest
{
    @RequestMapping("/editor_test")
    public String editor_test()
    {
        return "editor_test";
    }
}
