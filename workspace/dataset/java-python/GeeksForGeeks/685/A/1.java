

// Java Program to find the  
// maximum value in a matrix  
// which contain intersecting  
// concentric submatrix 
import java.io.*; 
  
class GFG 
{ 
static int MAXN = 100; 
  
// Return the maximum value  
// in intersecting 
// concentric submatrix. 
static int maxValue(int n, int m,  
                    int x[], int y[],  
                    int a[]) 
{ 
    int c[][] = new int[MAXN][MAXN]; 
  
    // For each center of  
    // concentric sub-matrix. 
    for (int i = 0; i < m; ++i) 
    { 
  
        // for each row 
        for (int p = 0; p < n; ++p)  
        { 
  
            // for each column 
            for (int q = 0; q < n; ++q) 
            { 
  
                // finding x distance. 
                int dx = Math.abs(p - x[i]); 
  
                // finding y distance. 
                int dy = Math.abs(q - y[i]); 
  
                // maximum of x distance 
                // and y distance 
                int d = Math.max(dx, dy); 
  
                // assigning the value. 
                c[p][q] += Math.max(0, a[i] - d); 
            } 
        } 
    } 
  
    // Finding the maximum  
    // value in the formed matrix. 
    int res = 0; 
    for (int i = 0; i < n; ++i)  
    { 
        for (int j = 0; j < n; ++j)  
        { 
            res = Math.max(res, c[i][j]); 
        } 
    } 
    return res; 
} 
  
  
// Driven Code 
public static void main (String[] args)  
{ 
    int n = 10; 
    int m = 2; 
    int x[] = { 3, 7 }; 
    int y[] = { 3, 7 }; 
    int a[] = { 4, 3 }; 
  
    System.out.println(maxValue(n, m, x,  
                                 y, a)); 
} 
} 
  
// This code is contributed by anuj_67. 

