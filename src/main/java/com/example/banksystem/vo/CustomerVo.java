package com.example.banksystem.vo;

public class CustomerVo {
    public String personid;
    public String name;
    public int gender;
    public String phone;
    public String address;
    public String passwd;

    public String getPersonid() {
        return personid;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
