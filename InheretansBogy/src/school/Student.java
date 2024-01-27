package school;

import java.time.LocalDate;
import java.util.ArrayList;

import person.Person;

public class Student extends Person {
	private int studentID;
	private Class clazz;
	private ArrayList<Grade> grades;
	
	public Student(String name, double weight, LocalDate birthDate, int studentID, Class clazz) {
		super(name, weight, birthDate);
		this.studentID = studentID;
		this.clazz = clazz;
		grades = new ArrayList<>();
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public Class getClazz() {
		return clazz;
	}
	
	public ArrayList<Grade> getGrades() {
		return grades;
	}
}
