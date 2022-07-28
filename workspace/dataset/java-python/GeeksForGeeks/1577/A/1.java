

// Java implementation of above approach 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
class GFG{ 
  
static int __gcd(int a,int b){ 
    return b==0 ? a : __gcd(b, a%b); 
}     
  
// Function to print a:b:c 
static void solveProportion(int a, int b1, int b2, int c) 
{ 
    int A = a * b2; 
    int B = b1 * b2; 
    int C = b1 * c; 
   
    // To print the given proportion 
    // in simplest form. 
    int gcd = __gcd(__gcd(A, B), C); 
   
    System.out.print( A / gcd + ":"
         + B / gcd + ":"
         + C / gcd); 
} 
   
// Driver code 
public static void  main(String args[]) 
{ 
   
    // Get the ratios 
    int a, b1, b2, c; 
   
    // Get ratio a:b1 
    a = 3; 
    b1 = 4; 
   
    // Get ratio b2:c 
    b2 = 8; 
    c = 9; 
   
    // Find the ratio a:b:c 
    solveProportion(a, b1, b2, c); 
} 
} 

