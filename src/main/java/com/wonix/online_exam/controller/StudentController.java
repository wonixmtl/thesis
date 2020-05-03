package com.wonix.online_exam.controller;

import com.wonix.online_exam.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController
{
    @Autowired
    StudentDao studentDao;

    @ResponseBody
    @RequestMapping("/encryption")
    public String getMd()
    {
        return "encryption";
    }
}
