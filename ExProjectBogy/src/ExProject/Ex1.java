package ExProject;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex1 {
	public static  void main(String[] args) {
		List<Integer> list;
		list = List.of(2, 3, 4, 5, 9, 10, 12, 15);
		List<Integer> EvenInt = list.stream()
				.filter(lister -> lister % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(EvenInt);
	}
	
	public static List<Integer> getEvenInt(List<Integer> list){
		return null;
	}
	
	
}
