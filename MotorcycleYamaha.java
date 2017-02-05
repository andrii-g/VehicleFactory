package factory;

/**
 * Created by User on 05.02.2017.
 */
public class MotorcycleYamaha extends Motorcycle{
    private String name = "Yamaha";
    private String country = "Japan";

    @Override
    public String getDescription() {
        return name + " " + country;
    }
}
