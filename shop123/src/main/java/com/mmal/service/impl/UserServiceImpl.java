package com.mmal.service.impl;

import com.mmal.bo.request.UserBoRequest;
import com.mmal.bo.result.UserBoResult;
import com.mmal.common.bo.CommonBoResult;
import com.mmal.common.constant.ResultConstant;
import com.mmal.common.convert.ConvertManager;
import com.mmal.common.po.CommonPoResult;
import com.mmal.dao.UserDao;
import com.mmal.po.data.User;
import com.mmal.po.request.UserPoRequest;
import com.mmal.po.result.UserPoResult;
import com.mmal.service.UserService;
import com.mmal.vo.data.UserVo;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Description:UserService 的实现类
 *
 * @author wangyf
 * @date 2019/4/2
 */
@Service
@Log4j
public class UserServiceImpl implements UserService {

    @Resource
    private ConvertManager convertManager;
    @Resource
    private UserDao userDao;

    @Override
    public UserBoResult login(UserBoRequest userBoRequest) {
        UserPoRequest userPoRequest = convertManager.tran(userBoRequest, UserPoRequest.class);
        UserBoResult userBoResult = new UserBoResult();

        UserPoResult userPoResult = userDao.login(userPoRequest);
        if (userPoResult.isSuccess()) {

            List<User> users = userPoResult.getValues();
            List<UserVo> userVoLists = new ArrayList<>();
            users.forEach(user -> {
                UserVo userVo = convertManager.tran(user, UserVo.class);
                userVoLists.add(userVo);
            });

            userBoResult.setLists(userVoLists);
            userBoResult.setCount(ResultConstant.CODE.SUCCESS);
            userBoResult.setMessage(ResultConstant.MESSAGE.DEFAULT_SUCCESS_MESSAGE);
        }


        return userBoResult;
    }

    @Override
    public CommonBoResult userRegistered(UserBoRequest userBoRequest) {
        CommonBoResult commonBoResult = new CommonBoResult();

        if(userBoRequest.getCreateTime()==null){
            userBoRequest.setCreateTime(new Date());
        }
        if(userBoRequest.getUpdateTime()==null){
            userBoRequest.setUpdateTime(new Date());
        }
        if(userBoRequest.getState()==null){
            userBoRequest.setState(1);
        }


        UserPoRequest userPoRequest = convertManager.tran(userBoRequest, UserPoRequest.class);
        CommonPoResult commonPoResult = userDao.userRegistered(userPoRequest);
        if (commonPoResult.isSuccess()) {
            commonBoResult.setCount(ResultConstant.CODE.SUCCESS);
            commonBoResult.setMessage(ResultConstant.MESSAGE.DEFAULT_SUCCESS_MESSAGE);
        }else{
            log.error("userRegistered is failed at userServiceImpl");
        }

        return commonBoResult;
    }
}
