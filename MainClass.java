package factory;

/**
 * Created by User on 05.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        VehicleFactory italianVehicleFactory = new ItalianVehicleFactory();
        VehicleFactory japaneseVehicleFactory = new JapaneseVehicleFactory();

        System.out.println("Italian Factory: ");
        showFactory(italianVehicleFactory);

        System.out.println("Japanese Factory: ");
        showFactory(japaneseVehicleFactory);
    }

    public static void showFactory(VehicleFactory vehicleFactory){
        Car car = vehicleFactory.createCar();
        System.out.println(car.getDescription());

        Motorcycle motorcycle = vehicleFactory.createMotorcycle();
        System.out.println(motorcycle.getDescription());
        System.out.println();
    }
}
