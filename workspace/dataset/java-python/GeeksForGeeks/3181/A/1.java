

// Java program to find sum 
// series 1, 3, 6, 10, 15, 21... 
// and then find its sum*/ 
import java.io.*; 
  
class GFG { 
          
    // Function to find the sum of series 
    static int seriesSum(int n) 
    { 
        int sum = 0; 
        for (int i = 1; i <= n; i++) 
        sum += i * (i + 1) / 2; 
        return sum; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 4; 
        System.out.println(seriesSum(n)); 
          
    } 
} 
  
// This article is contributed by vt_m 

