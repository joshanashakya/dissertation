

// Java implementation of the approach 
class GFG { 
  
    // Function to return the minimum 
    // number of cubes whose sum is k 
    static int MinOfCubed(int k) 
    { 
        // If k is less than the 2^3 
        if (k < 8) 
            return k; 
  
        // Initialize with the maximum 
        // number of cubes required 
        int res = k; 
        for (int i = 1; i <= k; i++) { 
            if ((i * i * i) > k) 
                return res; 
            res = Math.min(res, MinOfCubed(k - (i * i * i)) + 1); 
        } 
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int num = 15; 
        System.out.println(MinOfCubed(num)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

