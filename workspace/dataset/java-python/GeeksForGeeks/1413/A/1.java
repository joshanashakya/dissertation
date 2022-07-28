

import java.util.Arrays; 
class GFG { 
  
    // Function to find minimum XOR pair 
    static int minXOR(int arr[], int n) 
    { 
        // Sort given array 
        Arrays.parallelSort(arr); 
  
        int minXor = Integer.MAX_VALUE; 
        int val = 0; 
  
        // calculate min xor of consecutive pairs 
        for (int i = 0; i < n - 1; i++) { 
            val = arr[i] ^ arr[i + 1]; 
            minXor = Math.min(minXor, val); 
        } 
  
        return minXor; 
    } 
  
    // Driver program 
    public static void main(String args[]) 
    { 
        int arr[] = { 9, 5, 3 }; 
        int n = arr.length; 
        System.out.println(minXOR(arr, n)); 
    } 
} 
  
// This code is contributed by Sumit Ghosh 

