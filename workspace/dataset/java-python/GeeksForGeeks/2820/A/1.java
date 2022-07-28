

// Java implementation of the approach 
import java.util.*; 
  
class GFG { 
  
    // Function to return the minimum 
    // number of operations required 
    static int changeTheArray(int arr[], int n) 
    { 
  
        // Minimum and maximum elements from the array 
        int minEle = Arrays.stream(arr).min().getAsInt(); 
        int maxEle = Arrays.stream(arr).max().getAsInt(); 
  
        // To store the minimum number of 
        // operations required 
        int minOperations = Integer.MAX_VALUE; 
        for (int num = minEle; num <= maxEle; num++) { 
  
            // To store the number of operations required 
            // to change every element to either 
            // (num - 1), num or (num + 1) 
            int operations = 0; 
            for (int i = 0; i < n; i++) { 
  
                // If current element is not already num 
                if (arr[i] != num) { 
  
                    // Add the count of operations 
                    // required to change arr[i] 
                    operations += (Math.abs(num - arr[i]) - 1); 
                } 
            } 
  
            // Update the minimum operations so far 
            minOperations = Math.min(minOperations, operations); 
        } 
  
        return minOperations; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 10, 1, 4 }; 
        int n = arr.length; 
        System.out.println(changeTheArray(arr, n)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

