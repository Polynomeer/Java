package functional;

public class Van extends Car {

    public Van(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void drive() {
        System.out.println("Driving a van " + name + " from " + brand);
    }
}
