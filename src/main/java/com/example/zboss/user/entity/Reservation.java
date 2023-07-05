package com.example.zboss.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yhr
 * @date 2023/7/5-11:01
 */
@Data
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * 预约门店id
     */
    private Long shopId;

    /**
     * 预约门店名称
     */
    private String shopName;

    /**
     * 到店时间
     */
    private Date comeTime;

    /**
     * 服务人员
     */
    private String shopClerk;

    /**
     * 预约人
     */
    private String userName;

    /**
     * 预约人手机号
     */
    private Long userPhone;

    /**
     * 人数
     */
    private Long userNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 预约状态（0进行中 1结束 2取消）
     */
    private int status;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 服务项目id(暂时不用
     */
    private Long projectId;

    /**
     * 服务项目
     */
    private String projectName;

    public Reservation() {}
}
