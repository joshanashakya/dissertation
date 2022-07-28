

// Java implementation of the above approach 
  
import java.io.*; 
import java.util.*; 
class GFG { 
  
// Function to find average 
static double average(int arr[], int n, int k) 
{ 
    double total = 0; 
  
    // base case if 2*k>=n 
    // means all element get removed 
    if (2 * k >= n) 
        return 0; 
  
    // first sort all elements 
    Arrays.sort(arr); 
    int start = k, end = n - k - 1; 
  
    // sum of req number 
    for (int i = start; i <= end; i++) 
        total += arr[i]; 
  
    // find average 
    return (total / (n - 2 * k)); 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
            int arr[] = { 1, 2, 4, 4, 5, 6 }; 
    int n = arr.length; 
    int k = 2; 
  
    System.out.println( average(arr, n, k)); 
      
} 
} 
// This code is contributed by anuj_67.. 

