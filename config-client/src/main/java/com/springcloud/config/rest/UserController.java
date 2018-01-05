package com.springcloud.config.rest;

import com.springcloud.config.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author luoxuri
 * @create 2017-12-06 15:49
 **/
@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Resource
    private UserService userService;

    @Value("${foo}")
    String foo;

    @Value("${themis.user.default}")
    String handSomeMan;

    @GetMapping(value = "/username")
    public String getUserName(){
        return userService.userName();
    }

    @GetMapping(value = "/foo")
    public String hello(){
        return foo;
    }

    @GetMapping(value = "/who")
    public String man(){
        return handSomeMan;
    }

}
