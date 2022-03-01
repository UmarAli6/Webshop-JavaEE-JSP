package userInterface;

import repository.ProductDB;

import java.util.Collection;
/**
 * Class representing product to be used in the presentation layer.
 *
 * @author Umar A & Rabi S
 */
public class ProductInfo {
    private int pId;
    private String name;
    private String price;
    private int stock;

    public ProductInfo(int pId, String name, String price, int stock) {
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
        return price;
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
        String info = name + "    " + price +"    "+ stock +"\n";
        return info;
    }
}
