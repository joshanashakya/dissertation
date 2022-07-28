

# Python code to find the value at  
# n-th place in the given sequence 
  
# Returns n-th number in sequence  
# 1, 1, 2, 1, 2, 3, 1, 2, 4, ... 
def findNumber( n ): 
      
    n -= 1
      
    # One by one subtract counts 
    # elements in different blocks 
    i = 1
    while n >= 0: 
        n -= i 
        i += 1
    return (n + i) 
  
# Driver code 
n = 3
print(findNumber(n)) 
  
# This code is contributed 
# by "Sharad_Bhardwaj". 

