package mypackage.singleton;

/**
 * Created by RENT on 2017-06-02.
 */
public class Consumer {
    public static void processValue(){
        Queue queue = Queue.getInsatance();
        System.out.println("Next value is: "+ queue.pop());
    }
}
