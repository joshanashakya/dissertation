

// Java Program to find 
// minimum value of X 
// in equation X = P*A + Q*B 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
    // utility function to calculate gcd 
  
    public static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
  
        return gcd(b % a, a); 
    } 
  
    // Driver Program 
    public static void main(String[] args) 
    { 
        int a = 2; 
        int b = 4; 
  
        System.out.println(gcd(a, b)); 
    } 
} 

