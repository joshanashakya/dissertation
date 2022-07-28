

// Java program to print pattern 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
  
public class GeeksforGeeks 
{  
  
  public static void StarPattern(int height) 
  { 
      
    // This loop prints number of rows 
    for (int i=0; i<height; i++ ) 
    { 
        // For every row, first '*' will be printed  
        // Height-rowNumber times. 
        for (int j = height-1; j>i; j--) 
        { 
            System.out.print("*"); 
        } 
          
        // Print character '*' and Row number alternately 
        // boolean variable to decide whether to print char or int 
        boolean printChar = false; 
          
        for (int j = 0; j< ((i*2) +1); j++) 
        { 
            if ( printChar ) 
            { 
                System.out.print("*");                  
            } 
            else
            { 
            System.out.print(i + 1); 
            } 
            // Each time after printing char or int  
            // reverse the boolean variable to print alternatively  
                printChar = !printChar; 
            } 
            // After printing char and int, it will print '*' 
            for (int j = height-1; j>i; j--) 
            { 
                System.out.print("*"); 
            } 
              
            System.out.println(); 
        } 
        } 
          
    // Driver Code 
    public static void main(String args[]) 
    { 
       int height = 7; 
       StarPattern(height); 
    } 
} 

