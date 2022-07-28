

// Java program to implement 
// the above approach 
import java.io.*; 
  
class GFG  
{ 
    static int N = 2; 
    static int M = 3; 
      
    // Function to check if a number  
    // from every row can be selected  
    // such that xor of the numbers  
    // is greater than zero 
    static boolean check(int mat[][]) 
    { 
        int xorr = 0; 
      
        // Find the xor of first 
        // column for every row 
        for (int i = 0; i < N; i++) 
        { 
            xorr ^= mat[i] [0]; 
        } 
      
        // If Xorr is 0 
        if (xorr != 0) 
            return true; 
      
        // Traverse in the matrix 
        for (int i = 0; i < N; i++)  
        { 
            for (int j = 1; j < M; j++)  
            { 
      
                // Check is atleast 
                // 2 distinct elements 
                if (mat[i] [j] != mat[i] [0]) 
                    return true; 
            } 
        } 
      
        return false; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
          
        int mat[][] = {{ 7, 7, 7 }, 
                    { 10, 10, 7 }}; 
      
        if (check(mat)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
  
    } 
} 
  
// This code is contributed by ajit 

