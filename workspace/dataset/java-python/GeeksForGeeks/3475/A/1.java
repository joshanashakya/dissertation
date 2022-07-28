

// Java implementation of the approach 
  
class GFG 
{ 
  
    // Function that returns true if it is possible 
    // to reach end of the array in exactly k jumps 
    static boolean isPossible(int arr[], int n, int dist, int k) 
    { 
  
        // Variable to store the number of 
        // steps required to reach the end 
        int req = 0; 
  
        int curr = 0; 
        int prev = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
            while (curr != n && arr[curr] - arr[prev] <= dist) 
            { 
                curr++; 
            } 
            req++; 
  
            if (curr == n) 
            { 
                break; 
            } 
            prev = curr - 1; 
        } 
  
        if (curr != n) 
        { 
            return false; 
        } 
  
        // If it is possible to reach the 
        // end in exactly k jumps 
        if (req <= k) 
        { 
            return true; 
        } 
  
        return false; 
    } 
  
    // Returns the minimum maximum distance required 
    // to reach the end of the array in exactly k jumps 
    static int minDistance(int arr[], int n, int k) 
    { 
        int l = 0; 
        int h = arr[n - 1]; 
  
        // Stores the answer 
        int ans = 0; 
  
        // Binary search to calculate the result 
        while (l <= h) 
        { 
            int m = (l + h) / 2; 
            if (isPossible(arr, n, m, k)) 
            { 
                ans = m; 
                h = m - 1; 
            }  
            else
            { 
                l = m + 1; 
            } 
        } 
  
        return ans; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {2, 15, 36, 43}; 
        int n = arr.length; 
        int k = 2; 
  
        System.out.println(minDistance(arr, n, k)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

