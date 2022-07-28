

// Java program to find the length 
// of the longest sub-array with an 
// equal number of odd and even elements 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns the length of 
// the longest sub-array with an equal 
// number of odd and even elements 
static int maxSubarrayLength(int []A, int N) 
{ 
    // Initialize variable to store result 
    int maxLen = 0; 
  
    // Initialize variable to store sum 
    int curr_sum = 0; 
  
    // Create an empty map to store 
    // index of the sum 
    HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>(); 
  
    // Loop through the array 
    for (int i = 0; i < N; i++) 
    { 
        if (A[i] % 2 == 0) 
            curr_sum -= 1; 
        else
            curr_sum += 1; 
  
        // Check if number of even and 
        // odd elements are equal 
        if (curr_sum == 0) 
            maxLen = Math.max(maxLen, i + 1); 
  
        // If curr_sum already exists in map 
        // we have a subarray with 0 sum, i.e, 
        // equal number of odd and even number 
        if (hash.containsKey(curr_sum)) 
            maxLen = Math.max(maxLen, 
                        i - hash.get(curr_sum)); 
  
        // Store the index of the sum 
        else { 
            hash.put(curr_sum, i); 
        } 
    } 
    return maxLen; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 12, 4, 7, 8, 9, 2, 
                        11, 0, 2, 13 }; 
    int n = arr.length; 
  
    System.out.print(maxSubarrayLength(arr, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

