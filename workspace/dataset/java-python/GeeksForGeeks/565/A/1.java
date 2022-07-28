

// Java program to count numbers of k 
// digits that are strictly monotone. 
import java.io.*; 
import java.util.*; 
  
class GFG { 
  
    static int DP_s = 9; 
      
    static int getNumStrictMonotone(int len)  
    { 
        // DP[i][j] is going to store monotone 
        // numbers of length i+1 considering 
        // j+1 digits (1, 2, 3, ..9) 
        int[][] DP = new int[len][DP_s]; 
      
        // Unit length numbers 
        for (int i = 0; i < DP_s; ++i) 
        DP[0][i] = i + 1; 
      
        // Building dp[] in bottom up 
        for (int i = 1; i < len; ++i) 
             for (int j = 1; j < DP_s; ++j) 
                DP[i][j] = DP[i - 1][j - 1]  
                             + DP[i][j - 1]; 
      
        return DP[len - 1][DP_s - 1]; 
    } 
    public static void main(String[] args)  
    { 
        int n = 2; 
        System.out.println(getNumStrictMonotone(n)); 
    } 
} 
  
// This code is contributed by Gitanjali. 

