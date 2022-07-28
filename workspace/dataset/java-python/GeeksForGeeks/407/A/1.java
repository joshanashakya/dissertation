

// Java implementation of the approach 
class GfG { 
  
    // Function to return the maximum average 
    // of the sub-array with size 
    // atleast x and atmost y 
    static double maxAvgSubArray(int a[], int n, int x, int y) 
    { 
  
        // Calculate the prefix sum array 
        int prefix[] = new int[n]; 
        prefix[0] = a[0]; 
        for (int i = 1; i < n; i++) 
            prefix[i] = prefix[i - 1] + a[i]; 
  
        double maximum = 0; 
  
        // Iterate over all sub-arrays 
        for (int i = 0; i < n; i++) { 
  
            // Sub-arrays of size X to Y 
            for (int j = i + x - 1; j < i + y && j < n; j++) { 
  
                // Get the sum of the sub-array 
                double sum = prefix[j]; 
                if (i > 0) 
                    sum -= prefix[i - 1]; 
  
                // Find average of sub-array 
                double current = sum / (double)(j - i + 1); 
  
                // Store the maximum of average 
                maximum = Math.max(maximum, current); 
            } 
        } 
  
        return maximum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a[] = { 6, 7, 8, 3, 2, 4, 2 }; 
        int X = 2, Y = 4; 
        int n = a.length; 
        System.out.println(maxAvgSubArray(a, n, X, Y)); 
    } 
} 

