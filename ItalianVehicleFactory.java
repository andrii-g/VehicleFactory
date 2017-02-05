package factory;

/**
 * Created by User on 05.02.2017.
 */
public class ItalianVehicleFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        return new CarLamborghini();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleDucati();
    }
}
