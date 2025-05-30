package abstraction;

abstract class Car {

    abstract void startEngine();

    void stopEngine(){
        System.out.println("this comment is from generic method from abstract class");
    }
}
