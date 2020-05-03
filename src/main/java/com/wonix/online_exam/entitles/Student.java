package com.wonix.online_exam.entitles;

import org.springframework.stereotype.Repository;

@Repository
public class Student
{
    private String id; // 学号
    private String name; // 姓名
    private int sex; // 性别
    private String team; // 班级
    private String password; // 密码

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
