package ExProject;

import java.util.List;
import java.util.stream.Collectors;

public class Ex7 {
	public static void main(String[] args) {
		List<String> words;
		words = List.of("It", "sounds", "too", "hard", "so", "sorry", "dude");
		List<String> filters = words.stream()
				.filter(value -> value.length() == 3)
				.collect(Collectors.toList());
		System.out.println(filters);
	}
	
	
}
