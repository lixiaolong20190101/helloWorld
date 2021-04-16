package com.yidu.ssmdemo002.bean;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @auth: yidu
 * @date:2021/4/14 -9:31
 * @version:1.0
 **/
@Component
public class UserInfo {
    private int userid;
    private String username;
    private String userpass;
    private String compellation;
    private int  state;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getCompellation() {
        return compellation;
    }

    public void setCompellation(String compellation) {
        this.compellation = compellation;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", compellation='" + compellation + '\'' +
                ", state=" + state +
                '}';
    }
}
