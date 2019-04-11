package com.mmal.common.constant;

/**
 * 封装了和Restult相关的常量
 *
 * @author 唐庆适
 *
 * @date 2015年1月5日
 *
 */
public final class ResultConstant {

    /**
     * 封装了所有Result对应的状态
     *
     * @author 唐庆适
     *
     * @date 2015年1月5日
     *
     */
    public final static class CODE {

        /**
         * 表示成功
         */
        public static final int SUCCESS = 200;

        /**
         * 表示失败
         */
        public static final int ERROR = 400;

        /**
         * 表示没有权限
         */
        public static final int UNAUTH = 600;

        /**
         * 用户未登录
         */
        public static final int NOLOGIN = 800;

    }

    /**
     * 封装了Result对应的信息
     *
     * @author 唐庆适
     *
     * @date 2015年1月5日
     *
     */
    public final static class MESSAGE {

        /**
         * 处理成功的默认消息.
         */
        public static final String DEFAULT_SUCCESS_MESSAGE = "业务处理成功.";

        /**
         * 处理失败的默认消息.
         */
        public static final String DEFAULT_ERROR_MESSAGE = "业务处理失败.";

        /**
         * 处理空数据的默认消息.
         */
        public static final String DEFAULT_NOT_FOUND_MESSAGE = "没有找到对应记录.";

        /**
         * 处理缺少参数的默认消息.
         */
        public static final String DEFAULT_MISS_PARAM_MESSAGE = "业务操作缺少参数.";

        /**
         * 未登录的消息
         */
        public static final String DEFAULT_NOLONIN_MESSAGE = "用户未登陆,请先登录!";

        /**
         * 系统级错误预定义消息.
         */
        public static final String DEFAULT_SYSTEM_ERROR_MESSAGE = "系统无法处理当前操作.";

        /**
         * 未登录的消息，英语
         */
        public static final String DEFAULT_NOLONIN_MESSAGE_EN = "user is no login, please login...";

        /**
         * 没权限的消息，英语
         */
        public static final String DEFAULT_NOAUTH_MESSAGE_EN = "user is unauthorized...";
    }

}
