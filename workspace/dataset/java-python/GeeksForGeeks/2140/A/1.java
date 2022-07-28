

// Java program to search an  
// element in row-wise and  
// column-wise sorted matrix 
  
class GFG 
{ 
static final int MAX = 100; 
  
/* Searches the element x  
in mat[m][n]. If the element  
is found, then prints its  
position and returns true,  
otherwise prints "not found" 
and returns false */
static boolean search(int mat[][], int m,  
                      int n, int x) 
{ 
      
    // set indexes for 
    // bottom left element 
    int i = m - 1, j = 0;  
        while (i >= 0 && j < n) 
        { 
            if (mat[i][j] == x) 
                return true; 
            if (mat[i][j] > x) 
                i--; 
            else // if mat[i][j] < x 
                j++; 
        } 
          
        return false; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
int mat[][] = {{10, 20, 30, 40}, 
               {15, 25, 35, 45}, 
               {27, 29, 37, 48}, 
               {32, 33, 39, 50}, 
               {50, 60, 70, 80}}; 
if (search(mat, 5, 4, 29)) 
    System.out.println("Yes"); 
else
    System.out.println("No"); 
} 
} 
  
// This code is contributed 
// by Kirti_Mangal 

