

// Java implementation of the above approach  
class GFG 
{ 
      
    // Function to return sum of subarray from l to r  
    static int sum(int arr[], int l, int r)  
    {  
        // calculate sum by a loop from l to r  
        int s = 0;  
        for (int i = l; i <= r; i++) 
        {  
            s += arr[i];  
        }  
        return s;  
    }  
      
    // dp to store the values of sub problems  
    static int dp[][][] = new int[101][101][101] ;  
      
    static int solve(int arr[], int l, int r, int k)  
    {  
        // if length of the array is less than k  
        // return the sum  
        if (r - l + 1 <= k)  
            return sum(arr, l, r);  
      
        // if the value is previously calculated  
        if (dp[l][r][k] != 0)  
            return dp[l][r][k];  
      
        // else calculate the value  
        int sum_ = sum(arr, l, r);  
        int len_r = (r - l + 1) - k;  
        int len = (r - l + 1);  
        int ans = 0;  
      
        // select all the sub array of length len_r  
        for (int i = 0; i < len - len_r + 1; i++)  
        {  
            // get the sum of that sub array  
            int sum_sub = sum(arr, i + l, i + l + len_r - 1);  
      
            // check if it is the maximum or not  
            ans = Math.max(ans, (sum_ - sum_sub) + (sum_sub -  
                    solve(arr, i + l, i + l + len_r - 1, k)));  
        }  
      
        // store it in the table  
        dp[l][r][k] = ans;  
      
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    { 
      
        int arr[] = { 10, 15, 20, 9, 2, 5 }, k = 2;  
        int n = arr.length;  
  
        System.out.println(solve(arr, 0, n - 1, k));  
      
    } 
} 
  
// This code is contributed by AnkitRai01 

