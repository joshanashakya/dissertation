

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count of 
// increasing subarrays of length k 
static int cntSubArrays(int []arr, int n, int k) 
{ 
    // To store the final result 
    int res = 0; 
  
    int i = 0; 
      
    // Two pointer loop 
    while (i < n) 
    { 
  
        // Initialising j 
        int j = i + 1; 
  
        // Looping till the subarray increases 
        while (j < n && arr[j] >= arr[j - 1]) 
            j++; 
  
        // Updating the required count 
        res += Math.max(j - i - k + 1, 0); 
  
        // Updating i 
        i = j; 
    } 
  
    // Returning res 
    return res; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 1, 2, 3, 2, 5 }; 
    int n = arr.length; 
    int k = 2; 
  
    System.out.println(cntSubArrays(arr, n, k)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

