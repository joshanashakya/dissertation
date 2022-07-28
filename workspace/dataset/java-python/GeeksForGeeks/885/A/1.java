

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count of 
// maximum consecutive 1s in the 
// binary represntation of x 
static int maxConsecutiveOnes(int x) 
{ 
    // Initialize result 
    int count = 0; 
  
    // Count the number of iterations to 
    // reach x = 0. 
    while (x != 0)  
    { 
        // This operation reduces length 
        // of every sequence of 1s by one 
        x = (x & (x << 1)); 
  
        count++; 
    } 
    return count; 
} 
  
// Function to return the count of 
// maximum consecutive 1s in the 
// binary represntation among all 
// the elements of arr[] 
static int maxOnes(int arr[], int n) 
{ 
    // To store the answer 
    int ans = 0; 
  
    // For every element of the array 
    for (int i = 0; i < n; i++)  
    { 
  
        // Count of maximum consecutive 1s in 
        // the binary representation of 
        // the current element 
        int currMax = maxConsecutiveOnes(arr[i]); 
  
        // Update the maximum count so far 
        ans = Math.max(ans, currMax); 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 1, 2, 3, 4 }; 
    int n = arr.length; 
  
    System.out.println(maxOnes(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

