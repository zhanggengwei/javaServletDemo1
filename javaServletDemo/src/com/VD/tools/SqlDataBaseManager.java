package com.VD.tools;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Created by vd on 2017/2/24.
 */
public class SqlDataBaseManager
{
    private Statement statement = null;
    private Connection connection = null;
    private static  SqlDataBaseManager instace = null;

    private SqlDataBaseManager() throws SQLException
    {
        this.connection = SqlDataBaseManager.getConnection();
        this.statement = this.connection.createStatement();
    }
    private static SqlDataBase getConnectionBase()
    {

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/manager.properties"));
        }catch (IOException e)
        {
            e.printStackTrace();
        }

        String url = properties.getProperty("url");
        String user_name = properties.getProperty("sqlDataBaseUser");
        String passWord = properties.getProperty("sqlDataBasePassWord");
        System.out.println("url" + url + "user_name" + user_name + "passWord" + passWord);


        return new SqlDataBase(url,user_name,passWord);
    }

    private static Connection getConnection()
    {

        Connection connection = null;
        try {

            Class.forName("com.jdbc.mysql.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        SqlDataBase baseInfo = getConnectionBase();
        try {
            connection = DriverManager.getConnection(baseInfo.sql_url,baseInfo.user_name,baseInfo.pass_word);

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
    public static SqlDataBaseManager GetInstance() throws SQLException
    {
        if(SqlDataBaseManager.instace==null)
        {
            synchronized (SqlDataBaseManager.class)
            {
                SqlDataBaseManager.instace =
                        new SqlDataBaseManager();
            }
        }
        return SqlDataBaseManager.instace;
    }
    private static class  SqlDataBase
    {

        private String user_name = null;
        private String pass_word = null;
        private String sql_url = null;
        public SqlDataBase(String  url,String user_name,String pass_word)
        {
              this.sql_url = url;
              this.user_name = user_name;
              this.pass_word = pass_word;
        }
        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getPass_word() {
            return pass_word;
        }

        public void setPass_word(String pass_word) {
            this.pass_word = pass_word;
        }

        public String getSql_url() {
            return sql_url;
        }

        public void setSql_url(String sql_url) {
            this.sql_url = sql_url;
        }

    }
}
