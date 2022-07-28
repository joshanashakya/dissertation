

// Java implementation of the approach 
class GfG { 
  
    // Function to return the minimum 
    // operations required 
    static int minOperations(int n, int m) 
    { 
        if (m % n != 0) 
            return -1; 
  
        int minOperations = 0; 
        int q = m / n; 
  
        // Counting all 2s 
        while (q % 2 == 0) { 
            q = q / 2; 
            minOperations++; 
        } 
  
        // Counting all 3s 
        while (q % 3 == 0) { 
            q = q / 3; 
            minOperations++; 
        } 
  
        // If q contained only 2 and 3 
        // as the only prime factors 
        // then it must be 1 now 
        if (q == 1) 
            return minOperations; 
  
        return -1; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 120, m = 51840; 
        System.out.println(minOperations(n, m)); 
    } 
} 

