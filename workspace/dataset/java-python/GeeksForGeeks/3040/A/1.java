

// Java implmentation to check if 
// the value of the N! % X^Y == 0 
import java.util.*; 
import java.lang.*; 
  
class divisible { 
      
    // Function to check if N! % X^Y == 0 
    public static void check(int n,  
                         int x, int y){ 
        long fact = 1; 
          
        // Loop to calculate N-factorial 
        for (int i = 2; i <= n; i++) { 
            fact *= i; 
        } 
  
        long divisor = (long)Math.pow(x, y); 
          
        // Condition to check 
        if (fact % divisor == 0) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
          
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 10; 
        int x = 2; 
        int y = 8; 
          
        // Function Call 
        check(n, x, y); 
    } 
} 

