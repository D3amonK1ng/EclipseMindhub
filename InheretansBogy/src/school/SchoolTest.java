package school;

import java.time.LocalDate;

public class SchoolTest {
	public static void main(String[] args) {
		Student student = new Student("Goshko", 60.0, LocalDate.of(2008, 6, 7), 8, new Class(8, 'г'));
		student.sayHello();
		System.out.println(student.getStudentID());
		System.out.println(student.getClazz());
	}
	
}
