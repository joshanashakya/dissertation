

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the count of the required sub-sets 
static long count(int arr[], int n, int x) 
{ 
  
    // Every element is divisible by 1 
    if (x == 1) { 
        long ans = (long)Math.pow(2, n) - 1; 
        return ans; 
    } 
  
    // Count of elements which are divisible by x 
    int count = 0; 
    for (int i = 0; i < n; i++) { 
        if (arr[i] % x == 0) 
            count++; 
    } 
  
    long ans = (long)Math.pow(2, count) - 1; 
    return ans; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int []arr = { 2, 4, 3, 5 }; 
    int n = arr.length; 
    int x = 1; 
    System.out.println(count(arr, n, x)); 
} 
} 

