

// Java program to validate a number 
import java .io.*; 
  
public class GFG { 
  
// Function to validate number (Check if 
// frequency of a digit is less than the 
// digit itself or not) 
static boolean validate(long n) 
{ 
    for (int i = 0; i < 10; i++) 
    { 
        long temp = n;  
        int count = 0; 
        while (temp > 0) 
        { 
            // If current digit of  
            // temp is same as i 
            if (temp % 10 == i) 
                count++; 
  
            // if frequency is greater than  
            // digit value, return false 
            if (count > i) 
                return false; 
  
            temp /= 10; 
        } 
    } 
    return true; 
} 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
            long n = 1552793; 
        if (validate(n)) 
            System.out.println("True"); 
        else
            System.out.println("False"); 
    } 
} 
  
// This code is contributed by vt_m. 

