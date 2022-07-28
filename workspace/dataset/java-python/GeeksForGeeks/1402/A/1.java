

// Java implementation of the approach 
  
class GFG 
{ 
  
// Function to return the minimum 
// possible sum of digits of A 
// and B such that A + B = n 
static int minSum(int n) 
{ 
    // Find the sum of digits of n 
    int sum = 0; 
    while (n > 0) 
    { 
        sum += (n % 10); 
        n /= 10; 
    } 
  
    // If num is a power of 10 
    if (sum == 1) 
        return 10; 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 1884; 
  
    System.out.print(minSum(n)); 
  
} 
} 
  
// This code is contributed by 29AjayKumar 

