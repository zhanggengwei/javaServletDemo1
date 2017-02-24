package com.VD.Response;

import com.VD.bean.UserInfo;

/**
 * Created by vd on 2017/2/24.
 */
public class UserInfoResponse extends HTTPResponse
{

    private UserInfo info = null;

    public UserInfo getInfo() {
        return info;
    }

    public void setInfo(UserInfo info) {
        this.info = info;
    }



}
