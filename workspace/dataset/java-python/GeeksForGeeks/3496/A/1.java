

// A simple recursive implementation for 
// counting ways to reach a score using 1 and 2 with 
// consecutive 2 allowed 
  
import java.io.*; 
  
class GFG { 
   static  int CountWays(int n, boolean flag) 
{ 
    if (n == 0) // base case 
        return 1; 
  
    int sum = 0; 
  
    // 2 is not scored last time so we can score either 2 or 1 
    if (flag == false && n > 1) 
        sum = sum + CountWays(n - 1, false) + CountWays(n - 2, true); 
  
    // 2 is scored last time so we can only score 1 
    else
        sum = sum + CountWays(n - 1, false); 
  
    return sum; 
} 
    // Driver code 
    public static void main (String[] args) { 
            int n = 5; 
            System.out.println(CountWays(n, false)); 
    } 
} 

