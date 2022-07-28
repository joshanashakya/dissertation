

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to returns the  
// required count of integers 
static int countWays(int n, int arr[], int k) 
{ 
  
    if (k <= 0 || k >= n) 
        return 0; 
    Set<Integer> s = new HashSet<Integer>(); 
    for(int i = 0; i < n; i++) 
        s.add(arr[i]); 
          
    if (s.size() <= k) 
        return 0; 
  
    // Return the required count 
    return s.size() - k; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 100, 200, 400, 50 }; 
    int k = 3; 
    int n = arr.length; 
    System.out.println(countWays(n, arr, k)); 
} 
} 
  
// This code id contributed by 
// Surendra_Gangwar 

