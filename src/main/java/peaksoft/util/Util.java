package peaksoft.util;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@Test
public class Util {
      // реализуйте настройку соеденения с БД
    private final String url = "jdbc:postgresql://localhost:5432/jdbc_hw";
    private final String username = "postgres";
    private final String password = "737899k";

    public Connection getConnection() {
        // ushul methodko connection kaitarynyzdar
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the Postgre SQL server successfully." );
        } catch (SQLException e) {
            System. out.println(e.getMessage() + "Tuura emes jazyp jatasyn ") ;
        }
        return connection;
    }

}
