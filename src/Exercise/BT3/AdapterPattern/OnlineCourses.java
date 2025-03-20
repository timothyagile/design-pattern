package Exercise.BT3.AdapterPattern;

import javax.sound.midi.SysexMessage;

public class OnlineCourses {
    public void joinSession() {
        System.out.println("You was join an online session!");
    }

    public String viewTimeTable() {
        return "Online course timetable: Tuesday & Thursday";
    }
}
