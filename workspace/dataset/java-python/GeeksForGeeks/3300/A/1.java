

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
  
// Function to return the maximum subarray sum 
static int maxSubArraySum(int a[], int size) 
{ 
    int max_so_far = Integer.MIN_VALUE,  
        max_ending_here = 0; 
  
    for (int i = 0; i < size; i++)  
    { 
        max_ending_here = max_ending_here + a[i]; 
        if (max_so_far < max_ending_here) 
            max_so_far = max_ending_here; 
  
        if (max_ending_here < 0) 
            max_ending_here = 0; 
    } 
    return max_so_far; 
} 
  
// Function to return the minimized sum 
// of the array elements after performing 
// the given operation 
static double minimizedSum(int a[], int n, int K) 
{ 
  
    // Find maximum subarray sum 
    int sum = maxSubArraySum(a, n); 
    double totalSum = 0; 
  
    // Find total sum of the array 
    for (int i = 0; i < n; i++) 
        totalSum += a[i]; 
  
    // Maximum subarray sum is already negative 
    if (sum < 0) 
        return totalSum; 
  
    // Choose the subarray whose sum is 
    // maximum and divide all elements by K 
    totalSum = totalSum - sum + (double)sum / 
                                (double)K; 
    return totalSum; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int a[] = { 1, -2, 3 }; 
    int n = a.length; 
    int K = 2; 
  
    System.out.println(minimizedSum(a, n, K)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

