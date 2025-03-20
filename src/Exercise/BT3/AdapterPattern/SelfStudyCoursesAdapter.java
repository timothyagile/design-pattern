package Exercise.BT3.AdapterPattern;

public class SelfStudyCoursesAdapter  implements Courses {
    private SelfStudyCourses selfStudyCourses;

    public SelfStudyCoursesAdapter(SelfStudyCourses selfStudyCourse) {
        this.selfStudyCourses = selfStudyCourse;
    }

    @Override
    public void start() {
        selfStudyCourses.accessMaterial();
    }

    @Override
    public String getDetail() {
        return selfStudyCourses.getDeadline();
    }
}
