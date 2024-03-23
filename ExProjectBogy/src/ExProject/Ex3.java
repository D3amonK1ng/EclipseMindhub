package ExProject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex3 {
	public static void main(String[] args) {
		String words = "Hello. Hello. How are you? I'm ok. You? I'm ok.";
		String[] sameWord = words.split(" ");
		Set<String> hahs = new HashSet<>();
		hahs = Arrays.stream(sameWord).collect(Collectors.toSet());
		System.out.println(hahs);
		
//		List<String> oneWord = new ArrayList<>();
//		oneWord.add(sameWord[0]);
//		for (int i = 0; i < sameWord.length; i++) {
//			if(!oneWord.contains(sameWord[i])) {
//				oneWord.add(sameWord[i]);
//			}
//		}
//		System.out.println(oneWord);
	}
	
}
