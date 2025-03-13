package Exercise.BT2.Prototype;


public abstract class Entertainment {
    String title;
    String type;
    int duration;

    public abstract Entertainment clone();

    public void ShowInfo() {
        System.out.println("Title: " + title + "\nType: " + type + "\nDuration: " + duration);
    }

    public Entertainment() {

    }

    public Entertainment(String title, String type, int duration) {
        this.title = title;
        this.type = type;
        this.duration = duration;
    }

    public Entertainment(Entertainment target) {
        this.title = target.title;
        this.type = target.type;
        this.duration = target.duration;
    }
}
