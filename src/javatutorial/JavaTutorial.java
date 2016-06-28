package javatutorial;

import model.ThreadTest;

public class JavaTutorial {
    
    public static void main(String[] args) {
        
        // Create 5 objects
        ThreadTest t1 = new ThreadTest("Test 1");
        ThreadTest t2 = new ThreadTest("Test 2");
        ThreadTest t3 = new ThreadTest("Test 3");
        ThreadTest t4 = new ThreadTest("Test 4");
        ThreadTest t5 = new ThreadTest("Test 5");
        
        // Run
        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
        
    }
    
}