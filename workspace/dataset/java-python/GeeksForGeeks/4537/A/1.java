

// Java program to print first n numbers 
// with exactly two set bits 
import java.io.*; 
  
class GFG  
{ 
    // Function to print first n numbers with two set bits 
    static void printTwoSetBitNums(int n) 
    { 
        // Initialize higher of two sets bits 
        int x = 1; 
   
        // Keep reducing n for every number 
        // with two set bits 
        while (n > 0) 
        { 
            // Consider all lower set bits for 
            // current higher set bit 
            int y = 0; 
            while (y < x) 
            { 
                // Print current number 
                System.out.print(((1 << x) + (1 << y)) +" "); 
   
                // If we have found n numbers 
                n--; 
                if (n == 0) 
                    return; 
   
                // Consider next lower bit for current 
                // higher bit. 
                y++; 
            } 
   
            // Increment higher set bit 
            x++; 
        } 
    } 
      
    // Driver program 
    public static void main (String[] args)  
    { 
        int n = 4; 
        printTwoSetBitNums(n); 
    } 
} 
  
// This code is contributed by Pramod Kumar 

