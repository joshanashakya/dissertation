

// Java Program to traverse a m x n matrix in L shape. 
public class GFG{ 
  
    static void traverseLshape(int a[][], int n, int m) { 
        // for each column or each L shape 
        for (int j = 0; j < m; j++) { 
  
            // traversing vertically 
            for (int i = 0; i <= n - j - 1; i++) 
                System.out.print(a[i][j] + " "); 
  
            // traverse horizontally 
            for (int k = j + 1; k < m; k++) 
                System.out.print(a[n - 1 - j][k] + " "); 
        } 
    } 
  
    // Driver Code 
    public static void main(String args[]) { 
        int n = 4;  
        int m = 3;  
        int a[][] = { { 1, 2, 3 },  
                        { 4, 5, 6 },  
                        { 7, 8, 9 },  
                        { 10, 11, 12 } };  
        traverseLshape(a, n, m);  
    } 
} 

