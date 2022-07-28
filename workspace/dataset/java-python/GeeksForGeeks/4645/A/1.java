

// java program to find sum of 0.6, 0.06, 
// 0.006, 0.0006, ...to n terms 
import java.io.*; 
  
class GFG  
{ 
    // function which return the 
    // the sum of series 
    static double sumOfSeries(int n) 
    { 
        return (0.666) * (1 - 1 /Math. pow(10, n)); 
    } 
      
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 2; 
        System.out.println ( sumOfSeries(n)); 
          
    } 
} 
  
// This code is contributed by vt_m 

