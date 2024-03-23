package ExProject;

import java.util.List;

public class Ex2 {
	public static  void main(String[] args) {
		List<Integer> list;
		list = List.of(2, 3, 4, 5, 9, 10, 12, 15);
		int SumInt = list.stream()
				.mapToInt(i -> i.intValue())
				.sum();
		
		System.out.println(SumInt);
	}
	
	public static List<Integer> getSumInt(List<Integer> list){
		return null;
	}
}
	