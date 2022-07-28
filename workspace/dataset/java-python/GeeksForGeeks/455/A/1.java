

// Java program using recursive  
// solution to count number of  
// ways to reach mat[m-1][n-1] from 
// mat[0][0] in a matrix mat[][] 
import java.lang.*; 
import java.util.*; 
  
class GFG 
{ 
// Returns The number of way  
// from top-left to mat[m-1][n-1] 
public int countPaths(int m, int n) 
{ 
    // Return 1 if it is the first 
    // row or first column 
    if (m == 1 || n == 1) 
        return 1; 
  
    // Recursively find the no of  
    // way to reach the last cell. 
    return countPaths(m - 1, n) + 
           countPaths(m, n - 1); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    GFG g = new GFG(); 
  
    int n = 5, m = 5; 
    System.out.println(g.countPaths(n, m)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku)  

