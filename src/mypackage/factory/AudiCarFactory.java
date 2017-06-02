package mypackage.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class AudiCarFactory implements CarFactory {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("a3")){
            Engine audiEngine = new Engine(200, 304, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new Audi("a3",audiEngine, audiWheels);
        }else if(model.equals("tt")){
            Engine audiEngine = new Engine(240, 9000, "diesel");
            Wheels audiWheels = new Wheels(18, "winter");
            car = new Audi("tt",audiEngine, audiWheels);
        }else if(model.equals("s3")){
            Engine audiEngine = new Engine(210, 700, "gas");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new Audi("a3",audiEngine, audiWheels);
        }
        return car;
    }
}
