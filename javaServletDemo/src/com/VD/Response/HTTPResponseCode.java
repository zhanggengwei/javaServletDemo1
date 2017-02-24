package com.VD.Response;

/**
 * Created by vd on 2017/2/24.
 */
public interface HTTPResponseCode
{

    String responseSucessCode = "200";//访问成功
    String responsePhoneOrPassWord = "401";//账号密码错误
    String responseUserNotExits = "300";//用户不存在
    String responseUserIsExits = "400";//用户已经存在 注册
    String responseUserTokenError = "402";//token 错误
}
