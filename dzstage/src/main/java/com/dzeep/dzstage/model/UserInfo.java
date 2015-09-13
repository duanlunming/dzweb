package com.dzeep.dzstage.model;

/**
 * Created by fighting on 15/9/13.
 */
public class UserInfo {
    private String userName;
    private String password;
    private String email;

    public UserInfo() {
        setUserName("hello world");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "userInfo===>userName:"+getUserName();
    }
}