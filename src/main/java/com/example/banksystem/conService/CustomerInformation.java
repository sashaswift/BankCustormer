package com.example.banksystem.conService;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("Customer")
public class CustomerInformation {
    @TableId("personid")
    public String personid;
    public String name;
    public int gender;
    public String phone;
    public String address;
    public String passwd;

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPersonid() {
        return personid;
    }

    public int getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getPhone() {
        return phone;
    }
}
