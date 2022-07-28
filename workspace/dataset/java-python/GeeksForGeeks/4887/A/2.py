

# Python3 implementation of the approach 
  
# Function to return the gcd of two numbers 
def gcd(a, b): 
  
    if (a == 0): 
        return b 
    return gcd(b % a, a) 
  
# Function to return the minimum 
# possible health for the monster 
def solve(health, n): 
      
    # gcd of first and second element 
    currentgcd = gcd(health[0], health[1]) 
  
    # gcd for all subsequent elements 
    for i in range(2, n): 
        currentgcd = gcd(currentgcd,  
                         health[i]) 
    return currentgcd 
  
# Driver code 
health = [4, 6, 8, 12] 
n = len(health) 
print(solve(health, n)) 
  
# This code is contributed by mohit kumar 

