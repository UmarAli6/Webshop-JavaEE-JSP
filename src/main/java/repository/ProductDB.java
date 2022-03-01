package repository;

import java.sql.*;
import java.util.Collection;
import java.util.Vector;
/**
 * Implements methods for accessing the database product table.
 *
 * @author Umar A & Rabi S
 */
public class ProductDB extends businessObjects.Product {

    public static Collection fetchInventory() {
        Vector vProducts = new Vector();
        try {
            Connection con = DBmanager.getConnection();
            Statement st = con.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM t_product");

            vProducts = getVector(vProducts, res);

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return vProducts;
    }

    public static Collection fetchCart(int uId){
        Vector vCart = new Vector();
        try {
            Connection con = DBmanager.getConnection();
            PreparedStatement pSt = con.prepareStatement("SELECT t_cart.pId, name, price, stock " +
                                                                "FROM t_product, t_cart " +
                                                                "WHERE t_cart.pId = t_product.pId AND t_cart.uId = ?");
            pSt.setInt(1, uId);
            ResultSet res = pSt.executeQuery();
            vCart = getVector(vCart, res);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return vCart;
    }

    private static Vector getVector(Vector vector, ResultSet res) throws SQLException {
        while (res.next()) {
            int pId = res.getInt("pId");
            String name = res.getString("name");
            String price = res.getString("price");
            int stock = res.getInt("stock");
            vector.addElement(new ProductDB(pId, name, price, stock));
        }
        return vector;
    }

    private ProductDB(int pId, String name, String price, int stock) {
        super(pId, name, price, stock);
    }
}
