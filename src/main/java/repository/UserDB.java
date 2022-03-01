package repository;

import java.sql.*;
import java.util.Collection;
import java.util.Vector;
/**
 * Implements methods for accessing the database user table.
 *
 * @author Umar A & Rabi S
 */
public class UserDB extends businessObjects.User {

    public static Collection validateUsers(String username, String password) {
        Vector vUser = new Vector();

        try {
            Connection con = DBmanager.getConnection();
            PreparedStatement pSt = con.prepareStatement("SELECT * FROM t_user where username = ? and password = ?");

            pSt.setString(1, username);
            pSt.setString(2, password);
            ResultSet res = pSt.executeQuery();

            if (res.next()) {
                vUser.addElement(new UserDB(res.getInt("uId"), res.getString("username"), res.getString("password")));

            } else {
                return new Vector();
            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return vUser;
    }

    public static boolean addToCart(int uId, int pId) {
        try{
            Connection con = DBmanager.getConnection();
            PreparedStatement pSt = con.prepareStatement("INSERT INTO t_cart (uId, pId) VALUES (?,?)");
            pSt.setInt(1,uId);
            pSt.setInt(2,pId);
            pSt.execute();
            return true;
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    private UserDB(int uId, String username, String password) {
        super(uId, username, password);
    }
}
