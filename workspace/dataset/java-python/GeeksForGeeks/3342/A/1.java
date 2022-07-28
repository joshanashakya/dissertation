

// Java program for distribute 
// a square matrix into 
// symmetric and skew symmetric 
// matrix. 
  
import java.io.*; 
import java.util.*; 
  
class GFG { 
static void printMatrix(float mat[][]) 
{ 
    for (int i = 0; i < mat.length; i++) { 
        for (int j = 0; j < mat[i].length; j++) 
            System.out.print(mat[i][j] + "   "); 
        System.out.println(); 
    } 
} 
   
static void printDistribution(float mat[][]) 
{ 
    // tr is the transpose of matrix mat. 
    int N=mat.length; 
    float[][] tr = new float[N][N]; 
   
    // Find transpose of matrix. 
    for (int i = 0; i < N; i++) 
        for (int j = 0; j < N; j++) 
            tr[i][j] = mat[j][i]; 
   
    // Declare two square matrix symm and 
    // skewsymm of size N. 
    float[][] symm=new float[N][N]; 
    float[][] skewsymm=new float[N][N]; 
   
    // Loop to find symmetric and skew symmetric  
    // and store it into symm and skewsymm matrix. 
    for (int i = 0; i < N; i++) { 
        for (int j = 0; j < N; j++) { 
            symm[i][j] = (mat[i][j] + tr[i][j]) / 2; 
            skewsymm[i][j] = (mat[i][j] - tr[i][j]) / 2; 
        } 
    } 
   
    System.out.println("Symmetric matrix-" ); 
    printMatrix(symm); 
   
    System.out.println("Skew Symmetric matrix-" ); 
    printMatrix(skewsymm); 
} 
    public static void main (String[] args) { 
  
    // mat is the N * N square matrix. 
    float mat[][] = { { 2, -2, -4 }, 
                        { -1, 3, 4 }, 
                        { 1, -2, -3 } }; 
    printDistribution(mat); 
     } 
} 
  
// This code is contributed by Gitanjali. 

