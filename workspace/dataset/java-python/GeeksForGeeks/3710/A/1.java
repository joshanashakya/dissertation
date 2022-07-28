

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to return the minimum value of k  
    // that satisfies the given condition  
    static int findMinimumK(int a[],  
                            int n, int s)  
    {  
        // Find the maximum element  
        int maximum = a[0];  
          
        for (int i = 0; i < n; i++)  
        {  
            maximum = Math.max(maximum, a[i]);  
        }  
      
        // Lowest answer can be 1 and the  
        // highest answer can be (maximum + 1)  
        int low = 1, high = maximum + 1;  
      
        int ans = high;  
      
        // Binary search  
        while (low <= high) 
        {  
      
            // Get the mid element  
            int mid = (low + high) / 2;  
            int sum = 0;  
      
            // Calculate the sum after dividing  
            // the array by new K which is mid  
            for (int i = 0; i < n; i++) 
            {  
                sum += (int)(a[i] / mid);  
            }  
      
            // Search in the second half  
            if (sum > s)  
                low = mid + 1;  
      
            // First half  
            else
            {  
                ans = Math.min(ans, mid);  
                high = mid - 1;  
            }  
        }  
        return ans;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int a[] = { 10, 7, 8, 10, 12, 19 };  
        int n = a.length;  
        int s = 27;  
      
        System.out.println(findMinimumK(a, n, s));  
    }  
}     
  
// This code is contributed by AnkitRai01 

