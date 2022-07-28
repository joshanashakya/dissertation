

// Java program for aliquot sum 
import java.io.*; 
  
class GFG { 
      
    // Function to calculate sum of  
    // all proper divisors 
    static int aliquotSum(int n) 
    { 
        int sum = 0; 
        for (int i = 1; i < n; i++)  
            if (n % i == 0)  
                sum += i; 
                  
        return sum;  
    } 
      
    // Driver Code 
    public static void main(String args[]) 
                           throws IOException 
    { 
        int n = 12; 
        System.out.println(aliquotSum(n)); 
    } 
} 
  
/* This code is contributed by Nikita Tiwari.*/

