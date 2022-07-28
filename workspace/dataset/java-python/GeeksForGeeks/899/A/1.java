

// Java implementation of above approach 
import java.util.*; 
  
class solution 
{ 
  
// print the numbers after dividing 
// them by their common factors 
static void divide(int a, int b) 
{ 
    // iterate from 1 to minimum of a and b 
    for (int i = 2; i <= Math.min(a, b); i++) { 
  
        // if i is the common factor 
        // of both the numbers 
        while (a % i == 0 && b % i == 0) { 
            a = a / i; 
            b = b / i; 
        } 
    } 
  
    System.out.println("A = "+a+", B = "+b); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int A = 10, B = 15; 
  
    // divide A and B by their common factors 
    divide(A, B); 
  
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

