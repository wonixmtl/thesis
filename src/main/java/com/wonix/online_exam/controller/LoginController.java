package com.wonix.online_exam.controller;

import com.wonix.online_exam.dao.StudentDao;
import com.wonix.online_exam.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
//@RestController
public class LoginController
{
    @Autowired
    StudentDao studentDao;

    @Autowired
    TeacherDao teacherDao;

    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session)
    {
        if (studentDao.validation(username, password))
        {
            //重定向
//            session.setAttribute("loginUser",username);
            return "redirect:/compiler";
        }
        else if (teacherDao.validation(username,password))
        {
            return "redirect:/add_teacher";
        }
        else
        {
            map.put("msg","用户名密码错误");
            return "index";
        }
    }
}
