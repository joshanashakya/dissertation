

// Java implementation of the approach 
import java.util.Arrays; 
  
class GFG 
{ 
      
// Function to return the maximum 
// required sum of the pairs 
static int maxSum(int a[], int n) 
{ 
  
    // Sort the array 
    Arrays.sort(a); 
  
    // To store the sum 
    int sum = 0; 
  
    // Start making pairs of every two 
    // consecutive elements as n is even 
    for (int i = 0; i < n - 1; i += 2) 
    { 
  
        // Minimum element of the current pair 
        sum += a[i]; 
    } 
  
    // Return the maximum possible sum 
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 3, 2, 1, 4, 5 }; 
    int n = arr.length; 
  
    System.out.println(maxSum(arr, n)); 
} 
} 
  
// This code is contributed by Code_Mech 

