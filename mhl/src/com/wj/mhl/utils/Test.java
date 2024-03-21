package com.wj.mhl.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author wj
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws SQLException {
//        System.out.println("输入");
//        int i = Utility.readInt();
//        System.out.println(i);

//        DruidDataSource dataSource = new DruidDataSource();
//
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/db01?rewriteBatchedStatements=true");
//        dataSource.setUsername("root");
//        dataSource.setPassword("wang123456");
//        Connection conn = dataSource.getConnection();


        Connection connection = JDBCUtilsByDruid.getConnection();
        System.out.println(connection);
    }
}
