

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the required count 
static int findCnt(int[] arr, int n, int k) 
{ 
    // To store the final result 
    int ret = 0; 
  
    // Two pointer loop 
    int i = 0; 
    while (i < n) 
    { 
  
        // Initialising j 
        int j = i + 1; 
  
        // Looping till the subarray increases 
        while (j < n && arr[j] >= arr[j - 1]) 
            j++; 
        int x = Math.max(0, j - i - k); 
  
        // Update ret 
        ret += ((j - i) * (j - i + 1)) / 2 -  
                          (x * (x + 1)) / 2; 
  
        // Update i 
        i = j; 
    } 
  
    // Return ret 
    return ret; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 1, 2, 3 }; 
    int n = arr.length; 
    int k = 2; 
  
    System.out.println(findCnt(arr, n, k)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

