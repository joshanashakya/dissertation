

// Java program to find size of the 
// largest subset with GCD 1 
import java.*; 
  
class GFG { 
      
    // Function to return gcd of 
    // a and b 
    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
  
    // Function to find largest 
    // subset with GCD 1 
    static int largestGCD1Subset(int A[], 
                                   int n) 
    { 
          
        // finding gcd of whole array 
        int currentGCD = A[0]; 
          
        for (int i=1; i<n; i++) 
        { 
            currentGCD =  
                    gcd(currentGCD, A[i]); 
      
            // If current GCD becomes 1 
            // at any momemnt, then whole 
            // array has GCD 1. 
            if (currentGCD == 1) 
                return n; 
        } 
      
        return 0; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int A[] = {2, 18, 6, 3}; 
        int n =A.length; 
          
        System.out.println( 
                  largestGCD1Subset(A, n) ); 
    } 
} 
  
// This code is contributed by Sam007. 

