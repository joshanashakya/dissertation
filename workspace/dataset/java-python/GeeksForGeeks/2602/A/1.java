

// Java program to count numbers  
// of n digits that are monotone. 
  
class GFG  
{ 
    // Considering all possible  
    // digits as {1, 2, 3, ..9} 
    static final int DP_s = 9; 
      
    static int getNumMonotone(int len) 
    { 
      
        // DP[i][j] is going to store  
        // monotone numbers of length  
        // i+1 considering j+1 digits. 
        int[][] DP = new int[len][DP_s]; 
      
        // Unit length numbers 
        for (int i = 0; i < DP_s; ++i) 
            DP[0][i] = i + 1; 
      
        // Single digit numbers 
        for (int i = 0; i < len; ++i) 
            DP[i][0] = 1; 
      
        // Filling rest of the entries  
        // in bottom up manner. 
        for (int i = 1; i < len; ++i) 
            for (int j = 1; j < DP_s; ++j) 
                DP[i][j] = DP[i - 1][j]  
                           + DP[i][j - 1]; 
      
        return DP[len - 1][DP_s - 1]; 
    } 
      
    // Driver code. 
    public static void main (String[] args)  
    { 
        System.out.println(getNumMonotone(10)); 
    } 
} 
  
// This code is contributed by Ansu Kumari. 

