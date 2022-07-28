

// Java program to find sum of matrix in which 
// each element is absolute difference of its 
// corresponding row and column number row. 
import java.io.*; 
  
public class GFG { 
      
// Retuen the sum of matrix in which each element 
// is absolute difference of its corresponding 
// row and column number row 
static int findSum(int n) 
{ 
    n--; 
    int sum = 0; 
    sum += (n * (n + 1)) / 2; 
    sum += (n * (n + 1) * (2 * n + 1)) / 6; 
    return sum; 
} 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
        int n = 3; 
        System.out.println(findSum(n)); 
    } 
} 
  
// This code is contributed by vt_m. 

