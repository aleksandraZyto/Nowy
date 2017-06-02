package mypackage.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class BmwCarFactory implements CarFactory {

    @Override
    public Car buildCar(String model) {
        Car car = null;
        if(model.equals("m5")){
            Engine audiEngine = new Engine(200, 304, "diesel");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new BMW("a3",audiEngine, audiWheels);
        }else if(model.equals("cost")){
            Engine audiEngine = new Engine(240, 9000, "diesel");
            Wheels audiWheels = new Wheels(18, "winter");
            car = new BMW("tt",audiEngine, audiWheels);
        }else if(model.equals("ble")){
            Engine audiEngine = new Engine(210, 700, "gas");
            Wheels audiWheels = new Wheels(18, "summer");
            car = new BMW("a3",audiEngine, audiWheels);
        }
        return car;
    }
}
