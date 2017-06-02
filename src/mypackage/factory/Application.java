package mypackage.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Application {

    public static void main(String[] args) {

        AbstractCarFactory abstractCarFactory = new AbstractCarFactory();
        Car car = abstractCarFactory.buildAudiCar("a3");
        Car car2 = abstractCarFactory.buildBmwCar("a3");
        Car car3 = abstractCarFactory.buildMercedesCar("a3");



    }
}
