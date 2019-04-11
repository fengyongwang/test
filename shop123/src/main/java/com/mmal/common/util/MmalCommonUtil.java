package com.mmal.common.util;

/**
 * Description:公共方法类
 *
 * @author wangyf
 * @date 2019/4/8
 */
public class MmalCommonUtil {


    /**
     * 随机生成4个字母
     * @return
     */
    public static String randomCode(){
        StringBuffer code=new StringBuffer();
        boolean flag=true;
        //每次生成得字母
        String c="";
        while(flag){
            c=String.valueOf((char)(int)(Math.random()*26+97));
            code.append(c);
            if(code.length()>=4){
                flag=false;
            }
        }
        return code.toString();
    }
}
