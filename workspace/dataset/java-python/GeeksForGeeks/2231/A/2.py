

# Python3 implementation of the  
# above approach  
  
# below function checks whether  
# product of digits at even places  
# is divisible by K  
def productDivisible(n, k): 
    product = 1
    position = 1
    while n > 0: 
          
        # if position is even  
        if position % 2 == 0: 
            product *= n % 10
        n = n / 10
        position += 1
    if product % k == 0: 
        return True
    return False
  
# Driver code 
n = 321922
k = 3
if productDivisible(n, k) == True: 
    print("YES") 
else: 
    print("NO") 
  
# This code is contributed  
# by Shrikant13 

