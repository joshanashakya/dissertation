

// Java program to count subarrays 
// having sum less than k. 
import java.io.*; 
  
class GFG { 
  
    // Function to find number of 
    // subarrays having sum less than k. 
    static int countSubarray(int arr[], 
                             int n, int k) 
    { 
        int count = 0; 
  
        for (int i = 0; i < n; i++) { 
            int sum = 0; 
            for (int j = i; j < n; j++) { 
  
                // If sum is less than 
                // k then update sum and 
                // increment count 
                if (sum + arr[j] < k) { 
                    sum = arr[j] + sum; 
                    count++; 
                } 
                else { 
                    break; 
                } 
            } 
        } 
        return count; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int array[] = { 1, 11, 2, 3, 15 }; 
        int k = 10; 
        int size = array.length; 
        int count = countSubarray(array, size, k); 
        System.out.println(count); 
    } 
} 
  
// This code is contributed by Sam007 

