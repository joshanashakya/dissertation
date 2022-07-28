

// Java program to count non decreasing subarrays 
// of size N from N Natural numbers 
class GFG 
{ 
  
// Returns value of Binomial Coefficient C(n, k) 
static int binomialCoeff(int n, int k) 
{ 
    int []C = new int[k + 1]; 
  
    // Since nC0 is 1 
    C[0] = 1; 
  
    for (int i = 1; i <= n; i++) 
    { 
  
        // Compute next row of pascal triangle using 
        // the previous row 
        for (int j = Math.min(i, k); j > 0; j--) 
            C[j] = C[j] + C[j - 1]; 
    } 
    return C[k]; 
} 
  
// Function to find the count of required subarrays 
static int count_of_subarrays(int N) 
{ 
  
    // The required count is the binomial coefficient 
    // as explained in the approach above 
    int count = binomialCoeff(2 * N - 1, N); 
  
    return count; 
} 
  
// Driver Function 
public static void main(String[] args) 
{ 
    int N = 3; 
    System.out.print(count_of_subarrays(N)+ "\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

