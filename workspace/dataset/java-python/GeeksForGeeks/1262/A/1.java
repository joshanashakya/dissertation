

// Java implementation of the approach 
class GFG{ 
   
// Function to return the count of steps 
static int countSteps(int n) 
{ 
   
    // Variable to store the count of steps 
    int steps = 0; 
   
    // Iterate while N > 0 
    while (n > 0) { 
   
        // Get the largest perfect cube 
        // and subtract it from N 
        int largest = (int) Math.cbrt(n); 
        n -= (largest * largest * largest); 
   
        // Increment steps 
        steps++; 
    } 
   
    // Return the required count 
    return steps; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int n = 150; 
    System.out.print(countSteps(n));  
} 
} 
  
// This code is contributed by 29AjayKumar 

