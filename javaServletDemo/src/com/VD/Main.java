package com.VD;

import com.VD.tools.SqlDataBaseManager;

import java.sql.SQLException;

/**
 * Created by vd on 2017/2/24.
 */
public class Main
{
    public static void  main(String args[]) throws SQLException
    {
        System.out.println("hellow");

        SqlDataBaseManager manager = SqlDataBaseManager.GetInstance();


    }
}
