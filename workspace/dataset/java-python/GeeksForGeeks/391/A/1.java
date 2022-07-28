

// Java program to find the length of 
// the smallest subarray that must be 
// removed in order to maximise the GCD 
class GFG { 
      
    // Function to find the length of 
    // the smallest subarray that must be 
    // removed in order to maximise the GCD 
    static int GetMinSubarrayLength(int a[], int n) 
    { 
      
        // Store the maximum possible 
        // GCD of the resulting subarray 
        int ans = Math.max(a[0], a[n - 1]); 
      
        // Two pointers initially pointing 
        // to the first and last element 
        // respectively 
        int lo = 0, hi = n - 1; 
      
        // Moving the left pointer to the 
        // right if the elements are 
        // divisible by the maximum GCD 
        while (lo < n && a[lo] % ans == 0) 
            lo++; 
      
        // Moving the right pointer to the 
        // left if the elements are 
        // divisible by the maximum GCD 
        while (hi > lo && a[hi] % ans == 0) 
            hi--; 
      
        // Return the length of 
        // the subarray 
        return (hi - lo + 1); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
      
        int arr[] = { 4, 8, 2, 1, 4 }; 
        int N = arr.length; 
      
        int Length = GetMinSubarrayLength(arr, N); 
      
        System.out.println(Length); 
      
    } 
} 
  
// This code is contributed by Yash_R 

