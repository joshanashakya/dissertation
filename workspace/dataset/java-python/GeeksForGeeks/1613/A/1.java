

// Java program to find sum of matrix in which 
// each element is absolute difference of its 
// corresponding row and column number row. 
import java.io.*; 
  
class GFG { 
  
// Retuen the sum of matrix in which each 
// element is absolute difference of its 
// corresponding row and column number row 
static int findSum(int n) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        sum += i * (n - i); 
    return 2 * sum; 
} 
  
    // Driver Code 
    static public void main(String[] args) 
    { 
        int n = 3; 
        System.out.println(findSum(n)); 
    } 
} 
  
// This code is contributed by vt_m. 

