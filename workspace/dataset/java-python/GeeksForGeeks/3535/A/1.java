

// A Naive Java recursive implementation  
// of LCS of two strings  
  
class GFG { 
  
// Returns length of LCS for X[0..m-1], Y[0..n-1]  
    static int lcs(String X, String Y, int m, int n) { 
        if (m == 0 || n == 0) { 
            return 0; 
        } 
  
        if (X.charAt(m - 1) == Y.charAt(n - 1)) { 
            return 1 + lcs(X, Y, m - 1, n - 1); 
        } else { 
            return Math.max(lcs(X, Y, m, n - 1), 
                    lcs(X, Y, m - 1, n)); 
        } 
    } 
// Driver Code  
  
    public static void main(String[] args) { 
        String X = "AGGTAB"; 
        String Y = "GXTXAYB"; 
  
        // Find the length of String  
        int m = X.length(); 
        int n = Y.length(); 
        System.out.println("Length of LCS: " + lcs(X, Y, m, n)); 
  
    } 
} 
  
// This code is contributed by 29AjayKumar 

