

// Java program to calculate the LCM of N! 
// and its neighbor (N-1)! and (N+1)! 
import java.io.*; 
  
class GFG { 
  
    // function to calculate the factorial 
    static int factorial(int n) 
    { 
        if (n == 0) 
            return 1; 
              
        return n * factorial(n - 1); 
    } 
  
    static int LCMOfNeighbourFact(int n) 
    { 
          
        // returning the factorial of the 
        // largest number in the given three 
        // consecutive numbers 
        return factorial(n + 1); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int N = 5; 
          
        System.out.println(LCMOfNeighbourFact(N)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

