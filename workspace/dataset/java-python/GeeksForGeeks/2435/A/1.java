

// Java program to count the numbers divisible by 
// M in a given range 
import java.io.*; 
  
class GFG { 
    // Function to count the numbers divisible by 
    // M in a given range 
    static int countDivisibles(int A, int B, int M) 
    { 
        // Add 1 explicitly as A is divisible by M 
        if (A % M == 0) 
            return (B / M) - (A / M) + 1; 
  
        // A is not divisible by M 
        return (B / M) - (A / M); 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        // A and B define the range, M is the dividend 
        int A = 30, B = 100, M = 30; 
  
        // Printing the result 
        System.out.println(countDivisibles(A, B, M)); 
    } 
} 
  
// Contirbuted by Pramod Kumar 

