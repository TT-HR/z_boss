package com.example.z_boss.user.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.z_boss.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yhr
 * @date 2023/7/5-9:40
 */
@Mapper
public interface UserService extends BaseMapper<User> {
}
