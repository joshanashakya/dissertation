

# Iterative Pell Number  
# Series in Python 3 
  
# calculate nth pell number 
def pell(n) : 
    if (n <= 2) : 
        return n 
   
    a = 1
    b = 2
    for i in range(3, n+1) : 
        c = 2 * b + a 
        a = b 
        b = c 
      
    return b 
      
# driver function 
n = 4
print(pell(n)) 
  
# This code is contributed by Nikita Tiwari. 

