package com.example.zboss.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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

    @TableId(type = IdType.AUTO)
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
