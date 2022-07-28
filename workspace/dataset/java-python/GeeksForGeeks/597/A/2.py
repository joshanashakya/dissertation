

# Python 3 Program to find whether 
# a Number is Prime or Not using 
# Recursion 
  
# Returns true if n is prime, else 
# return false. 
# i is current divisor to check.  
def isPrime(n, i = 2): 
  
    # Base cases 
    if (n <= 2): 
        return True if(n == 2) else False
    if (n % i == 0): 
        return False
    if (i * i > n): 
        return true 
  
    # Check for next divisor 
    return isPrime(n, i + 1) 
  
  
# Driver Program 
n = 15
if (isPrime(n)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed by 
# Smitha Dinesh Semwal 

