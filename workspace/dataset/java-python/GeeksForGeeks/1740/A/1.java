

// Java program to find first occurrence 
// of c in a/b 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
    // Function to print the first digit 
    public static int first(int a, int b, int c) 
    { 
        // Reduce the number to its mod 
        a %= b; 
  
        // Traverse for every decimal places 
        for (int i = 1; i <= b; i++)  
        { 
            // Get every fraction places 
            // when (a*10/b)/c 
            a = a * 10; 
          
            // Check if it is equal to  
            // the required integer 
            if (a / b == c) 
                return i; 
          
            // Mod the number 
            a %= b; 
        } 
        return -1; 
    } 
      
    // Driver function 
    public static void main(String argc[]){ 
        int a = 1, b = 4, c = 5; 
        System.out.println(first(a, b, c)); 
    } 
      
} 
/* This code is contributed by Sagar Shukla */

