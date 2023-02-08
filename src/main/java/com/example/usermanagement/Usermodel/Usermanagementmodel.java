package com.example.usermanagement.Usermodel;

public class Usermanagementmodel {
    private int userid;
    private String name;
    private String username;
    private String address;
    private String phonenumber;
    public int getUserid() {
        return userid;
    }
    public Usermanagementmodel(int userid, String name, String username, String address, String phonenumber) {
        this.userid = userid;
        this.name = name;
        this.username = username;
        this.address = address;
        this.phonenumber = phonenumber;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
