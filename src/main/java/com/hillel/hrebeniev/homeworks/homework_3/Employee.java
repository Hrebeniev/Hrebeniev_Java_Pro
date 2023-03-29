package com.hillel.hrebeniev.homeworks.homework_3;

public class Employee {
    private String name;
    private String job;
    private String email;
    private String phone;
    private int age;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, String job, String email, String phone, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }
}
