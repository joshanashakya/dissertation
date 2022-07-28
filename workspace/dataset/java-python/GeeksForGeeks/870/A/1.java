

// Java Program to check if a number can 
// be expressed as sum of five consecutive 
// integer. 
import java.io.*; 
  
class GFG { 
  
    // function to check if a number can 
    // be expressed as sum of five  
    // consecutive integers. 
    static void checksum(int n) 
    { 
        // if n is multiple of 5 
        if (n % 5 == 0) 
            System.out.println( (n / 5 - 2) 
                  + " " + (n / 5 - 1) + " "
                  + (n / 5) + " " + (n / 5 
                + 1 ) + " " + (n / 5 + 2)); 
      
        // else print "-1". 
        else
            System.out.println( "-1"); 
    } 
      
    // Driver Program 
    public static void main (String[] args) 
    { 
        int n = 15; 
        checksum(n); 
    } 
} 
  
// This code is contributed by vt_m. 

