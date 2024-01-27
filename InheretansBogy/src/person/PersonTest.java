package person;

import java.time.LocalDate;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("Ivancho", 60, LocalDate.of(2005, 6, 7));
		person.sayHello();
	}
}
