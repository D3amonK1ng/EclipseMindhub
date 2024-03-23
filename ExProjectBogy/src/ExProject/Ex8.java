package ExProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex8 {
//Да се сортират обекти от списък по даден атрибут.
	public static class Person{
		int age;
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
	}
	
	public class Main{
	
	public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());
        list.add(new Person());

        Comparator<Person> comparator = Comparator.comparing(Person::getAge);

 
        Collections.sort(list, comparator);

        for (Person obj : list) {
            System.out.println(obj.getAge());
        }
    }
}
}
