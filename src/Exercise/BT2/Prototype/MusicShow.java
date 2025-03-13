package Exercise.BT2.Prototype;

public class MusicShow extends Entertainment{
    MusicShow (String title, String type, int duration) {
        super(title, type, duration);
    }

    MusicShow (MusicShow target) {
        super(target);
    }



    @Override
    public Entertainment clone() {
        return new MusicShow(this);
    }
}
