package CarWash;

import java.util.*;

public class CarWash {
    private int id;
    private int slots;
    private double cash;
    private List<Order> activeOrders;
    private List<Order> completedOrders;
    private Set<Service> services;

    public CarWash(int id, int slots) {
        this.id = id;
        this.slots = slots;
        this.cash = 0;
        this.activeOrders = new ArrayList<>();
        this.completedOrders = new ArrayList<>();
        this.services = new HashSet<>();
    }

    public void addService(Service service) {
        services.add(service);
    }

    public void addOrder(Automobile automobile, Set<Service> services) throws Exception {
        if (activeOrders.size() >= slots) {
            throw new Exception("No available slots for a new order.");
        }

        int orderId = activeOrders.size() + 1;
        Order newOrder = new Order(orderId, automobile, services);
        activeOrders.add(newOrder);
    }

    public void completeOrder(int id) {
        Order order = findActiveOrderById(id);
        if (order != null) {
            double totalPrice = order.calculateTotalPrice();
            cash += totalPrice;
            completedOrders.add(order);
            activeOrders.remove(order);
        }
    }

    public String getOverview() {
        Map<String, Integer> serviceCountMap = new HashMap<>();
        Map<String, Integer> carTypeCountMap = new HashMap<>();

        for (Order order : completedOrders) {
            for (Service service : order.getServices()) {
                serviceCountMap.put(service.getName(), serviceCountMap.getOrDefault(service.getName(), 0) + 1);
                carTypeCountMap.put(((Automobile) order.getAutomobile()).getModel(), carTypeCountMap.getOrDefault(((Automobile) order.getAutomobile()).getModel(), 0) + 1);
            }
        }

        StringBuilder overview = new StringBuilder();
        for (Map.Entry<String, Integer> entry : serviceCountMap.entrySet()) {
            overview.append(entry.getKey()).append(" - ").append(entry.getValue()).append("\n");
            for (Map.Entry<String, Integer> carTypeEntry : carTypeCountMap.entrySet()) {
                overview.append(carTypeEntry.getKey()).append(" - ").append(carTypeEntry.getValue()).append("\n");
            }
        }

        return overview.toString();
    }

    private Order findActiveOrderById(int id) {
        for (Order order : activeOrders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }
}
