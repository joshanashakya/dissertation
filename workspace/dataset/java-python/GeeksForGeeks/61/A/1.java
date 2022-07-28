

// Java implementation to find the  
// minimum of the maximum difference  
// of the adjacent elements after  
// removing K elements from the array  
class GFG { 
      
    // Function to find the minimum  
    // of the maximum difference of the  
    // adjacent elements after removing  
    // K elements from the array  
    static int minimumAdjacentDifference(int a[],  
                            int n, int k)  
    {  
        // Intialising the  
        // minimum difference  
        int minDiff = Integer.MAX_VALUE;  
      
        // Iterating over all  
        // subarrays of size n-k  
        for (int i = 0; i <= k; i++) {  
              
            // Maximum difference after  
            // removing elements  
            int maxDiff = Integer.MIN_VALUE;  
            for (int j = 0; j < n - k - 1; j++) {  
                for (int p = i; p <= i + j; p++) {  
                    maxDiff = Math.max(maxDiff,  
                        a[p + 1] - a[p]);  
                }  
            } 
   
            // Minimum Adjacent Difference  
            minDiff = Math.min(minDiff, maxDiff);  
        }  
        return minDiff;  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        int n = 5;  
        int k = 2;  
      
        int []a = { 3, 7, 8, 10, 14 };  
      
        System.out.println(minimumAdjacentDifference(a, n, k));  
    }  
} 
  
// This code is contributed by Yash_R 

