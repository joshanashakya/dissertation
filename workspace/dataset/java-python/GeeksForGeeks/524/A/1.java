

// Java program to find number of subarrays  
// having product less than k. 
import java.util.*; 
class CountSubsequences 
{ 
    // Function to count numbers of such  
    // subsequences having product less than k. 
    public static int productSubSeqCount(ArrayList<Integer> arr, 
                                                 int k) 
    { 
        int n = arr.size(); 
        int dp[][]=new int[k + 1][n + 1]; 
          
        for (int i = 1; i <= k; i++) { 
            for (int j = 1; j <= n; j++) { 
          
                // number of subsequence using j-1 terms 
                dp[i][j] = dp[i][j - 1]; 
          
                // if arr[j-1] > i it will surely make  
                // product greater thus it won't contribute 
                // then 
                if (arr.get(j-1) <= i && arr.get(j-1) > 0) 
      
                    // number of subsequence using 1 to j-1 
                    // terms and j-th term 
                    dp[i][j] += dp[i/arr.get(j - 1)][j - 1] + 1; 
            } 
        } 
        return dp[k][n]; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        ArrayList<Integer> A = new ArrayList<Integer>(); 
        A.add(1); 
        A.add(2); 
        A.add(3); 
        A.add(4); 
        int k = 10; 
        System.out.println(productSubSeqCount(A, k)); 
    } 
} 
  
// This Code is contributed by Danish Kaleem 

