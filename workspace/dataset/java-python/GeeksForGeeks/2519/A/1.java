

// Java program to make the array elements 
// equal in minimum steps 
  
import java.io.*; 
  
class GFG { 
  
    // Returns the minumum steps required 
    // to make an array of N elements equal, 
    // where the first array element equals M 
    static int steps(int N, int M) 
    { 
        // Corner Case 1: When N = 1 
        if (N == 1) 
            return 0; 
      
        // Corner Case 2: When N = 2 
        else if (N == 2) // corner case 2 
            return M; 
      
        return 2 * M + (N - 3); 
    } 
      
    // Driver Code 
    public static void main (String[] args)  
    { 
        int N = 4, M = 4; 
        System.out.print( steps(N, M)); 
    } 
} 
  
// This code is contributed by anuj_67. 

