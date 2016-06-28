package javatutorial;

import java.util.Scanner;

import model.Car; // Import the class, it is in other package

public class JavaTutorial {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        // Ask for the data
        System.out.print("Owner here: ");
        String owner = read.nextLine();
        System.out.print("Id here: ");
        String id = read.nextLine();
        System.out.print("Years here: ");
        int years = read.nextInt();
        System.out.print("Km here: ");
        float km = read.nextFloat(); // Decimal in Java is with <<,>>
        
        // Create the car
        Car first_object = new Car(owner,id,years,km);
        
        System.out.println("You have a new car!!!");
    
    }    
    
}