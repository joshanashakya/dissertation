

// Java program to find sum of 
// first n odd numbers 
import java.util.*; 
  
class Odd 
{    
    // Returns the sum of first 
    // n odd numbers 
    public static int oddSum(int n) 
    { 
        int sum = 0, curr = 1; 
        for (int i = 0; i < n; i++) { 
            sum += curr; 
            curr += 2; 
        } 
        return sum; 
    } 
      
    // driver function 
    public static void main(String[] args) 
    { 
        int n = 20; 
        System.out.println(" Sum of first "+ n 
        +" Odd Numbers is: "+oddSum(n)); 
    } 
} 
  
// This code is contributed by rishabh_jain 

