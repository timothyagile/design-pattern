package Exercise.BT3.AdapterPattern;

public class InPersonCourses implements Courses {
    @Override
    public void start() {
        attend();
    }

    @Override
    public String getDetail() {
        return getSchedule();
    }

    public void attend() {
        System.out.println("You was attended the in person class!");
    }

    public String getSchedule() {
        return "In-person class schedule: Monday & Wednesday";
    }
}




