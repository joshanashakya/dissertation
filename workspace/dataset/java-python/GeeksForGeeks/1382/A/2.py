

# Python Implementation 
# of above method 
  
mod=1000000007
  
# Finding number of 
# possible number with 
# n digits excluding 
# a particular digit 
def digitNumber(n): 
  
    # Checking if number 
    # of digits is zero 
    if (n == 0): 
        return 1
   
    # Checking if number 
    # of digits is one 
    if (n == 1): 
        return 9
   
    # Checking if number 
    # of digits is odd 
    if (n % 2!=0): 
   
        # Calling digitNumber function 
        # with (digit-1)/2 digits 
        temp = digitNumber((n - 1) // 2) % mod 
        return (9 * (temp * temp) % mod) % mod 
    else: 
   
        # Calling digitNumber function 
        # with n/2 digits 
        temp = digitNumber(n // 2) % mod 
        return (temp * temp) % mod 
   
def countExcluding(n,d): 
  
    # Calling digitNumber function 
    # Checking if excluding digit is 
    # zero or non-zero 
    if (d == 0): 
        return (9 * digitNumber(n - 1)) % mod 
    else: 
        return (8 * digitNumber(n - 1)) % mod 
      
# Driver code 
  
d = 9
n = 3
print(countExcluding(n, d)) 
  
# This code is contributed 
# by Anant Agarwal. 

