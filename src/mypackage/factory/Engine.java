package mypackage.factory;

/**
 * Created by RENT on 2017-06-02.
 */
public class Engine {
    private int capacity;
    private int horsePower;
    private String type;

    public Engine(int capacity, int horsePower, String type) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", horsePower=" + horsePower +
                ", type='" + type + '\'' +
                '}';
    }
}
