

// Java code to find minimum cost to 
// make two strings identical  
import java.io.*; 
  
class GFG { 
      
    // Returns length of LCS for X[0..m-1], Y[0..n-1]  
    static int lcs(String X, String Y, int m, int n) 
    { 
        int L[][]=new int[m + 1][n + 1]; 
      
        /* Following steps build L[m+1][n+1] in bottom 
        up fashion. Note that L[i][j] contains length 
        of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i = 0; i <= m; i++) 
        { 
            for (int j = 0; j <= n; j++) 
            { 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
      
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) 
                    L[i][j] = L[i - 1][j - 1] + 1; 
      
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]); 
            } 
        } 
      
        // L[m][n] contains length of LCS  
        // for X[0..n-1] and Y[0..m-1]  
        return L[m][n]; 
    } 
      
    // Returns cost of making X[] and Y[] identical.  
    // costX is cost of removing a character from X[]  
    // and costY is cost of removing a character from Y[]/ 
    static int findMinCost(String X, String Y, int costX, int costY) 
    { 
        // Find LCS of X[] and Y[] 
        int m = X.length(); 
        int n = Y.length(); 
        int len_LCS; 
        len_LCS = lcs(X, Y, m, n); 
      
        // Cost of making two strings identical 
        //  is SUM of following two 
        // 1) Cost of removing extra characters 
        // from first string 
        // 2) Cost of removing extra characters 
        // from second string 
        return costX * (m - len_LCS) + 
               costY * (n - len_LCS); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        String X = "ef"; 
        String Y = "gh"; 
        System.out.println( "Minimum Cost to make two strings "
                            + " identical is = " 
                            + findMinCost(X, Y, 10, 20)); 
          
    } 
} 
  
// This code is contributed by vt_m 

