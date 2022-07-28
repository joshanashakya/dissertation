

# Python3 program to find the count of  
# numbers that can be formed using digits 
# 3, 4 only and having length at max N.  
  
# Function to find the count of numbers 
# that can be formed using digits 3, 4  
# only and having length at max N.  
def numbers(n): 
    return pow(2, n + 1) - 2
  
# Driver code  
n = 2
print(numbers(n)) 
  
# This code is contributed 
# by Shrikant13 

