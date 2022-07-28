

// Java program to find the Length of Longest  
// subsequence formed by consecutive segments 
// of at least length K 
  
class GFG { 
  
    // Returns the length of the longest common subsequence 
    // with a minimum of length of K consecutive segments 
    static int longestSubsequenceCommonSegment(int k, String s1,  
                                               String s2) 
    { 
        // length of strings 
        int n = s1.length(); 
        int m = s2.length(); 
      
        // declare the lcs and cnt array 
        int lcs[][] = new int[n + 1][m + 1]; 
        int cnt[][] = new int[n + 1][m + 1]; 
      
      
        // iterate from i=1 to n and j=1 to j=m 
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= m; j++) { 
      
                // stores the maximum of lcs[i-1][j] and lcs[i][j-1] 
                lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]); 
      
                // when both the characters are equal 
                // of s1 and s2 
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) 
                    cnt[i][j] = cnt[i - 1][j - 1] + 1;  
      
                // when length of common segment is 
                // more than k, then update lcs answer  
                // by adding that segment to the answer 
                if (cnt[i][j] >= k)  
                { 
      
                    // formulate for all length of segments 
                    // to get the longest subsequence with  
                    // consecutive Common Segment of length  
                    // of min k length 
                    for (int a = k; a <= cnt[i][j]; a++)  
      
                        // update lcs value by adding  
                        // segment length 
                        lcs[i][j] = Math.max(lcs[i][j],  
                                        lcs[i - a][j - a] + a); 
                      
                } 
            } 
        } 
      
        return lcs[n][m]; 
    } 
      
    // driver code to check the above fucntion 
    public static void main(String[] args) 
    { 
        int k = 4; 
        String s1 = "aggasdfa"; 
        String s2 = "aggajasdfa"; 
        System.out.println(longestSubsequenceCommonSegment(k, s1, s2)); 
    } 
} 
  
// This code is contributed by prerna saini. 

