

import java.util.Arrays; 
  
// Java program to find the Smallest number  
// with given sum of digits and 
// sum of square of digits 
class GFG { 
  
    static int dp[][] = new int[901][8101]; 
  
// Top down dp to find minimum number of digits with 
// given sum of dits a and sum of square of digits as b 
    static int minimumNumberOfDigits(int a, int b) { 
        // Invalid condition  
        if (a > b || a < 0 || b < 0 || a > 900 || b > 8100) { 
            return -1; 
        } 
  
        // Number of digits satisfied 
        if (a == 0 && b == 0) { 
            return 0; 
        } 
  
        // Memoization 
        if (dp[a][b] != -1) { 
            return dp[a][b]; 
        } 
  
        // Initialize ans as maximum as we have to find the   
        // minimum number of digits  
        int ans = 101; 
  
        // Check for all possible combinations of digits 
        for (int i = 9; i >= 1; i--) { 
  
            // recurrence call  
            int k = minimumNumberOfDigits(a - i, b - (i * i)); 
  
            // If the combination of digits cannot give sum as a  
            // and sum of square of digits as b  
            if (k != -1) { 
                ans = Math.min(ans, k + 1); 
            } 
        } 
  
        // Returns the minimum number of digits 
        return dp[a][b] = ans; 
    } 
  
// Function to print the digits that gives  
// sum as a and sum of square of digits as b 
    static void printSmallestNumber(int a, int b) { 
  
        // initialize the dp array as -1 
        for (int[] row : dp) { 
            Arrays.fill(row, -1); 
        } 
  
        // base condition  
        dp[0][0] = 0; 
  
        // function call to get the minimum number of digits   
        int k = minimumNumberOfDigits(a, b); 
  
        // When there does not exists any number 
        if (k == -1 || k > 100) { 
            System.out.println("-1"); 
        } else { 
            // Printing the digits from the most significant digit 
            while (a > 0 && b > 0) { 
  
                // Trying all combinations  
                for (int i = 1; i <= 9; i++) { 
                    // checking conditions for minimum digits 
                    if (a >= i && b >= i * i 
                            && 1 + dp[a - i][b - i * i] == dp[a][b]) { 
                        System.out.print(i); 
                        a -= i; 
                        b -= i * i; 
                        break; 
                    } 
                } 
            } 
        } 
    } 
  
// Driver Code 
    public static void main(String args[]) { 
        int a = 18, b = 162; 
        // Function call to print the smallest number  
        printSmallestNumber(a, b); 
    } 
} 
  
// This code is contributed by PrinciRaj19992 

