package com.mmal.dao;

import com.mmal.common.po.CommonPoResult;
import com.mmal.po.request.UserPoRequest;
import com.mmal.po.result.UserPoResult;

/**
 * Description:user Dao层
 *
 * @author wangyf
 * @date 2019/4/2
 */
public interface UserDao {

    /**
     * 用户登录
     * @param userPoRequest  登录的po类
     * @return
     */
    UserPoResult login(UserPoRequest userPoRequest);

    /**
     * 用户注册
     * @param userPoRequest  注册的po类
     * @return
     */
    CommonPoResult userRegistered(UserPoRequest userPoRequest);
}
