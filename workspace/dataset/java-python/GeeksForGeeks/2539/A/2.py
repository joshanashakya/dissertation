

# Python3 program to find sum of 
# product of x and y such that  
# n/x = y (Integer Division) 
  
# Return the sum of product x*y 
def sumofproduct(n): 
    ans = 0
  
    # Iterating x from 1 to n 
    for x in range(1, n + 1): 
          
        # Finding y = n/x. 
        y = int(n / x) 
  
        # Adding product of x and y to answer. 
        ans += (y * x) 
  
    return ans 
  
# Driven Program 
n = 10
print (sumofproduct(n)) 
  
#This code is Shreyanshi Arun 

