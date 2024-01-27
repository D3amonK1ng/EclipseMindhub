package CarWash;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        CarWash carWash = new CarWash(1, 3);

        Service exteriorWash = new Service("Exterior wash", 10);
        Service interiorVacuum = new Service("Interior vacuum", 15);

        carWash.addService(exteriorWash);
        carWash.addService(interiorVacuum);

        Automobile car = new Automobile("Toyota", "Corolla", 1);
        Automobile suv = new Automobile("Ford", "Explorer", 1.5);

        Set<Service> carServices = new HashSet<>(Arrays.asList(exteriorWash, interiorVacuum));
        Set<Service> suvServices = new HashSet<>(Collections.singletonList(exteriorWash));

        try {
            carWash.addOrder(car, carServices);
            carWash.addOrder(suv, suvServices);
            carWash.addOrder(car, suvServices);
        } catch (Exception e) {
            e.printStackTrace();
        }

        carWash.completeOrder(1);
        carWash.completeOrder(2);

        System.out.println(carWash.getOverview());
    }
}