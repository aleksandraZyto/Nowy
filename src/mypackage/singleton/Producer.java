package mypackage.singleton;

/**
 * Created by RENT on 2017-06-02.
 */
public class Producer {
    public static void addValue(String value){
        Queue.getInsatance().push(value);
    }
}
