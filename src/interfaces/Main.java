package interfaces;


//  Interfaces disconnect the defintion of method from the hierarchy of inheritance  because of implementing in the subclass only the main body   
// Types of variables present in interfaces and stuff are static and  final 

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // //car.a;
        // car.acc();
        // car.start();
        // car.stop();


        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();

    }
    
}
