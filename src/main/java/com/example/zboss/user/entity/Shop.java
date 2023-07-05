package com.example.zboss.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yhr
 * @date 2023/7/5-10:58
 */
@Data
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * 门店管理员id
     */
    private Long shopUserId;

    /**
     * 门店名
     */
    private String shopName;

    /**
     * 门店手机号
     */
    private String shopPhone;

    /**
     * 营业时间(显示用)
     */
    private String businessTime;

    /**
     * 地址
     */
    private String address;

    /**
     * 门店头图
     */
    private String image;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 维度
     */
    private String latitude;

    public Shop() {
    }

}
