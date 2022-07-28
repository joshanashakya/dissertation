

# Python program to compute 
# sum of digits in number. 
  
def sumDigits(no): 
    return 0 if no == 0 else int(no%10) + sumDigits(int(no/10))  
  
# Driver code 
print(sumDigits(687)) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

