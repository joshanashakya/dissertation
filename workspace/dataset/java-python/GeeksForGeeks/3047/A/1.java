

// java program to find sum 
// series 1, 3, 6, 10, 15, 21... 
// and then find its sum 
import java.io.*; 
  
class GFG  
{ 
    // Function to find the sum of series 
    static int seriesSum(int n) 
    { 
        return (n * (n + 1) * (n + 2)) / 6;  
    } 
  
   // Driver code 
    public static void main (String[] args) { 
          
        int n = 4; 
        System.out.println( seriesSum(n)); 
          
    } 
} 
  
// This article is contributed by vt_m 

