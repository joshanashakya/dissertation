

// Java implementation to count  
// number of digits in the product  
// of two numbers 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // function to count number of digits  
    // in the product of two numbers 
    static int countDigits(int a, int b) 
    { 
        int count = 0;  
          
        // absolute value of the  
        // product of two numbers 
        int p = Math.abs(a * b); 
          
        // if product is 0 
        if (p == 0)  
            return 1; 
          
        // count number of digits in 
        // the product 'p'  
        while (p > 0)  
        { 
            count++; 
            p = p / 10; 
        } 
          
        // required count of digits  
        return count; 
    } 
      
    // Driver program to test above 
    public static void main(String args[]) 
    { 
        int a = 33; 
        int b = -24; 
        System.out.println("Number of digits = "
                           + countDigits(a, b)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

