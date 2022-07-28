

# A Simple Python3 program to  
# find count of all numbers  
# that multiples 
  
# Returns count of all numbers  
# smaller than or equal to n  
# and multples of 3 or 7 or both 
def countMultiples(n): 
    res = 0; 
    for i in range(1, n + 1): 
        if (i % 3 == 0 or i % 7 == 0): 
            res += 1; 
   
    return res; 
  
# Driver code 
print("Count =", countMultiples(25)); 
  
# This code is contributed by mits 

