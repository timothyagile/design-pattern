package Exercise.BT3.AdapterPattern;

public class OnlineCoursesAdapter implements Courses{
    private OnlineCourses onlineCourses;

    public OnlineCoursesAdapter(OnlineCourses onlineCourse) {
        this.onlineCourses = onlineCourse;
    }

    @Override
    public void start() {
        onlineCourses.joinSession();
    }

    @Override
    public String getDetail() {
        return onlineCourses.viewTimeTable();
    }
}
