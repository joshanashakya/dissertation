

// Java program to find the  
// minimum value of m that  
// satisfies ax + by = m  
// and all values after m  
// also satisfy 
import java.io.*; 
  
class GFG 
{ 
// Recursive function to  
// return gcd of a and b     
static int __gcd(int a, int b) 
{ 
      
    // Everything divides 0  
    if (a == 0 && b == 0) 
    return 0; 
  
    // base case 
    if (a == b) 
        return a; 
  
    // a is greater$ 
    if (a > b) 
        return __gcd(a - b, b); 
    return __gcd(a, b - a); 
} 
  
static int findMin( int a, int b) 
{ 
      
    // If GCD is not 1, then  
    // there is no such value, 
    // else value is obtained  
    // using "a*b-a-b+1' 
    return (__gcd(a, b) == 1)?  
        a * b - a - b + 1 : -1; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a = 4;  
    int b = 7; 
    System.out.println(findMin(a, b)); 
} 
} 
  
// This code is contributed  
// by akt_mit 

