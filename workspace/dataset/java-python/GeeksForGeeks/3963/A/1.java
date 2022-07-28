

// Java program to get total  
// coverage of all zeros in  
// a binary matrix 
import java .io.*; 
  
class GFG  
{ 
static int R = 4; 
static int C = 4; 
  
// Returns total coverage 
// of all zeros in mat[][] 
static int getTotalCoverageOfMatrix(int [][]mat) 
{ 
    int res = 0; 
  
    // looping for all  
    // rows of matrix 
    for (int i = 0; i < R; i++) 
    { 
        // 1 is not seen yet 
        boolean isOne = false;  
  
        // looping in columns from  
        // left to right direction 
        // to get left ones 
        for (int j = 0; j < C; j++) 
        { 
            // If one is found 
            // from left 
            if (mat[i][j] == 1) 
                isOne = true; 
  
            // If 0 is found and we  
            // have found a 1 before. 
            else if (isOne) 
                res++; 
        } 
  
        // Repeat the above  
        // process for right  
        // to left direction. 
        isOne = false; 
        for (int j = C - 1; j >= 0; j--) 
        { 
            if (mat[i][j] == 1) 
                isOne = true; 
            else if (isOne) 
                res++; 
        } 
    } 
  
    // Traversing across columms 
    // for up and down directions. 
    for (int j = 0; j < C; j++) 
    { 
        // 1 is not seen yet 
        boolean isOne = false;  
        for (int i = 0; i < R; i++) 
        { 
            if (mat[i][j] == 1) 
                isOne = true; 
            else if (isOne) 
                res++; 
        } 
  
        isOne = false; 
        for (int i = R - 1; i >= 0; i--) 
        { 
            if (mat[i][j] == 1) 
                isOne = true; 
            else if (isOne) 
                res++; 
        } 
    } 
    return res; 
} 
  
// Driver code  
static public void main (String[] args) 
{ 
    int [][]mat = {{0, 0, 0, 0}, 
                   {1, 0, 0, 1}, 
                   {0, 1, 1, 0}, 
                   {0, 1, 0, 0}}; 
  
System.out.println( 
           getTotalCoverageOfMatrix(mat)); 
} 
} 
  
// This code is contributed by anuj_67. 

