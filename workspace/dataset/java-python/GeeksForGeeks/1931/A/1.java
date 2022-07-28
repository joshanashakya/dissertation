

// Java program to find numbers 
// that divide X and Y to 
// produce the same remainder 
import java.util.*; 
  
class GFG{ 
   
// Function to print all the possible values 
// of M such that X % M = Y % M 
static void printModulus(int X, int Y) 
{ 
    // Finding the absolute difference 
    // of X and Y 
    int d = Math.abs(X - Y); 
   
    // Iterating from 1 
    int i = 1; 
   
    // Loop to print all the factors of D 
    while (i * i <= d) { 
   
        // If i is a factor of d, then print i 
        if (d % i == 0) { 
            System.out.print(i+ " "); 
   
            // If d / i is a factor of d, 
            // then print d / i 
            if (d / i != i) 
                System.out.print(d / i+ " "); 
        } 
        i++; 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    int X = 10; 
    int Y = 26; 
   
    printModulus(X, Y); 
} 
} 
  
// This code is contributed by Princi Singh 

