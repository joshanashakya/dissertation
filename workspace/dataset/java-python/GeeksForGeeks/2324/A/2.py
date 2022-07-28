

# Python 3 program to find the  
# first k digits of n^n 
  
# function that manually calculates  
# n^n and then removes digits until 
# k digits remain 
def firstkdigits(n, k): 
  
    product = 1
      
    for i in range(n ): 
        product *= n 
      
    # loop will terminate when there  
    # are only k digits left 
    while ((product // pow(10, k)) != 0): 
        product = product // 10
      
    return product 
  
# Driver Code 
n = 15
k = 4
print(firstkdigits(n, k)) 
  
# This code is contributed  
# by ChitraNayal 

