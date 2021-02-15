//***************************************************
//  Car_Test.java
//
//  A test driver for class Car.
//***************************************************
import java.util.Scanner;

public class Car_Test
{
//-----------------------------------------------
// Creates a car object and then calls the 
// isAntique method.
//-----------------------------------------------
    public static void main (String[] args)
    {
        String carMake;
        String carModel;
        int carYear;

        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the make of the car: ");
        carMake = scan.nextLine();

        System.out.print ("Enter the model of the car: ");
        carModel = scan.nextLine();

        System.out.print ("Enter the year of the car: ");
        carYear = scan.nextInt();

        // Create a car object 
        Car car1 = new Car(carMake, carModel, carYear);
        System.out.println();

        // Print summary for the car 
        System.out.println(car1);
        System.out.println();

        if (car1.isAntique())
        {
            System.out.println("This car is an antique");
            System.out.println();
        }
        else
        {
            System.out.println("This car is not an antique");
            System.out.println();
        }
    }
}
