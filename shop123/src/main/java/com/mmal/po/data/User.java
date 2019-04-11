package com.mmal.po.data;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * Description:  user主表信息
 *
 * @author wangyf
 * @date 2019/4/2
 */
@Data
@ToString
public class User {
    /**
     * 主键
     */
    private Integer uid;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 密码
     */
    private String upwd;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 性别
     */
    private String sex;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
