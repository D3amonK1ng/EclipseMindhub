package person;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Person {
	private String name;
	private int age;
	private double weight;
	private LocalDate birthDate;
	
	public Person(String name, double weight, LocalDate birthDate) {
		this.name = name;
		this.weight = weight;
		this.birthDate = birthDate;
		age = (int) Period.between(birthDate, LocalDate.now()).get(ChronoUnit.YEARS);
	}
	
	public int getAge() {
		return age;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void sayHello() {
		System.out.printf("Hello, my name is %s and I am %d years old.%n", name, age);
		
	}
}
