

//Java program to find Edit Distance (when only two  
// operations are allowed, insert and delete) using LCS. 
  
class GFG { 
  
    static int editDistanceWith2Ops(String X, String Y) { 
        // Find LCS  
        int m = X.length(), n = Y.length(); 
        int L[][] = new int[m + 1][n + 1]; 
        for (int i = 0; i <= m; i++) { 
            for (int j = 0; j <= n; j++) { 
                if (i == 0 || j == 0) { 
                    L[i][j] = 0; 
                } else if (X.charAt(i - 1) == Y.charAt(j - 1)) { 
                    L[i][j] = L[i - 1][j - 1] + 1; 
                } else { 
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]); 
                } 
            } 
        } 
        int lcs = L[m][n]; 
  
        // Edit distance is delete operations +  
        // insert operations.  
        return (m - lcs) + (n - lcs); 
    } 
  
    /* Driver program to test above function */
    public static void main(String[] args) { 
        String X = "abc", Y = "acd"; 
        System.out.println(editDistanceWith2Ops(X, Y)); 
  
    } 
} 
/* This Java code is contributed by 29AjayKumar*/

