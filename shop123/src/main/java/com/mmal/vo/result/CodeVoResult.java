package com.mmal.vo.result;

import com.mmal.common.vo.CommonVoResult;

/**
 * Description:
 *
 * @author wangyf
 * @date 2019/4/8
 */
public class CodeVoResult extends CommonVoResult {

    /**
     * 返回得验证码
     */
    private String VerificationCode;

    public String getVerificationCode() {
        return VerificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        VerificationCode = verificationCode;
    }

}
