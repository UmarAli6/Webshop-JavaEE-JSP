package repository;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Connects to the database with methods for returning instances of the connection.
 *
 * @author Umar A & Rabi S
 */
public class DBmanager {
    private static DBmanager instance = null;
    private Connection con = null;

    private static DBmanager getInstance(){
        if (instance == null){
            instance = new DBmanager();
        }
        return instance;
    }
    private DBmanager(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomdb", "root", "1234");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return getInstance().con;
    }
}
