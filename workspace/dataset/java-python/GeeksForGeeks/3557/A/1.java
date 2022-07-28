

// Java program to find common  
// elements in two diagonals. 
import java.io.*; 
  
class GFG 
{ 
    int MAX = 100; 
      
    // Returns count of row wise same elements  
    // in two diagonals of mat[n][n] 
    static int countCommon(int mat[][], int n) 
    { 
        int res = 0; 
        for (int i = 0; i < n; i++) 
            if (mat[i][i] == mat[i][n - i - 1]) 
                res++; 
        return res; 
    } 
  
    // Driver Code 
    public static void main(String args[])throws IOException 
    { 
        int mat[][] = {{1, 2, 3},  
                       {4, 5, 6}, 
                       {7, 8, 9}}; 
        System.out.println(countCommon(mat, 3)); 
    } 
} 
  
// This code is contributed by Anshika Goyal. 

