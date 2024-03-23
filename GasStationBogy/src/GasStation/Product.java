package GasStation;

public class Product {

		private String Quantity; 
		private String name;
	 	private int code;
	    private double price;
	    private String unit;
	    private BuyThings buyThings;

	    public Product(int code, double price, String unit, BuyThings buyThings) {
	        this.code = code;
	        this.price = price;
	        this.unit = unit;
	        this.buyThings = buyThings;
	    }
	    
	    public String getQuantity() {
			return Quantity;
		}
	    
	    public void setQuantity(String quantity) {
			Quantity = quantity;
		}
	    
	    public String getName() {
			return name;
		}

		public int getCode() {
			return code;
		}

		public double getPrice() {
			return price;
		}

		public String getUnit() {
			return unit;
		}

		public BuyThings getBuyThings() {
			return buyThings;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void setCode(int code) {
			this.code = code;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public void setBuyThings(BuyThings buyThings) {
			this.buyThings = buyThings;
		}

	    
	  
}	
