

// JAVA implementation to Find the 
// geometric sum of the series using recursion 
  
import java.util.*; 
  
class GFG { 
  
    static double sum(int n) 
    { 
        // base case 
        if (n == 0) 
            return 1; 
  
        // calculate the sum each time 
        double ans = 1 / (double)Math.pow(3, n) + sum(n - 1); 
  
        // return final answer 
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        // integer initialisation 
        int n = 5; 
  
        // print result 
        System.out.println(sum(n)); 
    } 
} 

