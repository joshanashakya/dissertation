

// Java program to calculate the smallest  
// multiple of x closest to a given number 
import java.io.*; 
class Solution 
{ 
    // Function to calculate the smallest multiple 
    static int closestMultiple(int n, int x) 
    {    
        if(x>n) 
           return x; 
        n = n + x/2; 
        n = n - (n%x); 
        return n; 
    } 
  
    // driver program 
    public static void main (String[] args)  
    { 
        int n = 56287, x = 27; 
        System.out.println(closestMultiple(n, x)); 
    } 
} 

