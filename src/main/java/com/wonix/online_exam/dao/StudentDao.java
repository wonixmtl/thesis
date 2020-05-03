package com.wonix.online_exam.dao;

import com.wonix.online_exam.entitles.Student;
import com.wonix.online_exam.utils.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDao
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    // 登录验证
    public boolean validation(String username, String password)
    {
        String passwd = Encryption.getMd5(password);
        String sql = "select * from students where id = ? and password = ?";
        List<Student> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class),username,passwd);

        if (list.size() == 0)
            return false;
        else
            return true;
    }

    // 新增学生
    public int addStudent(Student student)
    {
        String sql = "insert into students values(?,?,?,?,?)";

        return jdbcTemplate.update(sql,student.getId(),student.getName(),student.getSex(),student.getTeam(),Encryption.getMd5(student.getId()));
    }

}
