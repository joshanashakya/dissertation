

import java.util.*;  
  
class GFG  
{ 
  
    static int dp[][] = new int[1000][1000]; 
  
    // Checking for prime 
    static boolean isprime(long num){ 
        int i; 
        if (num <= 1) 
            return false; 
        for (i = 2; i * i <= num; i++) { 
            if (num % i == 0) { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Conversion of string to int 
    static long convert(String s, int i, int j) 
    { 
        long temp = 0; 
        int k; 
        for (k = i; k <= j; k++) { 
            temp = temp * 10 + (s.charAt(k) - '0'); 
        } 
        return temp; 
    } 
  
    // Function to get the minimum splits 
    static int solve(String s, int i, int j) 
    { 
        int k; 
  
        // Convert the segment to integer or long long 
        long num = convert(s, i, j); 
  
        // Number is prime 
        if (isprime(num)) { 
            return 0; 
        } 
  
        // If a single digit is prime 
        if (i == j && isprime(num)) 
            return 0; 
      
        // If single digit is not prime 
        if (i == j && isprime(num) == false) 
            return Integer.MAX_VALUE; 
      
        if (dp[i][j] != 0) 
            return dp[i][j]; 
      
        int ans = Integer.MAX_VALUE; 
        for (k = i; k < j; k++) { 
  
            // Recur for left segment 
            int left = solve(s, i, k); 
            if (left == Integer.MAX_VALUE) { 
                continue; 
            }  
      
            // Recur for right segment 
            int right = solve(s, k + 1, j); 
            if (right == Integer.MAX_VALUE) { 
                continue; 
            } 
  
            // Minimum from left and right segment 
            ans = Math.min(ans, 1 + left + right); 
        } 
        return dp[i][j] = ans; 
    } 
      
    public static void main (String []args) 
    { 
      
        String s = "2352"; 
        int n = s.length(); 
      
        int cuts = solve(s, 0, n - 1); 
        if (cuts != Integer.MAX_VALUE) { 
            System.out.print(cuts); 
        } 
        else { 
            System.out.print("Not Possible"); 
        } 
    }  
} 
  
// This code is contributed by chitranayal 

