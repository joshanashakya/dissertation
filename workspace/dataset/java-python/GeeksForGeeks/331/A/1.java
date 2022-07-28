

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the count 
// of possible subsets 
static int cntSubsets(int []arr, int n) 
{ 
    int []a = new int[n]; 
    int []b = new int[n]; 
  
    a[0] = b[0] = 1; 
  
    for (int i = 1; i < n; i++)  
    { 
  
        // If previous element was 0 then 0 
        // as well as 1 can be appended 
        a[i] = a[i - 1] + b[i - 1]; 
  
        // If previous element was 1 then 
        // only 0 can be appended 
        b[i] = a[i - 1]; 
    } 
  
    // Store the count of all possible subsets 
    int result = a[n - 1] + b[n - 1]; 
  
    return result; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 3, 5, 7 }; 
    int n = arr.length; 
  
    System.out.println(cntSubsets(arr, n)); 
} 
} 
  
// This code is contributed by Princi Singh 

