
package businessObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import userInterface.ProductInfo;
/**
 * Implements methods for accessing the database product table.
 *
 * @author Umar A & Rabi S
 */
public class ProductHandler {
    public static Collection<ProductInfo> fetchInventory(){
        Collection c = Product.fetchInventory();
        return getProductInfos(c);
    }

    public static Collection<ProductInfo> fetchCart(int uId){
        Collection c = Product.fetchCart(uId);
        return getProductInfos(c);
    }

    private static Collection<ProductInfo> getProductInfos(Collection c) {
        List<ProductInfo> cart = new ArrayList<>();
        for (Iterator it = c.iterator(); it.hasNext(); ) {
            Product p = (Product) it.next();
            cart.add(new ProductInfo(p.getpId(),p.getName(),p.getPrice(),p.getStock()));
        }
        return cart;
    }
}
