

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the maximum sum  
    // in a subarray of size k  
    static int maxSum(int arr[], int n, int k)  
    {  
        // k must be greater  
        if (n < k)  
        {  
            return -1;  
        }  
      
        // Compute sum of first window of size k  
        int res = 0;  
        for (int i = 0; i < k; i++)  
            res += arr[i];  
      
        // Compute sums of remaining windows by  
        // removing first element of previous  
        // window and adding last element of  
        // current window.  
        int curr_sum = res;  
        for (int i = k; i < n; i++)  
        {  
            curr_sum += arr[i] - arr[i - k];  
            res = Math.max(res, curr_sum);  
        }  
      
        return res;  
    }  
      
    // Function to return the length of subarray  
    // Sum of all the subarray of this  
    // length is less than or equal to K  
    static int solve(int arr[], int n, int k)  
    {  
        int max_len = 0, l = 0, r = n, m;  
      
        // Binary search from l to r as all the  
        // array elements are positive so that  
        // the maximum subarray sum is monotonically  
        // increasing  
        while (l <= r) 
        {  
            m = (l + r) / 2;  
      
            // Check if the subarray sum is  
            // greater than K or not  
            if (maxSum(arr, n, m) > k)  
                r = m - 1;  
            else 
            {  
                l = m + 1;  
      
                // Update the maximum length  
                max_len = m;  
            }  
        }  
        return max_len;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int arr[] = { 1, 2, 3, 4, 5 };  
        int n = arr.length;  
          
        int k = 10;  
      
        System.out.println(solve(arr, n, k));  
    }  
} 
  
// This code is contributed by AnkitRai01 

