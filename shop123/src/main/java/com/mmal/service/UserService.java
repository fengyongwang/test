package com.mmal.service;

import com.mmal.bo.request.UserBoRequest;
import com.mmal.bo.result.UserBoResult;
import com.mmal.common.bo.CommonBoResult;

/**
 * Description:user service层
 *
 * @author wangyf
 * @date 2019/4/2
 */
public interface UserService {

    /**
     * 用户登录
     * @param userBoRequest
     * @return
     */
    UserBoResult login(UserBoRequest userBoRequest);

    /**
     * 用户注册
     * @param userBoRequest
     * @return
     */
    CommonBoResult userRegistered(UserBoRequest userBoRequest);
}
