package com.wonix.online_exam.dao;

import com.wonix.online_exam.entitles.Teacher;
import com.wonix.online_exam.utils.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDao
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    //登录验证
    public boolean validation(String username, String password)
    {
        String passwd = Encryption.getMd5(password);
        String sql = "select * from teachers where id = ? and password = ?";
        List<Teacher> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Teacher.class),username,passwd);

        if (list.size() == 0)
            return false;
        else
            return true;
    }

    // 新增教师
    public int addTeacher(Teacher teacher)
    {
        String sql = "insert into teachers values(?,?,?,?,1)";
        return jdbcTemplate.update(sql,teacher.getId(),teacher.getName(),teacher.getSex(),Encryption.getMd5(teacher.getId()));
    }
}
