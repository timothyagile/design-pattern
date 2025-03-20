package Exercise.BT3.AdapterPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void  operate() {
        List<Courses> courses = new ArrayList<>();

        courses.add(new InPersonCourses());

        courses.add(new OnlineCoursesAdapter(new OnlineCourses()));

        courses.add(new SelfStudyCoursesAdapter(new SelfStudyCourses()));

        for (Courses course : courses) {
            System.out.println("\nStarting course...");
            course.start();
            System.out.println("Details: " + course.getDetail());
        }
    }
}
