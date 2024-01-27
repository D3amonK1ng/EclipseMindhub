package Course;

public class OnlineCourse extends Course {
    private String videoURL;
    private int durationInWeeks;

    public OnlineCourse(String code, String name, int credits, String videoURL, int duration) {
        super(code, name, credits);
        this.videoURL = videoURL;
        this.durationInWeeks = duration;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }
}