package GasStation;

import java.sql.Date;
import java.util.List;

public class Receipt {
	 	private List<Product> products;
	    private List<Discount> discounts;
	    private double totalPrice;
	    Date currentDate = new Date(0);

	    public Receipt(List<Product> products, List<Discount> discounts, double totalPrice) {
	        this.products = products;
	        this.discounts = discounts;
	        this.totalPrice = totalPrice;
	    }


	    public void generateReceipt() {
	    	
	        System.out.println("Date: " + currentDate);
	        for (Product product : products) {
	            System.out.println(product.getName() + " / " + product.getQuantity() + " / " + product.getPrice());
	        }
	        for (Discount discount : discounts) {
	            System.out.println("-" + discount.getName() + " / " + discount.getAmount());
	        }
	        System.out.println("Total / " + totalPrice);
	    }
	    
	    public Date getCurrentDate() {
			return currentDate;
		}

		public List<Product> getProducts() {
			return products;
		}

		public List<Discount> getDiscounts() {
			return discounts;
		}

		public double getTotalPrice() {
			return totalPrice;
		}
	

		public void setProducts(List<Product> products) {
			this.products = products;
		}

		public void setDiscounts(List<Discount> discounts) {
			this.discounts = discounts;
		}

		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}
}
