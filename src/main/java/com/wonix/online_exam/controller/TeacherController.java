package com.wonix.online_exam.controller;

import com.wonix.online_exam.dao.TeacherDao;
import com.wonix.online_exam.entitles.Teacher;
import com.wonix.online_exam.utils.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeacherController
{
    @Autowired
    TeacherDao teacherDao;

    @RequestMapping("/add_teacher")
    public String addTeacher()
    {
        return "add_teacher";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("id") String id,
                      @RequestParam("username") String username,
                      @RequestParam("sex") int sex)
    {
        Teacher teacher = new Teacher(id, username, sex, Encryption.getMd5(id));
        teacherDao.addTeacher(teacher);
        return "redirect:/add_teacher";
    }
}
