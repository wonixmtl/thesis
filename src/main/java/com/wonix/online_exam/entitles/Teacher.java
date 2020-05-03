package com.wonix.online_exam.entitles;

import org.springframework.stereotype.Repository;

@Repository
public class Teacher
{
    private String id; // 工号
    private String name; // 姓名
    private int sex; // 性别
    private String password; // 密码
    private int enable; // 权限

    public Teacher(){}

    public Teacher(String id, String name, int sex, String password)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.enable = 1;
    }

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

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getEnable()
    {
        return enable;
    }

    public void setEnable(int enable)
    {
        this.enable = enable;
    }
}
