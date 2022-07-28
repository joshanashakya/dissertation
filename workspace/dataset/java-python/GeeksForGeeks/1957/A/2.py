

# Python3 implementation of the approach 
  
# Function that returns true if num 
# contains at least one digit 
# that divides k 
def digitDividesK(num, k): 
    while (num): 
  
        # Get the last digit 
        d = num % 10
  
        # If the digit is non-zero 
        # and it divides k 
        if (d != 0 and k % d == 0): 
            return True
  
        # Remove the last digit 
        num = num // 10
  
    # There is no digit in num 
    # that divides k 
    return False
  
# Function to return the required 
# count of elements from the given 
# range which contain at least one 
# digit that divides k 
def findCount(l, r, k): 
  
    # To store the result 
    count = 0
  
    # For every number from the range 
    for i in range(l, r + 1): 
  
        # If any digit of the current 
        # number divides k 
        if (digitDividesK(i, k)): 
            count += 1
  
    return count 
  
# Driver code 
l = 20
r = 35
k = 45
  
print(findCount(l, r, k)) 
  
# This code is contributed by Mohit Kumar 

