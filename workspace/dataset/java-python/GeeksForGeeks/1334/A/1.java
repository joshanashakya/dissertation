

// Java implementation to find the sum of all the 
// terms in the nth row of the given series 
  
import static java.lang.Math.pow; 
  
class Test { 
    // method to find the required sum 
    static int sumOfTermsInNthRow(int n) 
    { 
        // sum = n * (2 * n^2 + 1) 
        int sum = (int)(n * (2 * pow(n, 2) + 1)); 
        return sum; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println("Sum of all the terms in nth row = "
                           + sumOfTermsInNthRow(n)); 
    } 
} 

