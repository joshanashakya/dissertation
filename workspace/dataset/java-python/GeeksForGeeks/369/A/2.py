

# Python3 implementation of the approach  
  
# Function to calculate max profit  
def maxProfit(profitA, profitB, n) : 
  
    # Prefix sum array for profitA[]  
    preSum = [0] * n;  
    preSum[0] = profitA[0];  
      
    for i in range(1, n) : 
        preSum[i] = preSum[i - 1] + profitA[i];  
  
    # Suffix sum array for profitB[]  
    suffSum = [0] * n;  
    suffSum[n - 1] = profitB[n - 1];  
      
    for i in range(n - 2, -1, -1) :  
        suffSum[i] = suffSum[i + 1] + profitB[i];  
  
    # If all the items are sold in market A  
    res = preSum[n - 1];  
  
    # Find the maximum profit when the first i  
    # items are sold in market A and the  
    # rest of the items are sold in market  
    # B for all possible values of i  
    for i in range(1 , n - 1) : 
        res = max(res, preSum[i] + suffSum[i + 1]);  
  
    # If all the items are sold in market B  
    res = max(res, suffSum[0]);  
  
    return res;  
  
# Driver code  
if __name__ == "__main__" :  
  
    profitA = [ 2, 3, 2 ];  
    profitB = [ 10, 30, 40 ];  
    n = len(profitA);  
  
    # Function to calculate max profit  
    print(maxProfit(profitA, profitB, n));  
  
# This code is contributed by AnkitRai01 

