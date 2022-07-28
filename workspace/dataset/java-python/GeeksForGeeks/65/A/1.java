

// Java implementation for the 
// above mentioned recursive approach 
class GFG { 
      
    // Function to find the maximum subset sum 
    static int maxSum(int p0, int p1, int a[], int pos, int n) 
    { 
        if (pos == n) { 
            if (p0 == p1) 
                return p0; 
            else
                return 0; 
        } 
  
        // Ignore the current element 
        int ans = maxSum(p0, p1, a, pos + 1, n); 
      
        // including element in partition 1 
        ans = Math.max(ans, maxSum(p0 + a[pos], p1, a, pos + 1, n)); 
      
        // including element in partition 2 
        ans = Math.max(ans, maxSum(p0, p1 + a[pos], a, pos + 1, n)); 
        return ans; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        // size of the array 
        int n = 4; 
        int a[] = { 1, 2, 3, 6 }; 
        System.out.println(maxSum(0, 0, a, 0, n)); 
          
    } 
} 
  
// This code is contributed by AnkitRai01 

