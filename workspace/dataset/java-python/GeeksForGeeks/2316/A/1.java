

// Java implementation of the above approach 
  
import java.util.*; 
class solution 
{ 
// Function to find the minimum operations 
static long minimumMoves(int a[], int n) 
{ 
   
    long operations = 0; 
   
    // Sort the given array 
    Arrays.sort(a); 
   
    // Count operations by assigning a[i] = i+1 
    for (int i = 0; i < n; i++) 
        operations += (long)Math.abs(a[i] - (i + 1)); 
   
    return operations; 
} 
   
// Driver Code 
public static void main(String args[]) 
{ 
    int arr[] = { 5, 3, 2 }; 
    int n = arr.length; 
   
    System.out.print(minimumMoves(arr, n)); 
  
} 
  
} 
//contributed by Arnab Kundu 

