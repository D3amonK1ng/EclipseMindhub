package ExProject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex5two {
	 public static void main(String[] args) {
	        List<Ex5> products = Arrays.asList(
	            new Ex5("Laptop", "Electronics"),
	            new Ex5("Television", "Electronics"),
	            new Ex5("T-shirt", "Clothing"),
	            new Ex5("Jeans", "Clothing"),
	            new Ex5("Smartphone", "Electronics"),
	            new Ex5("Sneakers", "Shoes")
	        );

	        Map<String, List<Ex5>> groupedProducts = products.stream()
	            .collect(Collectors.groupingBy(Ex5::getCategory));


	        groupedProducts.forEach((category, productList) -> {
	            System.out.println("Category: " + category);
	            productList.forEach(System.out::println);
	            System.out.println();
	        });
	    }
}
