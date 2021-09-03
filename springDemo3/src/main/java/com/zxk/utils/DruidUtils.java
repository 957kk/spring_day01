package com.zxk.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @program: JDBC_ONE
 * @description:
 * @author: zhaoxuekai
 * @GitHub: 9527mmm
 * @Create: 2021-08-10 17:24
 **/
public class DruidUtils {

    private DruidUtils() {
    }

    private static DataSource dataSource = null;

    static {
        InputStream is = DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        Properties prop = new Properties();
        try {
            prop.load(is);
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() throws SQLException {
        return dataSource;
    }

    public static Connection getConnection()  {

        try {
            Connection con = dataSource.getConnection();
            System.out.println(con);
            return con;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn, Statement statement, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }

    public static void close(Connection conn, Statement statement) {

        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
    }
}
