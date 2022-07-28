

# Python 3 implementation of the approach 
  
# Function that returns true if n divides 
# the sum of the factorials of its digits 
def isPossible(n): 
      
    # To store factorials of digits 
    fac = [0 for i in range(10)] 
    fac[0] = 1
    fac[1] = 1
  
    for i in range(2, 10, 1): 
        fac[i] = fac[i - 1] * i 
  
    # To store sum of the factorials 
    # of the digits 
    sum = 0
  
    # Store copy of the given number 
    x = n 
  
    # Store sum of the factorials 
    # of the digits 
    while (x): 
        sum += fac[x % 10] 
        x = int(x / 10) 
  
    # If it is divisible 
    if (sum % n == 0): 
        return True
  
    return False
  
# Driver code 
if __name__ == '__main__': 
    n = 19
  
    if (isPossible(n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

