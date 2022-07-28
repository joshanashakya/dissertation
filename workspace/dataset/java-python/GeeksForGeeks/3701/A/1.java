

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the row and  
    // the column of the given integer  
    static int[] solve(int n)  
    {  
        int low = 1, high = (int)1e4, x = n, p = 0;  
      
        // Binary search for the row number  
        while (low <= high)  
        {  
            int mid = (low + high) / 2;  
            int sum = (mid * (mid + 1)) / 2;  
      
            // Condition to get the maximum  
            // x that satisfies the criteria  
            if (x - sum >= 1)  
            {  
                p = mid;  
                low = mid + 1;  
            }  
            else 
            {  
                high = mid - 1;  
            }  
        }  
      
        int start = 1, end = (int)1e4, y = 1, q = 0;  
      
        // Binary search for the column number  
        while (start <= end)  
        {  
            int mid = (start + end) / 2;  
            int sum = (mid * (mid + 1)) / 2;  
      
            // Condition to get the maximum  
            // y that satisfies the criteria  
            if (y + sum <= n)  
            {  
                q = mid;  
                start = mid + 1;  
            }  
            else 
            {  
                end = mid - 1;  
            }  
        }  
      
        // Get the row and the column number  
        x = x - (p * (p + 1)) / 2;  
        y = y + (q * (q + 1)) / 2;  
        int r = x;  
        int c = q + 1 - n + y;  
      
        // Return the pair  
        int ans[] = { r, c };  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 5;  
      
        int []p = solve(n);  
        System.out.println(p[0] + " " + p[1]);  
  
    }  
} 
  
// This code is contributed by AnkitRai01 

