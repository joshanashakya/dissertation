

// Java implementation to find the  
// Minimum time required to cover a Binary Array  
class GFG { 
  
    // function to calculate the time  
    static int solve(int []arr, int n)  
    {  
      
        int k = arr.length;  
      
        // Map to mark or store the binary values  
        int mp[] = new int[n + 2];  
      
        // Firstly fill the boolean  
        // array with all zeroes  
        for (int i = 0; i <= n; i++) {  
            mp[i] = 0;  
        }  
      
        // Mark the 1s  
        for (int i = 0; i < k; i++) {  
            mp[arr[i]] = 1;  
        }  
      
        // Number of 0s until first '1' occurs  
        int leftSegment = arr[0] - 1;  
      
        // Maximum Number of 0s in between 2 '1's.  
        for (int i = 1; i < k; i++) {  
            leftSegment = Math.max(leftSegment, arr[i] - arr[i - 1] - 1);  
        }  
      
        // Number of 0s from right until first '1' occurs  
        int rightSegment = n - arr[k - 1];  
      
        // Return maximum from left and right segment  
        int maxSegment = Math.max(leftSegment, rightSegment);  
      
        int tim;  
      
        // check if count is odd  
        if ((maxSegment & 1) == 1)  
            tim = (maxSegment / 2) + 1;  
      
        // check ifcount is even  
        else
            tim = maxSegment / 2;  
      
        // return the time  
        return tim;  
    }  
      
    // driver code  
    public static void main (String[] args) 
    {  
        // initialise N  
        int N = 5;  
      
        // array initialisation  
        int arr[] = { 1, 4 };  
      
        System.out.println(solve(arr, N));  
    }  
} 
  
// This code is contributed by AnkitRai01 

