

// Java implementation of the approach 
import java.util.Arrays; 
  
class GFG  
{ 
  
// Function to return the length 
// of the largest subsequence with 
// minimum possible LCM 
static int maxLen(int[] arr, int n) 
{ 
    // Minimum value from the array 
    int min_val = Arrays.stream(arr).min().getAsInt(); 
  
    // To store the frequency of the 
    // minimum element in the array 
    int freq = 0; 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // If current element is equal 
        // to the minimum element 
        if (arr[i] == min_val) 
            freq++; 
    } 
  
    return freq; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 1, 3, 1 }; 
    int n = arr.length; 
  
    System.out.println(maxLen(arr, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

