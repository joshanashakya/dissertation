

// Java program to count the numbers divisible by 
// M in a given range 
import java.io.*; 
  
class GFG { 
    // Function to count the numbers divisible by 
    // M in a given range 
    static int countDivisibles(int A, int B, int M) 
    { 
        // Variable to store the counter 
        int counter = 0; 
  
        // Running a loop from A to B and check 
        // if a number is divisible by M. 
        for (int i = A; i <= B; i++) 
            if (i % M == 0) 
                counter++; 
  
        return counter; 
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
  
// Contributed by Pramod Kumar 

