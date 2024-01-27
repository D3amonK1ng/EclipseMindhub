package Course;

public class Course {
    private String courseCode;
    private String courseName;
    private int courseCredits;

    public Course(String code, String name, int credits) {
        this.courseCode = code;
        this.courseName = name;
        this.courseCredits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseCredits() {
        return courseCredits;
    }
}