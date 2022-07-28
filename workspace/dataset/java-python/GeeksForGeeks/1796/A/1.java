

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the sum of the squares 
// of first N natural numbers 
static long squareSum(long N) 
{ 
    long sum = (long)(N * (N + 1) * (2 * N + 1)) / 6; 
  
    return sum; 
} 
  
// Function to return the maximum N such that 
// the sum of the squares of first N 
// natural numbers is not more than X 
static long findMaxN(long X) 
{ 
    long low = 1, high = 100000; 
    int N = 0; 
  
    while (low <= high)  
    { 
        long mid = (high + low) / 2; 
  
        if (squareSum(mid) <= X)  
        { 
            N = (int) mid; 
            low = mid + 1; 
        } 
  
        else
            high = mid - 1; 
    } 
  
    return N; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    long X = 25; 
    System.out.println(findMaxN(X)); 
} 
} 
  
// This code contributed by Rajput-Ji 

