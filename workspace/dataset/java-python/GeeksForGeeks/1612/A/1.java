

// Java program to find sum of matrix 
// in which each element is absolute 
// difference of its corresponding 
// row and column number row. 
import java.io.*; 
  
public class GFG { 
  
// Retuen the sum of matrix in which 
// each element is absolute difference 
// of its corresponding row and column 
// number row 
static int findSum(int n) 
{ 
      
    // Generate matrix 
    int [][]arr = new int[n][n]; 
    for (int i = 0; i < n; i++) 
        for (int j = 0; j < n; j++) 
            arr[i][j] = Math.abs(i - j); 
  
    // Compute sum 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        for (int j = 0; j < n; j++) 
            sum += arr[i][j]; 
  
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

