package Course;

public class InPersonCourse extends Course {
    private String classroom;
    private String meetingTime;

    public InPersonCourse(String code, String name, int credits, String classroom, String meetingTime) {
        super(code, name, credits);
        this.classroom = classroom;
        this.meetingTime = meetingTime;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getMeetingTime() {
        return meetingTime;
    }
}
