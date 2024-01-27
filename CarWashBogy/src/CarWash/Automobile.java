package CarWash;

public class Automobile {
    private String maker;
    private String model;
    private double priceMultiplier;

    public Automobile(String maker, String model, double priceMultiplier) {
        this.maker = maker;
        this.model = model;
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
    
    public String getModel() {
		return model;
	}
}
