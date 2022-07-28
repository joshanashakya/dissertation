

// Java implementation of the approach  
class GFG 
{ 
      
    // Function to return the number of  
    // subarrays with sum atleast k  
    static int k_sum(int a[], int n, int k)  
    {  
        // To store the right index  
        // and the current sum  
        int r = 0, sum = 0;  
      
        // To store the number of sub-arrays  
        int ans = 0;  
      
        // For all left indexes  
        for (int l = 0; l < n; l++) 
        {  
      
            // Get elements till current sum  
            // is less than k  
            while (sum < k)  
            {  
                if (r == n)  
                    break;  
                else 
                {  
                    sum += a[r];  
                    r++;  
                }  
            }  
      
            // No such subarray is possible  
            if (sum < k)  
                break;  
      
            // Add all possible subarrays  
            ans += n - r + 1;  
      
            // Remove the left most element  
            sum -= a[l];  
        }  
      
        // Return the required answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int a[] = { 6, 1, 2, 7 }, k = 10;  
        int n = a.length;  
      
        System.out.println(k_sum(a, n, k));  
    } 
} 
  
// This code is contributed by kanugargng 

