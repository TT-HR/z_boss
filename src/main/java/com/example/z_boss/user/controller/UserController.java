package com.example.z_boss.user.controller;

import com.example.z_boss.user.entity.User;
import com.example.z_boss.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yhr
 * @date 2023/7/5-9:42
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/users")
    public List<User> users() {
        System.out.println("success");
        return userService.selectList(null);
    }
}
