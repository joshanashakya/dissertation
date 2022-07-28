

// Java program to find trace of matrix formed 
// by adding Row-major and Column-major order 
// of same matrix 
import java.io.*; 
  
public class GFG { 
  
    // Return sum of first n integers of an AP 
    static int sn(int n, int an) 
    { 
        return (n * (1 + an)) / 2; 
    } 
  
    // Return the trace of sum of row-major matrix 
    // and column-major matrix 
    static int trace(int n, int m) 
    { 
        // Finding nth element in 
        // AP in case of Row major matrix. 
        int an = 1 + (n - 1) * (m + 1); 
  
        // Finding sum of first n integers 
        // of AP in case of Row major matrix 
        int rowmajorSum = sn(n, an); 
  
        // Finding nth element in AP 
        // in case of Row major matrix 
        an = 1 + (n - 1) * (n + 1); 
  
        // Finding sum of first n integers 
        // of AP in case of Column major matrix 
        int colmajorSum = sn(n, an); 
  
        return rowmajorSum + colmajorSum; 
    } 
  
    // Driven Program 
    static public void main(String[] args) 
    { 
        int N = 3, M = 3; 
        System.out.println(trace(N, M)); 
    } 
} 
  
// This code is contributed by vt_m. 

