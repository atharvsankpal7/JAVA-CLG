package Experiment8;

//The "Vehicle" class:
//This class should have instance variables such as "brand" and "year" to store the brand
//name and manufacturing year of a vehicle.
//It should have a constructor to initialize these variables.
//It should also have a method named "displayInfo()" that prints the brand and year of
//the vehicle.
//The "Car" class:
//
//This class should inherit from the "Vehicle" class.
//It should have an additional instance variable called "model" to store the model name
//of the car.
//It should have a constructor to initialize the "brand", "year", and "model" variables.
//
//Override the "displayInfo()" method to include the model name when printing the
//information.
//
//The "ElectricCar" class:
//This class should inherit from the "Car" class.
//It should have an additional instance variable called "batteryCapacity" to store the
//battery capacity of the electric car.
//It should have a constructor to initialize the "brand", "year", "model", and
//"batteryCapacity" variables.
//Override the "displayInfo()" method to include the battery capacity when printing the
//information.
//Your task is to implement the above classes and create an object of the "ElectricCar"
//class. You should then call the "displayInfo()" method on the object to print the brand,
//year, model, and battery capacity of the electric car using the "super" keyword
//appropriately at each level of inheritance

class Vehicle {
    String brand;
    int year;

    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Model : " + model);
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity : " + batteryCapacity + " units");
    }
}

public class _question5 {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tata",2022,"SUV",32000);
        ec1.displayInfo();
    }
}
