/* Writea generic base class called Vehicle that stores number of wheels and speed. Create two
derived classes, Car and Truck. The Car class inherits Vehicle and also stores number of
passengers. The Truck class also inherits Vehicle and stores the load limit. Write a main() function to create objects of these classes and display all the information about Car and
Truck. Als0, compare the speed of the two vehicles, Car and Truck and display "faster" or
"slower" if Car is faster or slower than Truck.  */

// Base class
class Vehicle {
    int no_of_wheel;
    double speed;

    Vehicle(int wheel, double spd) {
        no_of_wheel = wheel;
        speed = spd;
    }

    void display_info() {
        System.out.println("No of Wheels: " + no_of_wheel);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Derived class - Car
class Car extends Vehicle {
    int no_passengers;

    Car(int wheel, double spd, int passengers) {
        super(wheel, spd);
        no_passengers = passengers;
    }

    @Override
    void display_info() {
        super.display_info();
        System.out.println("No of Passengers: " + no_passengers);
    }
}

// Derived class - Truck
class Truck extends Vehicle {
    int load_limit;

    Truck(int wheel, double spd, int load) {
        super(wheel, spd);
        load_limit = load;
    }

    @Override
    void display_info() {
        super.display_info();
        System.out.println("Load Limit: " + load_limit + " kg");
    }
}

// Main class with main method
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(4, 120.0, 6);
        Truck t1 = new Truck(14, 100.34, 12000);

        System.out.println("Car Info:");
        c1.display_info();
        System.out.println();

        System.out.println("Truck Info:");
        t1.display_info();
        System.out.println();
        
        if(c1.speed>t1.speed)
        {
            System.out.println("Car is faster");
        }
        else
        {
            System.out.println("Truck is fater");
        }
    }
}
