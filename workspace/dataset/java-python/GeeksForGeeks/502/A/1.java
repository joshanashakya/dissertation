

// Java program to find sum of first n terms 
import java.util.*; 
  
class solution 
{ 
//function to calculate sum of n terms of the series 
static int calculateSum(int n) 
{ 
    // Sum = n*(n^2 + 3*n + 5)/3 
    return n * (int)  (Math.pow(n, 2) + 3 * n + 5 )/ 3; 
} 
  
public static void main(String arr[]) 
{ 
    // number of terms to be included in the sum 
    int n = 3; 
  
    // find the Sum 
    System.out.println("Sum = " +calculateSum(n)); 
  
} 
} 

