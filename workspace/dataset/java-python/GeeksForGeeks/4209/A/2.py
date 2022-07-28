

# Python 3 implementation of above approach 
  
# Function to find the distinct pairs from 
# 1-a & 1-b such that their sum is divisible by n. 
def findCountOfPairs(a, b, n): 
    ans = 0
  
    # pairs from 1 to n*(a/n) and 1 to n*(b/n) 
    ans += n * int(a / n) * int(b / n) 
  
    # pairs from 1 to n*(a/n) and n*(b/n) to b 
    ans += int(a / n) * (b % n) 
  
    # pairs from n*(a/n) to a and 1 to n*(b/n) 
    ans += (a % n) * int(b / n) 
  
    # pairs from n*(a/n) to a and n*(b/n) to b 
    ans += int(((a % n) + (b % n)) / n); 
  
    # Return answer 
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    a = 5
    b = 13
    n = 3
    print(findCountOfPairs(a, b, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

