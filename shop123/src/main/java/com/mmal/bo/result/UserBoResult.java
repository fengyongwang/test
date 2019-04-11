package com.mmal.bo.result;

import com.mmal.common.bo.CommonBoResult;
import com.mmal.vo.data.UserVo;

import java.util.List;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/4/2
 */
public class UserBoResult extends CommonBoResult {

    /**
     * 返回得结果集
     */
    private List<UserVo> lists;

    public List<UserVo> getLists() {
        return lists;
    }

    public void setLists(List<UserVo> lists) {
        this.lists = lists;
    }
}
