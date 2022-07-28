

// Java implementation to find the largest value 
// of a + b satisfying the given condition  
import java.util.*; 
   
class GFG{ 
    
// Function to return the maximum sum of 
// a + b satisfying the given condition 
static int getLargestSum(int N) 
{ 
    // Initialize max_sum 
    int max_sum = 0; 
  
    // Consider all the possible pairs 
    for (int i = 1; i <= N; i++) { 
        for (int j = i + 1; j <= N; j++) { 
  
            // Check if the product is 
            // divisible by the sum 
            if (i * j % (i + j) == 0) 
  
                // Storing the maximum sum 
                // in the max_sum variable 
                max_sum = Math.max(max_sum, i + j); 
        } 
    } 
  
    // Return the max_sum value 
    return max_sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 25; 
  
    int max_sum = getLargestSum(N); 
  
    System.out.print(max_sum ); 
} 
} 
  
// This code is contributed by shivanisinghss2110 

