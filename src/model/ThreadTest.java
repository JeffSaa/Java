package model;

public class ThreadTest extends Thread{
    
    String ms;

    public ThreadTest(String ms) {
        this.ms = ms;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.ms);
        }
    }
    
}
