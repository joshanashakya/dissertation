

// Java program to find number  
// of digits in 2^n 
import java.util.*; 
  
class Gfg  
{ 
    // Function to find number of digits 
    // in 2^n 
    static int countDigits(int n) 
    { 
        return (int)(n * Math.log10(2) + 1); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 5; 
        System.out.println(countDigits(n)); 
    } 
} 
  
// This code is contributed by Niraj_Pandey. 

