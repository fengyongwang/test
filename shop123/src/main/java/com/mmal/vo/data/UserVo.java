package com.mmal.vo.data;

import lombok.Data;

import java.util.Date;

/**
 * Description:user 信息得vo类
 *
 * @author wangyf
 * @date 2019/4/8
 */
@Data
public class UserVo {
    /**
     * 用户编号
     */
    private Integer uid;

    /**
     * 用户名
     */
    private String uname;

    /**
     * 登录密码
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
