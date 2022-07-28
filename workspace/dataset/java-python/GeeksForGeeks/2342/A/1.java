

// Java implementation to find the maximum 
// N-digit octal number which is perfect square 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
      
    // Function to convert decimal number  
    // to a octal number  
    static void decToOctal(int n)  
    { 
          
        // Array to store octal number  
        int octalNum[] = new int[100]; 
          
        // Counter for octal number array  
        int i = 0;  
        while (n != 0)  
        {  
      
            // Store remainder in  
            // octal array  
            octalNum[i] = n % 8;  
            n = n / 8;  
            i++;  
        }  
      
        // Print octal number array  
        // in reverse order  
        for (int j = i - 1; j >= 0; j--)  
            System.out.print(octalNum[j]);  
        System.out.println("\n"); 
    }  
      
    static void nDigitPerfectSquares(int n)  
    {  
        // Largest n-digit perfect square  
        int decimal = (int) Math.pow(Math.ceil(Math.sqrt(Math.pow(8, n))) - 1, 2);  
        decToOctal(decimal);  
    }  
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 2;  
        nDigitPerfectSquares(n);  
    } 
} 
  
// This code is contributed by nidhiva 

