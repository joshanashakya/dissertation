

// Java program to find the  
// minimum difference between  
// any two terms of two tables 
import java.io.*; 
  
class GFG 
{ 
      
// Utility function to 
// find GCD of a and b 
static int gcd(int a, int b) 
{ 
    while (b != 0) 
    { 
        int t = b; 
        b = a % b; 
        a = t; 
    } 
    return a; 
} 
  
// Returns minimum difference  
// between any two terms of  
// shifted tables of 'a' and  
// 'b'. 'x' is shift in table  
// of 'a' and 'y' is shift in 
// table of 'b'. 
static int findMinDiff(int a, int b,  
                       int x, int y) 
{ 
    // Calculate gcd 
    // of a nd b 
    int g = gcd(a,b); 
  
    // Calculate difference  
    // between x and y 
    int diff = Math.abs(x - y) % g; 
  
    return Math.min(diff, g - diff); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int a = 20, b = 52, x = 5, y = 7; 
    System.out.println( findMinDiff(a, b, x, y)); 
} 
} 
  
// This code is contributed by ajit 

