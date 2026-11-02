import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

        static Connection getConnection() throws SQLException {

            return DriverManager.getConnection("jdbc:postgresql://localhost:1234/postgres", "postgres" , "1234");
        }
    }

