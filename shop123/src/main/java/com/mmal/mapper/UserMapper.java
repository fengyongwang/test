package com.mmal.mapper;

import com.mmal.po.data.User;
import com.mmal.po.request.UserPoRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description:user mapper层
 *
 * @author wangyf
 * @date 2019/4/2
 */
@Repository
@Mapper
public interface UserMapper {


    /**
     * 根据ids去查
     * @param ids 主键id的集合
     * @return
     */
    List<User> queryUserById(List<Integer> ids);

    /**
     * 根据相关条件去查User
     * @param userPoRequest 入参参数
     * @return
     */
    List<User> queryUserByRequest(UserPoRequest userPoRequest);

    /**
     * 根据条件查找所有的user的数量
     * @param userPoRequest 入参
     * @return
     */
    int queryAllUserCount(UserPoRequest userPoRequest);

    /**
     * Add user
     * @param userPoRequest
     * @return
     */
    int insertUser(UserPoRequest userPoRequest);
}
