package com.mmal.dao.impl;

import com.mmal.common.constant.ResultConstant;
import com.mmal.common.po.CommonPoResult;
import com.mmal.dao.UserDao;
import com.mmal.mapper.UserMapper;
import com.mmal.po.data.User;
import com.mmal.po.request.UserPoRequest;
import com.mmal.po.result.UserPoResult;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Description:UserDao 实现类
 *
 * @author wangyf
 * @date 2019/4/2
 */
@Component("userDao")
@Log4j
public class UserDaoImpl implements UserDao {


    @Resource
    private UserMapper userMapper;


    @Override
    public UserPoResult login(UserPoRequest userPoRequest) {

        UserPoResult userPoResult = new UserPoResult();
        try {
            List<User> lists = userMapper.queryUserByRequest(userPoRequest);
            userPoResult.setCount(ResultConstant.CODE.SUCCESS);
            userPoResult.setMessage(ResultConstant.MESSAGE.DEFAULT_SUCCESS_MESSAGE);

            if (lists != null) {
                userPoResult.setValues(lists);
                userPoResult.setCount(lists.size());
                userPoResult.setTotalCount(lists.size());
            }
            if (userPoRequest.isPaging()) {
                userPoResult.setTotalCount(userMapper.queryAllUserCount(userPoRequest));
            }


        } catch (Exception e) {
            log.error("Exception happened at query User By condition when : " + new Date(), e);

        }
        return userPoResult;
    }

    @Override
    public CommonPoResult userRegistered(UserPoRequest userPoRequest) {
        CommonPoResult commonPoResult = new CommonPoResult();
        try {
            int i = userMapper.insertUser(userPoRequest);
            if(i==1){
                commonPoResult.setCount(ResultConstant.CODE.SUCCESS);
                commonPoResult.setMessage(ResultConstant.MESSAGE.DEFAULT_SUCCESS_MESSAGE);
            }else{
                log.error("insert user failed  at userDaoImpl when : "+new Date());
            }

        } catch (Exception e) {
            log.error("Exception happened at insert User when :" + new Date(), e);
        }

        return commonPoResult;
    }
}
