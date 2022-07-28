

// Java program to count common subsequence in two strings 
public class GFG { 
      
    // return the number of common subsequence in  
    // two strings  
    static int CommomSubsequencesCount(String s, String t)  
    {  
        int n1 = s.length();  
        int n2 = t.length();  
        int dp[][] = new int [n1+1][n2+1];  
        char ch1,ch2 ; 
        
        for (int i = 0; i <= n1; i++) {  
            for (int j = 0; j <= n2; j++) {  
                dp[i][j] = 0;  
            }  
        }  
        
        // for each character of S  
        for (int i = 1; i <= n1; i++) {  
        
            // for each character in T  
            for (int j = 1; j <= n2; j++) {  
                  
                ch1 = s.charAt(i - 1); 
                ch2 = t.charAt(j - 1); 
                  
                // if character are same in both   
                // the string                  
                if (ch1 == ch2)   
                    dp[i][j] = 1 + dp[i][j - 1] + dp[i - 1][j];              
                else 
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j] -   
                                            dp[i - 1][j - 1];              
            }  
        }  
        
        return dp[n1][n2];  
    }  
    // Driver code  
    public static void main (String args[]){ 
          
          String s = "ajblqcpdz";  
          String t = "aefcnbtdi";  
            
        System.out.println(CommomSubsequencesCount(s, t));  
            
    } 
  
// This code is contributed by ANKITRAI1 
} 

