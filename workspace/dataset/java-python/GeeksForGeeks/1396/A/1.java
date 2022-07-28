

// Java program to find the XOR equals OR count 
import java.io.*; 
import java.util.*; 
  
class GFG { 
  
    // Function to calculate count of numbers with XOR equals OR 
    static int xorEqualsOrCount(int N) 
    { 
        // variable to store count of unset bits 
        int count = 0; 
        int bit; 
        while (N > 0) { 
            bit = N % 2; 
            if (bit == 0) 
                count++; 
            N = N / 2; 
        } 
        return (int)Math.pow(2, count); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 7; 
        System.out.println(xorEqualsOrCount(N)); 
    } 
} 

