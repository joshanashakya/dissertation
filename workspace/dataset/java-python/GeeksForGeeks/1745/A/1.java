

// Java program to find number of   
// n digit numbers that do not  
// contain 9 as it's digit 
import java.io.*; 
  
public class GFG 
{ 
      
// function to find number of  
// n digit numbers possible  
static int totalNumber(int n) 
{ 
    return 8 * (int)Math.pow(9, n - 1); 
} 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
        int n = 3; 
        System.out.println(totalNumber(n)); 
          
    } 
} 
  
// This code is contributed by vt_m. 

