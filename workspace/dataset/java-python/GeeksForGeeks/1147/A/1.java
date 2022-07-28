

// Java program to find the product 
// of the sum of diagonals. 
  
  
class GFG{ 
   
// Function to find the product  
// of the sum of diagonals. 
static long product(int [][]mat, int n) 
{ 
    // Initialize sums of diagonals 
    long d1 = 0, d2 = 0; 
   
    for (int i = 0; i < n; i++)  
    { 
        d1 += mat[i][i]; 
        d2 += mat[i][n - i - 1]; 
    } 
       
    // Return the answer 
    return 1L * d1 * d2; 
} 
   
// Driven code 
public static void main(String[] args) 
{ 
    int [][]mat = {{ 5, 8, 1}, 
                               { 5, 10, 3}, 
                               { -6, 17, -9}}; 
                                  
    int n = mat.length; 
       
    // Function call 
    System.out.print(product(mat, n)); 
       
} 
} 
  
// This code is contributed by 29AjayKumar 

