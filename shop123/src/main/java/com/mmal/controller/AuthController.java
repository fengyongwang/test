package com.mmal.controller;

import com.mmal.bo.request.UserBoRequest;
import com.mmal.bo.result.UserBoResult;
import com.mmal.common.bo.CommonBoResult;
import com.mmal.common.constant.RequestConstant;
import com.mmal.common.constant.ResultConstant;
import com.mmal.common.convert.ConvertManager;
import com.mmal.common.util.MmalCommonUtil;
import com.mmal.common.vo.CommonVoResult;
import com.mmal.service.UserService;
import com.mmal.vo.request.UserVoRequest;
import com.mmal.vo.result.CodeVoResult;
import com.mmal.vo.result.UserVoResult;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/4/2
 */
@RestController
@RequestMapping(value = "/admin/mmal", method = RequestMethod.POST)
@Log4j
public class AuthController {


    @Resource
    private ConvertManager convertManager;

    @Resource
    private UserService userService;

    /**
     * 去登录时     验证码看不清
     *
     * @param request
     * @return
     */
    @RequestMapping("/toLogin")
    public CodeVoResult generateVerificationCode(HttpServletRequest request) {
        CodeVoResult codeVoResult = new CodeVoResult();
        try {
            String code = MmalCommonUtil.randomCode();
            request.getSession().setAttribute(RequestConstant.code.key, code);
            codeVoResult.setCode(ResultConstant.CODE.SUCCESS);
            codeVoResult.setMessage(ResultConstant.MESSAGE.DEFAULT_SUCCESS_MESSAGE);
            codeVoResult.setVerificationCode(code);
        } catch (Exception e) {
            log.error("generateVerificationCode failed time :" + new Date());
        }
        return codeVoResult;
    }


    /**
     * 用户登录
     *
     * @param request
     * @param userVoRequest
     * @return
     */
    @RequestMapping("/login")
    public UserVoResult userLogin(HttpServletRequest request, UserVoRequest userVoRequest) {
        UserVoResult userVoResult = new UserVoResult();

        if (userVoRequest.getVerificationCode() == null || userVoRequest.getVerificationCode().equals("")) {
            userVoResult.setFailedReason("验证码为空，请输入验证码！");
            return userVoResult;
        }

        if (request.getSession().getAttribute(RequestConstant.code.key) == null) {
            userVoResult.setFailedReason("验证码不存在，请重新刷新验证码");
            return userVoResult;
        }
        if (!userVoRequest.getVerificationCode().equals(request.getSession().getAttribute(RequestConstant.code.key))) {
            userVoResult.setFailedReason("验证码错误，请重新输入");
            return userVoResult;
        }

        UserBoRequest userBoRequest = convertManager.tran(userVoRequest, UserBoRequest.class);
        UserBoResult userBoResult = userService.login(userBoRequest);
        if (userBoResult.isSuccess()) {
            userVoResult = convertManager.tran(userBoResult, UserVoResult.class);
            userVoResult.setCode(ResultConstant.CODE.SUCCESS);
            userVoResult.setMessage(ResultConstant.MESSAGE.DEFAULT_SUCCESS_MESSAGE);

            if(userVoResult.getLists().size()==1){
                request.getSession().setAttribute(RequestConstant.code.userKey,userVoResult.getLists().get(0));
            }

        }

        return userVoResult;
    }

    @RequestMapping("/registered")
    public CommonVoResult userRegistered(UserVoRequest userVoRequest) {
        CommonVoResult commonVoResult = new CommonVoResult();
        UserBoRequest userBoRequest = convertManager.tran(userVoRequest, UserBoRequest.class);

        CommonBoResult commonBoResult = userService.userRegistered(userBoRequest);
        if (commonBoResult.isSuccess()) {
            commonVoResult.setCode(ResultConstant.CODE.SUCCESS);
            commonVoResult.setMessage(ResultConstant.MESSAGE.DEFAULT_SUCCESS_MESSAGE);
        }

        return commonVoResult;
    }

}
