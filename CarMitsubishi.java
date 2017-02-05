package factory;

/**
 * Created by User on 05.02.2017.
 */
public class CarMitsubishi extends Car {
    private String name = "Mitsubishi";
    private String country = "Japan";

    @Override
    public String getDescription() {
        return name + " " + country;
    }
}
