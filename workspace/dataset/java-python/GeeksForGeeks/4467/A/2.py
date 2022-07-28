

# Python3 implementation of the approach  
  
# Function to find the count of set bits  
# in all the integers from 0 to n  
def findSetBits(n) : 
  
    # dp[i] will store the count  
    # of set bits in i  
    # Initialise the dp array 
    dp = [0] * (n + 1);  
      
    # Count of set bits in 0 is 0  
    print(dp[0], end = " ");  
  
    # For every number starting from 1  
    for i in range(1, n + 1) : 
  
        # If current number is even  
        if (i % 2 == 0) : 
  
            # Count of set bits in i is equal to  
            # the count of set bits in (i / 2)  
            dp[i] = dp[i // 2];  
  
        # If current element is odd  
        else : 
  
            # Count of set bits in i is equal to  
            # the count of set bits in (i / 2) + 1  
            dp[i] = dp[i // 2] + 1;  
  
        # Print the count of set bits in i  
        print(dp[i], end = " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 5;  
  
    findSetBits(n);  
  
# This code is contributed by AnkitRai01 

