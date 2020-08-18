package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author prathmeshkumarsaini on 18/08/20
 */
public class DbConnection {
    static Connection con;

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software", "root", "");
        } catch (Exception e) {

        }
        return con;
    }
}
