package Exercise.BT5.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyClient {
    public static void main(String[] args) {
        List<ClothingItem> products = new ArrayList<>();
        products.add(new ClothingItem("TShirt", 200, "shirt.jpg"));
        products.add(new ClothingItem("Jean pant", 500, "jeans.jpg"));
        products.add(new ClothingItem("Sport shoe", 800, "shoes.jpg"));

        for (ClothingItem item : products) {
            item.showInfo();
        }

        System.out.println("User want display full first item information:\n");
        products.get(0).showInfo();
        products.get(0).showImage();
    }
}
