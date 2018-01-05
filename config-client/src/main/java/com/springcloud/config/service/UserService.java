package com.springcloud.config.service;

import com.springcloud.config.dao.UserDao;
import com.springcloud.config.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author luoxuri
 * @create 2017-12-06 16:05
 **/
@Service
public class UserService {
    @Resource private UserDao userDao;

    public String userName(){
        User user = userDao.findOne(1L);
        return user.getName();
    }
}
