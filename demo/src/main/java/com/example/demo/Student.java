package com.example.demo;

/**
 * Created by Administrator on 2016/7/10 0010.
 */
public class Student {
    private String name;
    private String classname;
    private int type;

    public Student(){}
    public Student(String name, String classname, int type) {
        this.name = name;
        this.classname = classname;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
