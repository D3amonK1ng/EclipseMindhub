package ExProject;

import java.util.Iterator;
import java.util.List;

public class Ex2 {
	public static  void main(String[] args) {
		List<Integer> list;
		list = List.of(2, 3, 4, 5, 9, 10, 12, 15);
		int SumInt = list.stream()
				.mapToInt(i -> i.intValue())
				.sum();
		
		System.out.println(SumInt);
		
//		int[] sum = {3, 4, 5, 6, 7, 9};
//		int j = 0;
//		for (int i = 0; i < sum.length; i++) {
//			j = j + sum[i];
//		}
//		System.out.println(j);
			
		
	
		
//		int a = 10;
//		int b = 20;
//		int c = a;
//		int d = b;
//		a=d;
//		b=c;
//		System.out.println("a:" + a + " " + "b:" + b);
	}
	
//	public static List<Integer> getSumInt(List<Integer> list){
//		return null;
//	}	
}
	