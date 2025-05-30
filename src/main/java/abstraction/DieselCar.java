package abstraction;

public class DieselCar extends Car{
    @Override
    void startEngine() {
        System.out.println("Diesel car is noisy when started");
    }
}
