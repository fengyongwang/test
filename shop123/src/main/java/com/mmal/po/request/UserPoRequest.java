package com.mmal.po.request;

import com.mmal.common.po.CommonPoRequest;

import java.util.Date;
import java.util.List;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/4/2
 */
public class UserPoRequest extends CommonPoRequest {

    /**
     * 用户主键
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

    private int state;
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

    public void setState(int state) {
        this.state = state;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getState() {
        return state;
    }

    public String getSex() {
        return sex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 所有主键集合
     */
    private List<Integer> ids;


    public Integer getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

}
