package com.VD.tools;

/**
 * Created by vd on 2017/2/23.
 */
public class SqlTools
{

    private String create_UserInfoSql =
            "create table if not exists User_Info\n" +
                    "(\n" +
                    "  id int(6) auto_increment,\n" +
                    "  userName text NOT NULL ,\n" +
                    "  avatarUrl text NOT NULL ,\n" +
                    "  token text NOT NULL ,\n" +
                    "  phone text unque NOT NULL ,\n" +
                    "  passWord text NOT NULL ,\n" +
                    "  PRIMARY KEY(id),\n" +
                    "  WechatOpenId text\n" +
                    ")auto_increment=600000;";






}
