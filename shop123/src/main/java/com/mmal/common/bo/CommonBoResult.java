package com.mmal.common.bo;

import com.mmal.common.constant.ResultConstant;

import java.io.Serializable;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/4/2
 */
public class CommonBoResult implements Serializable {

    /**
     * 表示返回结果的状态（成功、延时等等）
     */
    private int status;


    /**
     * 表示当前查询的数量
     */
    private int count;

    /**
     * 表示查询的总数
     */
    private long totalCount;

    /**
     * 表示出现的异常
     */
    private Exception exception;

    /**
     * 异常信息
     */
    private String message;

    /**
     * 返回页码数，在进行查询时，通过该参数可以让客户端知道该次的数据返回的是第几页的内容。
     */
    private int page;

    /**
     * 构造一个新的Result实例,当前处于默认的未处理状态.
     */
    public CommonBoResult() {
        this.message = ResultConstant.MESSAGE.DEFAULT_ERROR_MESSAGE;
        this.status = ResultConstant.CODE.ERROR;
    }

    /**
     * 判断是否失败
     * @return 判断结果
     */
    public boolean isFailed() {
        return this.status != ResultConstant.CODE.SUCCESS;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isSuccess() {
        return this.getStatus() == ResultConstant.CODE.SUCCESS;
    }
}
