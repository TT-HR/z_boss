package com.example.z_boss.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yhr
 * @date 2023/7/5-9:33
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 微信openid
     */
    private String openId;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 微信名
     */
    private String wxName;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 上次登录时间
     */
    private Date updateDate;

    public User() {
    }

}
