

# Python 3 implementation to find N 
# modulo 4 using Bitwise AND operator 
  
# Function to find the remainder 
def findRemainder(n): 
    # Bitwise AND with 3 
    x = n & 3
  
    # Return  x 
    return x 
  
# Driver code 
if __name__ == '__main__': 
    N = 43
  
    ans = findRemainder(N) 
  
    print(ans) 
      
# This code is contributed by Surendra_Gangwar 

