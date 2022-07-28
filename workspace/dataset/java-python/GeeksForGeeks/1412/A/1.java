

// Java program to find minimum XOR value in an array. 
class GFG { 
  
    // Returns minimum xor value of pair in arr[0..n-1] 
    static int minXOR(int arr[], int n) 
    { 
        int min_xor = Integer.MAX_VALUE; // Initialize result 
  
        // Generate all pair of given array 
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
  
                // update minimum xor value if required 
                min_xor = Math.min(min_xor, arr[i] ^ arr[j]); 
  
        return min_xor; 
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

