

# Python3 program count total number of 
# paths to reach B from B 
  
# Function to count the number of 
# steps in a tetrahedron 
def countPaths(n): 
      
    # initially coming to B is B->B 
    zB = 1
  
    # cannot reach A, D or C 
    zADC = 0
  
    # iterate for all steps 
    for i in range(1, n + 1):  
  
        # recurrence relation 
        nzB = zADC * 3
  
        nzADC = (zADC * 2 + zB) 
  
        # memoize previous values 
        zB = nzB 
        zADC = nzADC 
      
    # returns steps 
    return zB 
  
# Driver code 
n = 3
print(countPaths(n)) 
  
# This code is contributed by ashutosh450 

