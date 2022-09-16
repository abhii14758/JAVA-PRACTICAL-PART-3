//Created By 21CE013 ABHI BHIMANI
//Github Link : https://github.com/abhii14758/JAVA-PRACTICAL-PART-3

// Develop a Program that illustrate method overriding concept.

class Vehicle {
    // defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class Bike2 extends Vehicle {
    // defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }
    
}

public class practical_4 {
    public static void main(String[] args) {
        Bike2 obj = new Bike2();// creating object
        obj.run();// calling method
    }
}
