//*********************************************************
//  Author: Steven Smail
//
//  Car.java
//
//  Represents a car.
//*********************************************************
import java.util.Scanner;

public class Car
{
    // Instance variables
    private String make;
    private String model;
    private int year;	

    //------------------------------------------------------
    // Constructor - Use file scanner to set up a car object
    // by initializing the make, model, and year.
    //------------------------------------------------------
    public Car(Scanner carScanner)
    {
            make = carScanner.nextLine();
            model = carScanner.nextLine();
            year = carScanner.nextInt();
            carScanner.nextLine(); // Clear new line
    }

    //-----------------------------------------------------
    // Constructor - sets up a car object by initializing 
    // the make, model, and year.
    //-----------------------------------------------------
    public Car(String newMake, String newModel, int newYear)
    {
        make = newMake;
        model = newModel;
        year = newYear;
    }
   
    //----------------------------------------------------------  
    // Method isAntique that takes no parameter. The method 
    // should compute and return true if the car is more than 25
    // years old, and false if otherwise.
    //----------------------------------------------------------
    public boolean isAntique()
    {
        if (2016 - year > 25)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    //------------------------------------------------------
    // Returns a string representation of a car.
    //------------------------------------------------------
    public String toString()
    {
        return year + " " + make + " " + model;
    }
}