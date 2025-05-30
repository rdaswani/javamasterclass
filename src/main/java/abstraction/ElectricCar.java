package abstraction;

public class ElectricCar extends Car{

    @Override
    void startEngine() {
        System.out.println("Electric car starts with very minimal noise");
    }
}
