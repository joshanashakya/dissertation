

// JAVA Code for Count all triplets whose 
// sum is equal to a perfect cube 
import java.util.*; 
  
class GFG { 
      
    public static int dp[][]; 
      
    // Function to calculate all occurrence of 
    // a number in a given range 
    public static void computeDpArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; ++i) { 
            for (int j = 1; j <= 15000; ++j) { 
       
                // if i == 0 
                // assign 1 to present state 
                  
                if (i == 0 && j == arr[i]) 
                    dp[i][j] = 1; 
                else if(i==0) 
                     dp[i][j] = 0; 
  
                // else add +1 to current state  
                // with previous state 
                else if(arr[i] == j) 
                    dp[i][j] = dp[i - 1][j] + 1; 
                else
                    dp[i][j] = dp[i - 1][j]; 
            } 
        } 
    } 
       
    // Function to calculate triplets whose sum 
    // is equal to the pefect cube 
    public static int countTripletSum(int arr[], int n) 
    { 
        computeDpArray(arr, n); 
          
        int ans = 0;  // Initialize answer 
        for (int i = 0; i < n - 2; ++i) { 
            for (int j = i + 1; j < n - 1; ++j) { 
                for (int k = 1; k <= 24; ++k) { 
                    int cube = k * k * k; 
       
                    int rem = cube - (arr[i] + arr[j]); 
       
                    // count all occurrence of  
                    // third triplet in range  
                    // from j+1 to n 
                    if (rem > 0) 
                        ans += dp[n - 1][rem] - dp[j][rem]; 
                } 
            } 
        } 
        return ans; 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int arr[] = { 2, 5, 1, 20, 6 }; 
        int n = arr.length; 
        dp = new int[1001][15001]; 
          
        System.out.println(countTripletSum(arr, n)); 
        
    } 
} 
      
// This code is contributed by Arnav Kr. Mandal.     

