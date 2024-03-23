package ExProject;

import java.util.List;

public class Ex8 {
//Да се сортират обекти от списък по даден атрибут.
	public class Person{
		String name;
		int age;
	}
	
	public static void main(String[] args) {
		List<Person> people =  Arrays.asList(
                new Person("Charlie", "26"),
                new Person("Alaster", "87"),
                new Person("Minsy", "6");
		
		System.out.println(people);
	}
}
