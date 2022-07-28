

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the maximum sub-array sum 
static int maxSubArraySum(int a[], int size) 
{ 
  
    // Initialized 
    int max_so_far = Integer.MIN_VALUE,  
        max_ending_here = 0; 
  
    // Traverse in the array 
    for (int i = 0; i < size; i++) 
    { 
  
        // Increase the sum 
        max_ending_here = max_ending_here + a[i]; 
  
        // If sub-array sum is more than the previous 
        if (max_so_far < max_ending_here) 
            max_so_far = max_ending_here; 
  
        // If sum is negative 
        if (max_ending_here < 0) 
            max_ending_here = 0; 
    } 
    return max_so_far; 
} 
  
// Function that returns the maximum sub-array sum 
// after removing an element from the same sub-array 
static int maximizeSum(int a[], int n) 
{ 
    int cnt = 0; 
    int mini = Integer.MAX_VALUE; 
    int minSubarray = Integer.MAX_VALUE; 
  
    // Maximum sub-array sum  
    // using Kadane's Algorithm 
    int sum = maxSubArraySum(a, n); 
  
    int max_so_far = Integer.MIN_VALUE,  
        max_ending_here = 0; 
  
    // Re-apply Kadane's with minor changes 
    for (int i = 0; i < n; i++) 
    { 
  
        // Increase the sum 
        max_ending_here = max_ending_here + a[i]; 
        cnt++; 
        minSubarray = Math.min(a[i], minSubarray); 
  
        // If sub-array sum is greater than the previous 
        if (sum == max_ending_here) 
        { 
  
            // If elements are 0, no removal 
            if (cnt == 1) 
                mini = Math.min(mini, 0); 
  
            // If elements are more, then store 
            // the minimum value in the sub-array 
            // obtained till now 
            else
                mini = Math.min(mini, minSubarray); 
        } 
  
        // If sum is negative 
        if (max_ending_here < 0) 
        { 
  
            // Re-initialize everything 
            max_ending_here = 0; 
            cnt = 0; 
            minSubarray = Integer.MAX_VALUE; 
        } 
    } 
  
    return sum - mini; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 2, 3, -2, 3 }; 
    int n = a.length; 
    System.out.println(maximizeSum(a, n)); 
} 
} 
  
// This code is contributed by Code_Mech 

