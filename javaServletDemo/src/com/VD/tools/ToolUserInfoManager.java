package com.VD.tools;

import com.VD.Response.HTTPResponse;
import com.VD.bean.UserInfo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by vd on 2017/2/24.
 */
public class ToolUserInfoManager
{
    private static String searchSql = "select * from User_Info where phone = ";


    public static boolean regisetr_UserInfo(UserInfo base)
    {

        String phone = base.getPhone();
        String passWord = base.getPassWord();
        String nickName = base.getUserName();
        String WeChatOpenId = base.getWeChatOpenId();
        String region = base.getRegion();
        Statement statement = null;
        try {
             statement = SqlDataBaseManager.GetInstance().getStatement();
             ResultSet resultSet = statement.executeQuery(searchSql + phone);
             if(resultSet.next())
             {
                 HTTPResponse response = new HTTPResponse();
                // response.setCode(HTTPResponseCode);
                 response.setMessage("");

             }



        }catch (SQLException e)
        {
            e.printStackTrace();
        }












        return true;

    }
}
