package com.yidu.ssmdemo002.dao;

import com.yidu.ssmdemo002.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @auth: yidu
 * @date:2021/4/14 -9:44
 * @version:1.0
 **/
@Mapper
@Repository
public interface UserDao {
    /**
     * 登录
     * @param userName
     * @param userPass
     * @return 用户对
     */
    public UserInfo login(String userName,String userPass);

    public int add(UserInfo userInfo);
    /**
     * 查询所有
     */
    public List<UserInfo> selectAll();
}
