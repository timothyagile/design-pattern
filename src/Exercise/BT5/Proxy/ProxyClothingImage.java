package Exercise.BT5.Proxy;

public class ProxyClothingImage implements ClothingService{
    private ClothingService realImage;
    private String filename;

    public ProxyClothingImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new ClothingImage(filename);
        }
        realImage.display();
    }
}
