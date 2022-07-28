

// Java implementation of the above approach 
import java.util.Arrays; 
  
class GFG  
{ 
  
// Utility function to return the sum 
// of the array elements 
static int sumArr(int arr[], int n) 
{ 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
  
    return sum; 
} 
  
// Function to return the maximized sum 
// of the array after performing 
// the given operation exactly k times 
static int maxSum(int arr[], int n, int k) 
{ 
    // Sort the array elements 
    Arrays.sort(arr); 
  
    int i = 0; 
      
    // Change signs of the negative elements 
    // starting from the smallest 
    while (i < n && k > 0 && arr[i] < 0) 
    { 
        arr[i] *= -1; 
        k--; 
        i++; 
    } 
  
    // If a single operation has to be 
    // performed then it must be performed 
    // on the smallest positive element 
    if (k % 2 == 1)  
    { 
  
        // To store the index of the 
        // minimum element 
        int min = 0; 
        for (i = 1; i < n; i++) 
  
            // Update the minimum index 
            if (arr[min] > arr[i]) 
                min = i; 
  
        // Perform remaining operation 
        // on the smallest element 
        arr[min] *= -1; 
    } 
  
    // Return the sum of the updated array 
    return sumArr(arr, n); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { -5, 4, 1, 3, 2 }; 
    int n = arr.length; 
    int k = 4; 
  
    System.out.println(maxSum(arr, n, k)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

