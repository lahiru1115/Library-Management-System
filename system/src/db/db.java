package db;


import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class db {

    public static Connection getConnection() throws SQLException {
        Connection cnx;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName("localhost");
        datasource.setUser("root");
        datasource.setPassword("");
        datasource.setDatabaseName("rad_library_v1");
        datasource.setPortNumber(3306);

        cnx = datasource.getConnection();

        return cnx;
    }

}
