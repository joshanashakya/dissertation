

// Java implementation of the approach 
class GFG { 
  
    // Function to return the area 
    // of the remaining plot 
    static int remainingArea(int N, int M, int K) 
    { 
  
        // Continue while plot has positive area 
        // and there are persons left 
        while (K-- > 0 && N > 0 && M > 0) { 
  
            // If length > breadth 
            // then subtract breadth from length 
            if (N > M) 
                N = N - M; 
  
            // Else subtract length from breadth 
            else
                M = M - N; 
        } 
  
        if (N > 0 && M > 0) 
            return N * M; 
        else
            return 0; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 5, M = 3, K = 2; 
  
        System.out.println(remainingArea(N, M, K)); 
    } 
} 
  
/* This code contributed by PrinciRaj1992 */

