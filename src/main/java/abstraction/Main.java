package abstraction;

public class Main {

    public static void main(String[] args) {

        Car myElectricCar = new ElectricCar();
        myElectricCar.startEngine();
        myElectricCar.stopEngine();

        Car myDieselCar = new DieselCar();
        myDieselCar.startEngine();
        myDieselCar.stopEngine();



    }
}
