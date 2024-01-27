package school;

public class Grade {
	private Subject subject;
	private GradeValue value;
	
	public Grade(Subject subject, GradeValue value) {
		this.subject = subject;
		this.value = value;
	}
	
	public Subject getSubject() {
		return subject;
	}
	
	public GradeValue getValue() {
		return value;
	}
}
