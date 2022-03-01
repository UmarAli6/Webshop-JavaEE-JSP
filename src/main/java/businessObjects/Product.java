package businessObjects;

import java.util.Collection;
import repository.ProductDB;
/**
 * An representation of the product.
 *
 * @author Umar A & Rabi S
 */
public class Product {
    private int pId;
    private String name;
    private String price;
    private int stock;

    static public Collection fetchInventory(){
        return ProductDB.fetchInventory();
    }

    static public Collection fetchCart(int uId){
        return ProductDB.fetchCart(uId);
    }

    public Product(int pId, String name, String price, int stock) {
        this.pId = pId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price+" kr";
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", stock=" + stock +
                '}';
    }
}


