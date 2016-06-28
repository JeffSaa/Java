package javatutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaTutorial {
    
    public static void main(String[] args) throws IOException {
        
        writeFile();
        readFile();
    
    }
    
    public static void writeFile() throws IOException{
        
        // Create a file
        File f;
        f = new File("MyFile.txt");
        
        // Create necesary objects
        FileWriter fr = new FileWriter(f,true); // True value means dont will erase file's previous content
        BufferedWriter bw = new BufferedWriter(fr);
        PrintWriter pw = new PrintWriter(bw);
        
        // Write
        pw.print("Same ");
        pw.print("line!!!");
        bw.newLine();
        pw.println("Hi there!");
        
        // Close
        pw.close();
        bw.close();
        fr.close();
        
    }
    
    public static void readFile() throws FileNotFoundException, IOException{
        
        // Create a file
        File f;
        f = new File("MyFile.txt");
        
        // Create necesary objects
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        // In 'line' we save a file's line and write in console
        String line;        
        while (br.ready()) {
            line = br.readLine();
             System.out.println(line);
        }
        
        // Close all
         br.close();
         fr.close();
    }
    
}