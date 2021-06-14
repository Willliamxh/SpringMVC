package com.bjpowernode.controller.vo;

/**
 * @author Willam_xh
 * @create 2021-06-12 9:34
 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
