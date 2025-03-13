package Exercise.BT2.Prototype;

public class Film extends Entertainment{

    Film (String title, String type, int duration) {
        super(title, type, duration);
    }

    Film (Film target) {
        super(target);
    }



    @Override
    public Entertainment clone() {
        return new Film(this);
    }
}
