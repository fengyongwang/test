package com.mmal.bo.request;

import com.mmal.common.bo.CommonBoRequest;
import lombok.Data;

import java.util.Date;

/**
 * Description:user 的 BO类
 *
 * @author wangyf
 * @date 2019/4/2
 */
@Data
public class UserBoRequest extends CommonBoRequest {

    /**
     * 用户id
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
     * 用户状态
     */
    private Integer state;
    /**
     * 性别
     */
    private String sex;

    /**
     * 创造时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
