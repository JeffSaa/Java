package javatutorial;

public class JavaTutorial {
    
    public static void main(String[] args) {
        
        sayHello(); // Call a subroutine
        
        int result = calSum(5,3); // Call a function
        System.out.println(result);
    
    }
    
    public static void sayHello(){
        System.out.println("Hello!!!");
    }
    
    public static int calSum(int x, int y){
        int r = x+y;
        return r; // Return a value
    }
    
}