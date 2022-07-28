

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the maximum 
// product of sum for any partition 
static int maxProdSum(int arr[], int n) 
{ 
    int []prefixArraySum = new int[n]; 
    int maxProduct = 0; 
  
    // Initialise prefixArraySum[0] 
    // with arr[0] element 
    prefixArraySum[0] = arr[0]; 
  
    // Traverse array elements 
    // to compute prefix array sum 
    for (int i = 1; i < n; i++) 
    { 
        prefixArraySum[i] = prefixArraySum[i - 1] 
                            + arr[i]; 
    } 
  
    for (int i = 0; i < n - 1; i++) 
    { 
        // Compute left and right array sum 
        int leftArraySum = prefixArraySum[i]; 
        int rightArraySum = prefixArraySum[n - 1] 
                            - prefixArraySum[i]; 
  
        // Multiplying left and right subarray sum 
        int k = leftArraySum * rightArraySum; 
  
        // Checking for maximum product of 
        // the sum of left and right subarray 
        if (k > maxProduct)  
        { 
            maxProduct = k; 
        } 
    } 
  
    // Printing the maximum value 
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
  
// This code is contributed by PrinciRaj1992 

