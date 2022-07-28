

# Python program to find sum of given 
# series. 
  
mod = 1000000007
def findSum(n): 
    return ((n % mod) * (n % mod)) % mod 
      
      
# main() 
n = 229137999    
print (findSum(n)) 
  
# Contributed by _omg 

