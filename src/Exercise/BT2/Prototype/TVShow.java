package Exercise.BT2.Prototype;

public class TVShow extends Entertainment{
    TVShow (String title, String type, int duration) {
        super(title, type, duration);
    }

    TVShow (TVShow target) {
        super(target);
    }



    @Override
    public Entertainment clone() {
        return new TVShow(this);
    }
}
