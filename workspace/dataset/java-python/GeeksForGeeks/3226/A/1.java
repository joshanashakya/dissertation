

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
  
// Function to return the count of 
// operations required to update 
// the array such that it is possible 
// to move from index 0 to index n - 1 
static int countOp(int arr[], int n, int k) 
{ 
    int operations = 0; 
    for (int i = 1; i < n; i++)  
    { 
  
        // Current element needs to be updated 
        if (Math.abs(arr[i] - arr[i - 1]) > k) 
        { 
  
            // Get the absolute difference 
            int absDiff = Math.abs(arr[i] - arr[i - 1]); 
  
            // The value which needs to 
            // be added or subtracted 
            int currOp = absDiff - k; 
  
            // Add value to arr[i] 
            if (arr[i] < arr[i - 1]) 
                arr[i] += currOp; 
  
            // Subtract value from arr[i] 
            else
                arr[i] -= currOp; 
  
            // Update the operations 
            operations += currOp; 
        } 
    } 
    return operations; 
} 
  
// Driver code 
static public void main (String []arg) 
{ 
    int arr[] = { 1, 2, 5, 9 }; 
    int n = arr.length; 
    int k = 2; 
  
    System.out.println(countOp(arr, n, k)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

