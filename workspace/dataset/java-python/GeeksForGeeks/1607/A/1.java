

// Java program to replace each each element with 
// maximum of GCD of row or column. 
import java .io.*; 
  
class GFG 
{ 
      static int R = 3; 
      static int C = 4; 
  
      // returning the greatest common  
      // divisor of two number 
      static int gcd(int a, int b) 
      { 
         if (b == 0) 
         return a; 
         return gcd(b, a%b); 
      } 
  
// Finding GCD of each row and column and  
// replacing with each element with maximum 
// of GCD of row or column. 
static void replacematrix(int [][]mat, int n, int m) 
{ 
    int []rgcd = new int[R] ; 
    int []cgcd = new int[C]; 
  
    // Calculating GCD of each row and each column in  
    // O(mn) and store in arrays. 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < m; j++) 
        { 
            rgcd[i] = gcd(rgcd[i], mat[i][j]); 
            cgcd[j] = gcd(cgcd[j], mat[i][j]); 
        } 
    } 
  
    // Replacing matrix element 
    for (int i = 0; i < n; i++) 
        for (int j = 0; j < m; j++) 
            mat[i][j] = Math.max(rgcd[i], cgcd[j]); 
} 
  
// Driver program 
    static public void main (String[] args){ 
    int [][]m = 
    { 
        {1, 2, 3, 3}, 
        {4, 5, 6, 6}, 
        {7, 8, 9, 9}, 
    }; 
  
    replacematrix(m, R, C); 
  
    for (int i = 0; i < R; i++) 
    { 
        for (int j = 0; j < C; j++) 
        System.out.print(m[i][j] + " "); 
        System.out.println(); 
    } 
    } 
} 
  
//This code is contributed by vt_m. 

