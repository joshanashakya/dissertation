

// Java implementation of the above approach 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to find the element 
static int findEle(int arr[], int n) 
{ 
    // sum is use to store 
    // sum of all elements 
    // of array 
    int sum = 0; 
  
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
  
    // iterate over all elements 
    for (int i = 0; i < n; i++) 
        if (arr[i] == sum - arr[i]) 
            return arr[i]; 
  
    return -1; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        int arr[] = { 1, 2, 3, 6 }; 
    int n = arr.length; 
    System.out.print(findEle(arr, n)); 
    } 
} 
// This code is contributed by shs.. 

