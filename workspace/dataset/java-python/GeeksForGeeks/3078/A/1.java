

// Java Program to print all cube free 
// numbers smaller than or equal to n. 
import java.lang.*; 
  
class GFG 
{ 
    /* Returns the number of divisors of (A - B) 
       greater than B */
    public static int calculateDivisors(int A, int B) 
    { 
        int N = (A - B); 
        int noOfDivisors = 0; 
  
        for (int i = 1; i <= Math.sqrt(N); i++) 
        { 
  
            // if N is divisible by i 
            if ((N % i) == 0) 
            { 
  
                // count only the divisors greater than B 
                if (i > B) 
                    noOfDivisors++; 
  
                // checking if a divisor isnt counted twice 
                if ((N / i) != i && (N / i) > B) 
                    noOfDivisors++; 
            } 
        } 
        return noOfDivisors; 
    } 
  
    /* Utility function to calculate number of all 
       possible values of X for which the modular 
       equation holds true */
    public static int numberOfPossibleWaysUtil(int A, int B) 
    { 
        /* if A = B there are infinitely many solutions 
           to equation  or we say X can take infinitely 
           many values > A. We return -1 in this case */
        if (A == B) 
            return -1; 
  
        /* if A < B, there are no possible values of 
           X satisfying the equation */
        if (A < B) 
            return 0; 
  
        /* the last case is when A > B, here we calculate 
           the number of divisors of (A - B), which are 
           greater than B */
        int noOfDivisors = 0; 
        noOfDivisors = calculateDivisors(A, B); 
        return noOfDivisors; 
    } 
  
    /* Wrapper function for numberOfPossibleWaysUtil() */
    public static void numberOfPossibleWays(int A, int B) 
    { 
        int noOfSolutions = numberOfPossibleWaysUtil(A, B); 
  
        // if infinitely many solutions available 
        if (noOfSolutions == -1) 
        { 
            System.out.print("For A = " + A + " and B = " + B 
                             + ", X can take Infinitely many values"
                             + " greater than "  + A + "\n"); 
        } 
  
        else
        { 
            System.out.print("For A = " + A + " and B = " + B 
                             + ", X can take " + noOfSolutions 
                             + " values\n"); 
        } 
    } 
    // Driver program 
    public static void main(String[] args) 
    { 
        int A = 26, B = 2; 
        numberOfPossibleWays(A, B); 
        A = 21; 
        B = 5; 
        numberOfPossibleWays(A, B); 
    } 
} 
// Contributed by _omg 

