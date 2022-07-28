

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
  
// Function to return the count 
// of all valid subsequences 
static int countSubSeq(int arr[], int n, int k) 
{ 
  
    // To store the count of elements 
    // which are divisible by k 
    int count = 0; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // If current element is divisible by 
        // k then increment the count 
        if (arr[i] % k == 0)  
        { 
            count++; 
        } 
    } 
  
    // Total (2^n - 1) non-empty subsequences 
    // are possible with n element 
    return (int) (Math.pow(2, count) - 1); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 2, 3, 6 }; 
    int n = arr.length; 
    int k = 3; 
  
    System.out.println(countSubSeq(arr, n, k)); 
} 
}  
  
// This code is contributed by Rajput-Ji 

