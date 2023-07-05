package com.example.zboss.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yhr
 * @date 2023/7/5-10:59
 */
@Data
public class ShopUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * 商户openid
     */
    private Long shopOpenId;

    /**
     * 商户手机号
     */
    private String shopPhone;

    /**
     * 登录密码
     */
    private String password;

    public ShopUser() {}

}
