package school;

import java.time.LocalDate;
import java.util.ArrayList;

import person.Person;

public class Teacher extends Person{
	private Subject subject;
	private ArrayList<Class> classes;
	
	public Teacher(String name, double weight, LocalDate birthDate) {
		super(name, weight, birthDate);
		this.classes = classes;
		this.subject = subject;
	}
	
	public ArrayList<Class> getClasses() {
		return classes;
	}
	
	public Subject getSubject() {
		return subject;
	}
	 public void giveGrade(Student student, Grade grade) {
		 student.getGrades().add(grade);
		 
	 }
}
