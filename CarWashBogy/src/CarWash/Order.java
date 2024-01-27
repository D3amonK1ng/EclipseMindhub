package CarWash;

import java.util.Set;

public class Order {
    private int id;
    private Automobile automobile;
    private Set<Service> services;

    public Order(int id, Automobile automobile, Set<Service> services) {
        this.id = id;
        this.automobile = automobile;
        this.services = services;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Service service : services) {
            totalPrice += service.getPrice() * automobile.getPriceMultiplier();
        }
        return totalPrice;
    }

	public Service[] getServices() {
		
		return null;
	}

	public Object getAutomobile() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
