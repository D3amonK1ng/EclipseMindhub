package Course;

import java.util.ArrayList;

public class CourseCatalog {
    private ArrayList<Course> courses;

    public CourseCatalog() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course Credits: " + course.getCourseCredits());
            System.out.println("------------------------");
        }
    }
}
