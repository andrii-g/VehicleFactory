package factory;

/**
 * Created by User on 05.02.2017.
 */
public class MotorcycleDucati extends Motorcycle {

    private String name = "Ducati";
    private String country = "Italy";

    @Override
    public String getDescription() {
        return name + " " + country;
    }

}
