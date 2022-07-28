

// Java program to find maximum value (arr[i]-i) 
// - (arr[j]-j) in an array. 
import java.util.*; 
  
class GFG { 
      
// Returns maximum value of 
// (arr[i]-i) - (arr[j]-j) 
static int findMaxDiff(int arr[], int n)  
{ 
    if (n < 2) { 
    System.out.print("Invalid "); 
    return 0; 
    } 
  
    // Use two nested loops to find the result 
    int res = Integer.MIN_VALUE; 
    for (int i = 0; i < n; i++) 
    for (int j = 0; j < n; j++) 
        if (res < (arr[i] - arr[j] - i + j)) 
        res = (arr[i] - arr[j] - i + j); 
  
    return res; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = {9, 15, 4, 12, 13}; 
    int n = arr.length; 
    System.out.print(findMaxDiff(arr, n)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

