class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year){
        this.brand=brand;
        this.year=year;
    }

    void display(){
        System.out.println("Car brand: "+ brand);
        System.out.println("Year of manufacture: "+ year);
    }
}
class Car extends Vehicle {
    int Seats;
    Car(String brand, int year, int Seats){
        super(brand, year);
        this.Seats=Seats;

    }
    void displayCar(){
        System.out.println("Number of seats: "+ Seats);
    }
}
public class CarHire {
    public static void main(String[] args) {
        Car car= new Car("Mercedes", 2020, 5);

        System.out.println("Car Details!");
        car.display();
        car.displayCar();
    }
}