

// Java program to generate hailstone  
// numbers and calculate steps required  
// to reduce them to 1 
import java.util.*; 
class GFG 
{ 
static int c; 
  
// function to print hailstone numbers 
// and to calculate the number of steps  
// required 
static int HailstoneNumbers(int N) 
{ 
    System.out.print(N + " "); 
  
    if (N == 1 && c == 0) { 
  
        // N is initially 1. 
        return c; 
    }  
    else if (N == 1 && c != 0) { 
  
        // N is reduced to 1. 
        c++; 
        return c; 
    }  
    else if (N % 2 == 0) { 
  
        // If N is Even. 
        c++; 
        HailstoneNumbers(N / 2); 
    }  
    else if (N % 2 != 0) { 
  
        // N is Odd. 
        c++; 
        HailstoneNumbers(3 * N + 1); 
    } 
    return c; 
} 
  
// Driver function 
public static void main(String[] args) 
{ 
    int N = 7; 
    int x; 
  
    // Function to generate Hailstone 
    // Numbers 
    x = HailstoneNumbers(N); 
  
    // Output: Number of Steps 
    System.out.println(); 
    System.out.println("Number of Steps: " +x); 
} 
} 
/* This code is contributed by Kriti Shukla */

