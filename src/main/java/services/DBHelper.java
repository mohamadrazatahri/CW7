package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private final static String SERVER_ADDRESS = "127.0.0.1:5432";
    private final static String DBNAME = "cw7" ;
    private final static String USER = "postgres";
    private final static String PASSWORD  = "Mm5060826";



    private Connection connection;

    public Connection connect() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://" + SERVER_ADDRESS + "/" + DBNAME , USER , PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
