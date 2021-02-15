//***********************************************
//  Author: Steven Smail
//
//  CarsFromFile.java
//
//  A test driver for class Car.
//***********************************************
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class CarsFromFile
{
//------------------------------------------------
// Creates an array of car objects by using a file
// scanner and then outputs the attributes of each
// car to the screen.
//------------------------------------------------
    public static void main (String[] args)
    {
        // Declare string array
        Car[] cars = new Car[100];
        int count = 0;
        Boolean ok = false;
        
        System.out.println("This is CarsFromFile.");
        System.out.println();

        while (!ok)
        {
            System.out.print("Please enter file name: ");
            Scanner keyboardScanner = new Scanner(System.in);
            String filename = keyboardScanner.nextLine();

            try
            {
                // Create a file scanner
                File car_list = new File(filename);
                Scanner carScanner = new Scanner(car_list);

                    // Get cars from the file
                    while (carScanner.hasNext()) // Test for end of file
                    {
                        // Create a car object
                        Car car1 = new Car(carScanner);
                        // Assign array values to object
                        cars[count++] = car1;
                    }

                    System.out.println("End of file reached.");
                    System.out.println(count + " cars created.");
                    System.out.println();

                    // Print summary for the cars
                    for (int index = 0; index < count; index++)
                    {
                        System.out.println(cars[index]);
                    }
                    ok = true;
            }

            catch (FileNotFoundException ex)
            {
                System.out.println("File " + filename + " was not found");
                System.out.println("Please try again.");
            }
        }

        System.out.println();
        System.out.println("Program Complete.");
        System.out.println();
    }
}