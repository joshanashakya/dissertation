

// Java program to check for integer 
// overflow on multiplication 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    // Function to check whether there is 
    // overflow in a * b or not. It  
    // returns true if there is overflow. 
    static Boolean isOverflow( long a, long b) 
    { 
        // Check if either of them is zero 
        if (a == 0 || b == 0)  
            return false; 
      
        long result = a * b; 
        if (a == result / b) 
            return false; 
        else
            return true; 
    } 
      
    // driver function 
    public static void main(String argc[]) 
    { 
        long a = Long.parseLong("10000000000"); 
        long b = Long.parseLong("-10000000000");  
          
        if (isOverflow(a, b)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
    } 
} 
  
// This code is contributed by Prerna Saini 

