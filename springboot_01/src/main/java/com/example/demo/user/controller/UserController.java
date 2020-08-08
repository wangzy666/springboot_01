package com.example.demo.user.controller;


import com.example.demo.user.entity.User;
import com.example.demo.user.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-15
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}

