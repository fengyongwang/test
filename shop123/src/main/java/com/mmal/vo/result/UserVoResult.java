package com.mmal.vo.result;

import com.mmal.common.vo.CommonVoResult;
import com.mmal.vo.data.UserVo;

import java.util.List;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/4/2
 */
public class UserVoResult extends CommonVoResult {
    /**
     * 返回得结果集
     */
    private List<UserVo> lists;

    /**
     * 失败原因
     */
    private  String failedReason;

    public String getFailedReason() {
        return failedReason;
    }


    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public List<UserVo> getLists() {
        return lists;
    }

    public void setLists(List<UserVo> lists) {
        this.lists = lists;
    }

    public UserVoResult() {
    }
}
