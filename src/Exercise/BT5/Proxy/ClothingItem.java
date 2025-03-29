package Exercise.BT5.Proxy;

public class ClothingItem {
    private String name;
    private long price;
    private ClothingService image;

    public ClothingItem(String name, long price, String imageFilename) {
        this.name = name;
        this.price = price;
        this.image = new ProxyClothingImage(imageFilename);
    }

    public void showInfo() {
        System.out.println("Clothing::" + name + "\nPrice::" + price);
    }

    public void showImage() {
        image.display();
    }
}
