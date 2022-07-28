

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
    // Function to return the sum of the elements 
    // of all possible pairs from the array 
    static int sumPairs(int arr[], int n) 
    { 
  
        // To store the required sum 
        int sum = 0; 
  
        // Nested loop for all possible pairs 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++)  
            { 
  
                // Add the sum of the elements 
                // of the current pair 
                sum += (arr[i] + arr[j]); 
            } 
        } 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3}; 
        int n = arr.length; 
  
        System.out.println(sumPairs(arr, n)); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

