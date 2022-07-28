

// Java Program to check whether given 
// matrix is centrosymmetric or not. 
import java.io.*; 
  
class GFG { 
          
    static int N = 3; 
      
    static boolean checkCentrosymmetricted( 
                           int n, int m[][]) 
    { 
        int mid_row; 
      
        // Finding the middle row of the 
        // matrix 
        if ((n & 1)>0) 
            mid_row = n / 2 + 1; 
        else
            mid_row = n / 2; 
      
        // for each row upto middle row. 
        for (int i = 0; i < mid_row; i++) 
        { 
      
            // If each element and its  
            // corresponding element is 
            // not equal then return false. 
            for (int j = 0; j < n; j++) 
            { 
                if (m[i][j] != 
                  m[n - i - 1][n - j - 1]) 
                    return false; 
            } 
        } 
      
        return true; 
    } 
      
    // Driven Program 
    public static void main (String[] args) 
    { 
        int n = 3; 
        int m[][] = { { 1, 3, 5 }, 
                      { 6, 8, 6 }, 
                      { 5, 3, 1 } }; 
  
    if(checkCentrosymmetricted(n, m)) 
        System.out.println( "Yes"); 
    else
        System.out.println( "No"); 
    } 
} 
  
// This code is contributed by anuj_67. 

