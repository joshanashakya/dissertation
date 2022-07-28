

// Java Program to find the Product 
// of diagonal elements of a matrix 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the product of diagonals 
static int productDiagonals(int arr[][], int n) 
{ 
  
    int product = 1; 
    // loop for calculating product of both 
    // the principal and secondary diagonals 
    for (int i = 0; i < n; i++)  
    { 
  
        // For principal diagonal index of row 
        // is equal to index of column 
        product = product * arr[i][i]; 
  
        // For secondary diagonal index 
        // of column is n-(index of row)-1 
        product = product * arr[i][n - i - 1]; 
    } 
  
    // Divide the answer by middle element for 
    // matrix of odd size 
    if (n % 2 == 1) 
    { 
        product = product / arr[n / 2][n / 2]; 
    } 
  
    return product; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr1[][] = { { 1, 2, 3, 4 }, 
                        { 5, 6, 7, 8 }, 
                        { 9, 7, 4, 2 }, 
                        { 2, 2, 2, 1 } }; 
    // Function calling 
    System.out.print(productDiagonals(arr1, 4) + "\n"); 
  
    int arr2[][] = { { 2, 1, 2, 1, 2 }, 
                        { 1, 2, 1, 2, 1 }, 
                        { 2, 1, 2, 1, 2 }, 
                        { 1, 2, 1, 2, 1 }, 
                        { 2, 1, 2, 1, 2 } }; 
    // Function calling 
    System.out.print(productDiagonals(arr2, 5) + "\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

