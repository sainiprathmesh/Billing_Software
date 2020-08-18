package dbconnection;

import java.sql.Connection;

/**
 * @author prathmeshkumarsaini on 18/08/20
 */
public class DbConnection {
    static Connection con;

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (Exception e) {

        }
        return con;
    }
}
