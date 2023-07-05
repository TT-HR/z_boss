package com.example.zboss.user.controller;

import com.example.zboss.user.entity.User;
import com.example.zboss.user.service.UserService;
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
