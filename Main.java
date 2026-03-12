package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static String url = "jdbc:mysql://localhost:3306/smart_security";
    static String user = "root";
    static String pass = "password";

    public static Connection getConnection(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,pass);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        return null;
    }
}