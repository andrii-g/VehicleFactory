package factory;

/**
 * Created by User on 05.02.2017.
 */
public class CarLamborghini extends  Car{
    private String name = "Lamborghini";
    private String country = "Italy";

    @Override
    public String getDescription() {
        return name + " " + country;
    }
}
