package com.example.banksystem.conService;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("Employee")
public class EmployeeInformation {
    @TableId("employeeid")
    public String employeeid;
    public String name;
    public int gender;
    public String phone;
    public String employeerank;
    public String employeepwd;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public void setEmployeepwd(String employeepwd) {
        this.employeepwd = employeepwd;
    }

    public void setEmployeerank(String employeerank) {
        this.employeerank = employeerank;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public String getEmployeepwd() {
        return employeepwd;
    }

    public String getEmployeerank() {
        return employeerank;
    }
}
