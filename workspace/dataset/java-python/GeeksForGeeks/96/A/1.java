

// Java program to check if a subarray exists 
// with sum greater than the given Array 
import java.util.*; 
  
class GFG{ 
  
    // Function to check whether there exists 
    // a subarray whose sum is greater than 
   // or equal to sum of given array elements 
    static boolean subarrayPossible(int arr[], int n) 
    { 
        // Initialize sum with 0 
        int sum = 0; 
      
        // Checking possible prefix subarrays. 
        // If sum of them is less than or equal 
        // to zero, then return 1 
        for (int i = 0; i < n; i++) { 
            sum += arr[i]; 
      
            if (sum <= 0) 
                return true; 
        } 
      
        // again reset sum to zero 
        sum = 0; 
      
        // Checking possible suffix subarrays. 
        // If sum of them is less than or equal 
        // to zero, then return 1 
        for (int i = n - 1; i >= 0; i--) { 
            sum += arr[i]; 
      
            if (sum <= 0) 
                return true; 
        } 
      
        // Otherwise return 0 
        return false; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int arr[] = { 10, 5, -12, 7, -10, 20, 30, -10, 50, 60 }; 
      
        int size = arr.length; 
      
        if (subarrayPossible(arr, size)) 
            System.out.print("Yes"+"\n"); 
        else
            System.out.print("No"+"\n"); 
    } 
} 
  
// This code is contributed by AbhiThakur 

