

# Python implementation of above approach 
  
# Function to find the distinct pairs from 
# 1-a & 1-b such that their sum is divisible by n. 
def findCountOfPairs(a, b, n): 
    ans = 0
    for i in range(1, a + 1): 
  
        # For each integer from 1 to a 
        # b/n integers exists such that pair 
        # / sum is divisible by n 
        ans += b//n 
  
        # If (i%n +b%n ) >= n one more pair is possible 
        ans += 1 if (i % n + b % n) >= n else 0
  
    return ans 
  
# Driver code 
a = 5; b = 13; n = 3
print(findCountOfPairs(a, b, n)) 
  
# This code is contributed by Shrikant13 

