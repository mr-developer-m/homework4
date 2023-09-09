package Homework2;

class Vehicle   {
    String brand;   // it keeps the brand of the vehicle
    String model;   // it keeps the model of the vehicle
    int year;       // it keeps the production year of the car
    public Vehicle(String brand, String model, int year)  {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void start()   {   // method of the beginning the vehicle
        System.out.println("vehicle is starting");
    }
    void stop()    {    // method of the stopping the vehicle
        System.out.println("vehicle is stopping");
    }
}


class Car extends Vehicle  {
    int numDoors;
    public Car (String brand,String model, int year, int numDoors)  {
        super(brand, model, year);
        this.numDoors = numDoors;  // it keeps the number of the car doors
    }

    @Override
    void start() {
        System.out.println("car is starting");
    }

    @Override
    void stop() {
        System.out.println("car is stopping");
    }
}
class Motorcycle extends Vehicle   {
    boolean hasSidecar;
    public Motorcycle (String brand,String model, int year,boolean hasSidecar)  {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void start() {
        System.out.println("motorcycle is starting");
    }
    @Override
    void stop() {
        System.out.println("motorcycle is stopping");
    }
}
class Truck extends Vehicle   {
    double cargoCapacity;
    public Truck (String brand,String model, int year,double cargoCapacity)  {
        super(brand, model, year);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    void start() {
        System.out.println("truck is starting");
    }

    @Override
    void stop() {
        System.out.println("truck is stopping");
    }
}

public class VehiclesAndTypesOfVehicles {
    public static void main(String[] args) {
        Car c = new Car("Mercedes", "E580" ,2023, 4);
        Motorcycle m = new Motorcycle("Yamaha", "R25", 2019, false);
        Truck t = new Truck("Man", "L2000", 1998, 18.5);


        c.start();
        System.out.println("*** the car brand is: " + c.brand + " *** model is: " + c.model + " *** production year is: " + c.year
                + " *** the count of door is: " + c.numDoors);
        c.stop();

        m.start();
        System.out.println("*** the motorcycle brand is: " + m.brand + " *** model is: " + m.model + " *** production year is: " + m.year
                + " *** has the motorcycle Sidecar  " + m.hasSidecar);
        m.stop();

        t.start();
        System.out.println("*** the truck brand is: " + t.brand + " *** model is: " + t.model + " *** production year is: " + t.year
                + " *** the capacity of cargo is: " + t.cargoCapacity);


    }
}
