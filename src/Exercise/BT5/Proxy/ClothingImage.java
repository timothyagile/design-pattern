package Exercise.BT5.Proxy;

public class ClothingImage implements ClothingService{
    private String fileName;
    private long fileSize;

    public ClothingImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    void loadFromDisk() {
        System.out.println("Disk::Loading image::" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Display::Show image::" + fileName);
    }
}
