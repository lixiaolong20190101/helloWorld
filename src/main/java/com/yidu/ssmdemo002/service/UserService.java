package com.yidu.ssmdemo002.service;

import com.yidu.ssmdemo002.bean.UserInfo;
import com.yidu.ssmdemo002.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @auth: yidu
 * @date:2021/4/14 -10:02
 * @version:1.0
 **/
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public UserInfo login(String userName,String userPass){
       return userDao.login(userName, userPass);
    }

    public String add(UserInfo userInfo){
        int add = userDao.add(userInfo);
        return  add>0?"新增成功！":"新增失败";
    }

    public List<UserInfo> selectAll(){
      return   userDao.selectAll();
    }
}
