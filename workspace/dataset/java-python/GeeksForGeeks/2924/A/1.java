

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to check is there exists a 
// subarray whose sum is a multiple of N 
static void CheckSubarray(int arr[], int N)  
{ 
  
    // Prefix sum array to store cumulative sum 
    int[] presum = new int[N + 1]; 
  
    // Single state dynamic programming 
    // relation for prefix sum array 
    for (int i = 1; i <= N; i += 1)  
    { 
        presum[i] = presum[i - 1] + arr[i - 1]; 
    } 
  
    // Modulo class vector 
    Vector<Integer>[] moduloclass = new Vector[N]; 
    for (int i = 0; i < N; i += 1)  
    { 
        moduloclass[i] = new Vector<>(); 
    } 
  
    // Storing the index value 
    // in the modulo class vector 
    for (int i = 1; i <= N; i += 1) 
    { 
        moduloclass[presum[i] % N].add(i - 1); 
    } 
  
    // If there exists a sub-array with 
    // startig index equal to zero 
    if (moduloclass[0].size() > 0) 
    { 
        System.out.print(0 + " " +  
               moduloclass[0].get(0)); 
        return; 
    } 
  
    for (int i = 1; i < N; i += 1)  
    { 
  
        // In this class, there are more than  
        // two presums%N. Hence difference of  
        // any two subarrays would be a multiple of N 
        if (moduloclass[i].size() >= 2)  
        { 
  
            // 0 based indexing 
            System.out.print(moduloclass[i].get(0) + 1 + 
                       " " + moduloclass[i].get(1)); 
            return; 
        } 
    } 
} 
  
// Driver code 
public static void main(String args[])  
{ 
    int arr[] = {7, 3, 5, 2}; 
  
    int N = arr.length; 
  
    CheckSubarray(arr, N); 
}                      
} 
  
// This code is contributed by 29AjayKumar 

