package OOP.Polymorphism;

public class Main {
    void useCar(Car car){
        car.driving();
        System.out.println(car.getNumOfSeets());
    }
    public static void main(String[] args) {
        Main main = new Main();
        Car car = new Toyota();
        main.useCar(car);
    }
}
