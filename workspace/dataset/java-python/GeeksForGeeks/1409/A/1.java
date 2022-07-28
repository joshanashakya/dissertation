

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
  
// Function to return the sum of the elements 
// of all possible pairs from the array 
static int sumPairs(int arr[], int n) 
{ 
  
    // To store the required sum 
    int sum = 0; 
  
    // For every element of the array 
    for (int i = 0; i < n; i++)  
    { 
  
        // It appears (2 * n) times 
        sum = sum + (arr[i] * (2 * n)); 
    } 
  
    return sum; 
} 
  
// Driver code 
static public void main(String []arg) 
{ 
    int arr[] = { 1, 2, 3 }; 
    int n = arr.length; 
  
    System.out.println(sumPairs(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

