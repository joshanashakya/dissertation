

// Java program to find the maximum 
// possible sum of a window in one 
// array such that elements in same 
// window of other array are unique. 
import java.util.HashSet; 
import java.util.Set; 
  
public class MaxPossibleSuminWindow 
{ 
    // Function to return maximum sum of window 
    // in A[] according to given constraints. 
    static int returnMaxSum(int A[], int B[], int n) 
    { 
  
        // Map is used to store elements 
        // and their counts. 
        Set<Integer> mp = new HashSet<Integer>(); 
  
        int result = 0; // Initialize result 
  
        // calculating the maximum possible 
        // sum for each subarray containing 
        // unique elements. 
        int curr_sum = 0, curr_begin = 0; 
        for (int i = 0; i < n; ++i) 
        { 
            // Remove all duplicate 
            // instances of A[i] in 
            // current window. 
            while (mp.contains(A[i])) 
            { 
                mp.remove(A[curr_begin]); 
                curr_sum -= B[curr_begin]; 
                curr_begin++; 
            } 
  
            // Add current instance of A[i] 
            // to map and to current sum. 
            mp.add(A[i]); 
            curr_sum += B[i]; 
  
            // Update result if current 
            // sum is more. 
            result = Integer.max(result, curr_sum); 
  
        } 
        return result; 
    } 
  
    //Driver Code to test above method 
    public static void main(String[] args) 
    { 
        int A[] = { 0, 1, 2, 3, 0, 1, 4 }; 
        int B[] = { 9, 8, 1, 2, 3, 4, 5 }; 
        int n = A.length; 
        System.out.println(returnMaxSum(A, B, n)); 
    } 
} 
// This code is contributed by Sumit Ghosh 

