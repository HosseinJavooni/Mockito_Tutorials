package com.mockitoStudy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
//    private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String DB_DRIVER_CLASS = "oracle.jdbc.OracleDriver";
    private static final String DB_USERNAME = "MOCKITOUSER";
    private static final String DB_PASSWORD = "mockito";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/HOSSEINTESTDB?useSSL=false&serverTimzone=UTC&useLegacyDatetimeCode=false";
    private static Connection connection = null;
    static{
        try {
            Class.forName(DB_DRIVER_CLASS);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return connection;
    }
}
/**
 * spring.datasource.url=jdbc:oracle:thin:@//localhost:1521/LIETNERBOX?useSSL=false&serverTimzone=UTC&useLegacyDatetimeCode=false
 * spring.datasource.username=lietner
 * spring.datasource.password=hossein
 * spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
 *
 * #Hibernate config
 * spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
 */
