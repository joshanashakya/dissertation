

# Python3 implementation of the above approach 
mod = 1000000007
  
# Function to compute a^n % mod 
def power(a, n): 
    if(n == 0): 
        return 1
  
    p = power(a, int(n / 2)) % mod; 
    p = (p * p) % mod 
    if (n & 1): 
        p = (p * a) % mod 
  
    return p 
  
# Function to count permutations that are 
# first decreasing and then increasing 
def countPermutations(n): 
      
    # For n = 1 return 0 
    if (n == 1): 
        return 0
  
    # Calculate and return result 
    return (power(2, n - 1) - 2) % mod 
  
# Driver code 
if __name__ == '__main__': 
    n = 5
    print(countPermutations(n)) 
      
# This code is contributed by 
# Surendra_Gangwar 

