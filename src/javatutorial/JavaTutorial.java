package javatutorial;

import java.util.Scanner;
import model.Car;

public class JavaTutorial {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Car car = new Car("Jeff","abc123",2016,10000); // First create a car
        
        System.out.print("New owner here: ");
        String owner = read.nextLine();
        System.out.print("New id here: ");
        String id = read.nextLine();
        System.out.print("New years here: ");
        int year = read.nextInt();
        System.out.print("New km here: ");
        float km = read.nextFloat();
        
        // Now change the values
        car.setId(id);
        car.setOwner(owner);
        car.setKm(km);
        car.setYear(year);
        
        // Write new data
        System.out.println("----You new car's data----");
        System.out.println("Owner: "+car.getOwner());
        System.out.println("Id: "+car.getId());
        System.out.println("Year: "+car.getYear());
        System.out.println("Km: "+car.getKm());
       
    }
    
}