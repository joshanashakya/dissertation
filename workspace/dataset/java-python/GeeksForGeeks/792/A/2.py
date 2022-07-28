

# Python3 implementation of the approach  
  
# Function to return the required sum  
def getSum(n, d) : 
      
    if (n < d) : 
        return 0
  
    # Decrement N  
    while (n % 10 != d) : 
        n -= 1
  
    k = n // 10
  
    return ((k + 1) * d + 
            (k * 10 + 10 * k * k) // 2) 
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 30
    d = 3
    print(getSum(n, d))  
  
# This code is contributed by Ryuga 

