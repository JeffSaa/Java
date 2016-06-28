package javatutorial;

import java.util.Scanner; // Import the lib

public class JavaTutorial {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in); // This object we'll use later
        
        // Ask for user's data
        System.out.print("Your name here: ");
        String name = read.nextLine();
        System.out.print("Your age here: ");
        int years = read.nextInt();
        
        // Show the data
        System.out.println("Hello "+name+", you have "+years+" years old.");
        
    }    
    
}