

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the maximum 
// product of sum for any partition 
static int maxProdSum(int arr[], int n) 
{ 
    int leftArraySum = 0, maxProduct = 0; 
  
    // Traversing the array 
    for (int i = 0; i < n; i++) 
    { 
  
        // Compute left array sum 
        leftArraySum += arr[i]; 
  
        // Compute right array sum 
        int rightArraySum = 0; 
        for (int j = i + 1; j < n; j++) 
        { 
            rightArraySum += arr[j]; 
        } 
  
        // Multiplying left and right subarray sum 
        int k = leftArraySum * rightArraySum; 
  
        // Checking for the maximum product 
        // of sum of left and right subarray 
        if (k > maxProduct) 
        { 
            maxProduct = k; 
        } 
    } 
  
    // Printing the maximum product 
    return maxProduct; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 10, 1, 7, 2, 9 }; 
    int n = arr.length; 
  
    System.out.print(maxProdSum(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

