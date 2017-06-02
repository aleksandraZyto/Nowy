package mypackage.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by RENT on 2017-06-02.
 */
public class AbstractCarFactory {

    private Map<CarFactoriesEnums, CarFactory> factories;

    public AbstractCarFactory(){
        this.factories = new HashMap<>();
        initFactories();
    }

    public Car buildAudiCar(String model){
        return buildCAr(CarFactoriesEnums.AUDI, model);
    }

    public Car buildBmwCar(String model){
        return buildCAr(CarFactoriesEnums.BMW, model);
    }

    public Car buildMercedesCar(String model){
        return buildCAr(CarFactoriesEnums.MERCEDES, model);
    }

    private void initFactories(){
        factories.put(CarFactoriesEnums.BMW, new BmwCarFactory());
        factories.put(CarFactoriesEnums.AUDI, new AudiCarFactory());
        factories.put(CarFactoriesEnums.MERCEDES, new MercedesCarFactory());
    }

    private Car buildCAr(CarFactoriesEnums type, String model){
        return factories.get(type).buildCar(model);
    }

}
