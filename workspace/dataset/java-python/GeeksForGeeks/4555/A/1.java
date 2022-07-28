

// Java implementation of 
// the above approach 
import java.io.*; 
  
class GFG 
{ 
static int mod = 1000000000; 
  
// Find the number of ways 
// to reach the end 
static int ways(int i,  
                int arr[], int n) 
{ 
    // Base case 
    if (i == n - 1) 
        return 1; 
  
    int sum = 0; 
  
    // Recursive structure 
    for (int j = 1; j + i < n &&  
                    j <= arr[i]; j++) 
    { 
        sum += (ways(i + j, 
                     arr, n)) % mod; 
        sum %= mod; 
    } 
    return sum % mod; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int arr[] = { 5, 3, 1, 4, 3 }; 
      
    int n = arr.length; 
  
    System.out.println (ways(0, arr, n)); 
} 
} 
  
// This code is contributed by ajit 

