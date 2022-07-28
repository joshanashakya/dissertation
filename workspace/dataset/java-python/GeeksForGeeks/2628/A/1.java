

// Java program to find n-th term of 
// series 
import java.io.*; 
  
class GFG { 
  
    // Function to find the nth term of series 
    static int sumOfSeries(int n) 
    { 
        // Loop to add 4th powers 
        int ans = 0; 
        for (int i = 1; i <= n; i++) 
            ans += i * i * i * i; 
  
        return ans; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 4; 
        System.out.println(sumOfSeries(n)); 
    } 
} 

