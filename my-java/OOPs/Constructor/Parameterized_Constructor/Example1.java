// Java Program to Illustrate working of
// Parameterized Constructor.

// Importing required input Output class

import java.io.*;

// Class 1
class Pack1 {
    // data members of the class.
    String name;
    int Id;

    // Constructor would initialize data members
    // With the values of passed arguments while
    // Object of that class created
    Pack1(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }
}

// Class 2
class Pack2 {
    // main driver method
    public static void main(String[] args) {
        // This would invoke the parameterized constructor.
        Pack1 a1 = new Pack1("Tophan", 43);
        System.out.println("Employee_Name : " + a1.name
                + " and Employee_Id : " + a1.Id);
    }
}