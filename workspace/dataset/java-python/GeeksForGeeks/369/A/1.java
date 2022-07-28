

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to calculate max profit  
    static int maxProfit(int profitA[], int profitB[], int n)  
    {  
      
        // Prefix sum array for profitA[]  
        int preSum[] = new int[n];  
        preSum[0] = profitA[0];  
        for (int i = 1; i < n; i++)  
        {  
            preSum[i] = preSum[i - 1] + profitA[i];  
        }  
      
        // Suffix sum array for profitB[]  
        int suffSum[] = new int[n];  
        suffSum[n - 1] = profitB[n - 1];  
        for (int i = n - 2; i >= 0; i--) 
        {  
            suffSum[i] = suffSum[i + 1] + profitB[i];  
        }  
      
        // If all the items are sold in market A  
        int res = preSum[n - 1];  
      
        // Find the maximum profit when the first i  
        // items are sold in market A and the  
        // rest of the items are sold in market  
        // B for all possible values of i  
        for (int i = 1; i < n - 1; i++)  
        {  
            res = Math.max(res, preSum[i] + suffSum[i + 1]);  
        }  
      
        // If all the items are sold in market B  
        res = Math.max(res, suffSum[0]);  
      
        return res;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int profitA[] = { 2, 3, 2 };  
        int profitB[] = { 10, 30, 40 };  
        int n = profitA.length;  
      
        // Function to calculate max profit  
        System.out.println(maxProfit(profitA, profitB, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

