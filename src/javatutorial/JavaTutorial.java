package javatutorial;

import java.util.ArrayList;
import java.util.Scanner;
import model.Car;

public class JavaTutorial {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        ArrayList<Car> cars = new ArrayList<>(); // Create a car's arraylist
        
        for(int i = 0; i<4; i++){ // Ask for data
            System.out.print("Owner here: ");
            String owner;
            owner = read.nextLine();
            System.out.print("Id here: ");
            String id = read.nextLine();
            System.out.print("Years here: ");
            int year = read.nextInt();
            System.out.print("Km here: ");
            float km = read.nextFloat();
            read.nextLine();
            Car car = new Car(owner,id,year,km); // First create a car
            
            cars.add(car); // And save in arraylist            
        }
        
        // Now write the ArrayList(one way to do)
        System.out.println("-----Car's owners-----");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i+1)+") "+cars.get(i).getOwner());
        }
        
    }
    
}