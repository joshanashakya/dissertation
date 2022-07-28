

// Java implementation of the above approach 
import java.util.*; 
  
public class GFG{ 
// Function that count the length 
// of longest subarray with product 
// greater than or equals to zero 
    static int maxLength(int arr[], int N) 
    { 
        int product = 1, len = 0; 
      
        for (int i = 0; i < N; i++) { 
            product *= arr[i]; 
        } 
      
        // If product is greater than 
        // zero, return array size 
        if (product >= 0) { 
            return N; 
        } 
      
        // Traverse the array and if 
        // any negative element found 
        // then update the length of 
        // longest subarray with the 
        // length of left and right subarray 
        for (int i = 0; i < N; i++) { 
            if (arr[i] < 0) { 
                len = Math.max(len, Math.max(N - i - 1, i)); 
            } 
        } 
      
        return len; 
    } 
      
    // Driver Code 
    public static void main(String args[])  
    { 
        int arr[] = { -1, 1, 1, -2, 3, 2, -1 }; 
        int N = arr.length; 
        System.out.println(maxLength(arr, N)); 
      
    } 
} 
  
// This code is contributed by AbhiThakur 

