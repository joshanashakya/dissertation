

// Java implementation to find the 
// square root of the number N 
// without using sqrt() function 
class GFG { 
      
    // Function to find the square 
    // root of the number N using BS 
    static int sqrtSearch(int low, int high, int N) 
    { 
      
        // If the range is still valid 
        if (low <= high) { 
      
            // Find the mid-value of the range 
            int mid = (int)(low + high) / 2; 
      
            // Base Case 
            if ((mid * mid <= N) 
                && ((mid + 1) * (mid + 1) > N)) { 
                return mid; 
            } 
      
            // Condition to check if the 
            // left search space is useless 
            else if (mid * mid < N) { 
                return sqrtSearch(mid + 1, high, N); 
            } 
            else { 
                return sqrtSearch(low, mid - 1, N); 
            } 
        } 
        return low; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int N = 25; 
        System.out.println(sqrtSearch(0, N, N)); 
    } 
} 
  
// This code is contributed by Yash_R 

