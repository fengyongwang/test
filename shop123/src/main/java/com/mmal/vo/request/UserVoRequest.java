package com.mmal.vo.request;

import com.mmal.common.vo.CommonVoRequest;
import lombok.Data;

import java.util.Date;

/**
 * Description: user vo类
 *
 * @author wangyf
 * @date 2019/4/2
 */
@Data
public class UserVoRequest extends CommonVoRequest {

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
    /**
     * 验证码
     */
    private String verificationCode;
}
