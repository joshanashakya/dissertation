

// Java program to count the number of pairs 
// (i,j) such that sum of elements in j-th column 
// is greater than sum of elements in i-th row 
import java.io.*; 
  
class GFG 
{ 
      
static int N = 3; 
  
// Function to count the number of pairs 
// (i,j) such that sum of elements in j-th column 
// is greater than sum of elements in i-th row 
static int countPairs(int a[][]) 
{ 
    // Initialize row sum and column 
    // sum to zero 
    int sumr[] = new int[N] ; 
    int sumc[] = new int [N] ; 
      
    // Calculate row sum and column sum 
    for (int i = 0; i < N; i++) 
        for (int j = 0; j < N; j++) 
        { 
            sumr[i] += a[i][j]; 
            sumc[j] += a[i][j]; 
        } 
          
    int count = 0; 
      
    // Count the number of pairs that are valid 
    for (int i = 0; i < N; i++) 
        for (int j = 0; j < N; j++) 
            if (sumc[i] > sumr[j]) 
                count++; 
                  
    return count; 
} 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
  
    int a[][] = { { 1, 2, 3 },  
                { 4, 5, 6 }, 
                { 7, 8, 9 } }; 
      
    System.out.println (countPairs(a)); 
    } 
} 
  
// This code is contributed by jit_t. 

