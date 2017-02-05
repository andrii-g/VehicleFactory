package factory;

/**
 * Created by User on 05.02.2017.
 */
public class JapaneseVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new CarMitsubishi();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleYamaha();
    }
}
