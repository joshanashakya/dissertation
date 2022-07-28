

# Python 3 implementation of the approach 
  
# Function to return the minimum number 
# of operations on a binary string such that 
# it gives 10^A as remainder when divided by 10^B 
def findCount(s, n, a, b): 
    # Initialize result 
    res = 0
  
    # Loop through last b digits 
    for i in range(b): 
        if (i == a): 
            res += (s[n - i - 1] != '1') 
        else: 
            res += (s[n - i - 1] != '0') 
  
    return res 
  
# Driver code 
if __name__ == '__main__': 
    str = "1001011001"
    N = len(str) 
    A = 3
    B = 6
  
    print(findCount(str, N, A, B)) 
  
# This code is contributed by 
# Surendra_Gangwar 

