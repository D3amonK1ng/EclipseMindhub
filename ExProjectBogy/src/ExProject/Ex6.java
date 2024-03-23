package ExProject;

import java.util.List;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

public class Ex6 {
	public static void main(String[] args) {
		List<String> words;
		words = List.of("Hey", "Never", "Always", "Hello", "Bye", "Hyped");
		double theAverageCharecters = words.stream()
				.mapToInt(value -> value.length())
				.average()
				.getAsDouble();
		System.out.println("The Average Charecters in this words is:" + theAverageCharecters);
;	}
	
}
