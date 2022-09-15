
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class db {

    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "rad_library";
    private static Integer portnumber = 3306;
    private static String password = "";

    public static Connection getConnection() throws SQLException {
        Connection cnx = null;

        MysqlDataSource datasource = new MysqlDataSource();

        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);

        cnx = datasource.getConnection();

        return cnx;
    }

}
