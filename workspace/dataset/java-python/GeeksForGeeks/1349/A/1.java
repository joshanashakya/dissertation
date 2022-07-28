

// Java implementation of above approach 
import java.io.*; 
  
class GFG { 
      
  
  
// print the sum of common factors 
static int sum(int a, int b) 
{ 
    // sum of common factors 
    int sum = 0; 
  
    // iterate from 1 to minimum of a and b 
    for (int i = 1; i <= Math.min(a, b); i++) 
  
        // if i is the common factor 
        // of both the numbers 
        if (a % i == 0 && b % i == 0) 
            sum += i; 
  
    return sum; 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
            int A = 10, B = 15; 
  
    // print the sum of common factors 
    System.out.print("Sum = " + sum(A, B)); 
    } 
} 
// This code is contributed by shs.. 

