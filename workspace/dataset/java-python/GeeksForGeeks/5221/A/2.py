

# Python Program to print all cube free 
# numbers smaller than or equal to n. 
  
import math  
  
# Returns true if n is a cube free 
# number, else returns false. 
def isCubeFree( n ): 
    if n == 1: 
        return False
      
    # check for all possible divisible cubes 
    for i in range(2, int(n ** (1 / 3) + 1)): 
        if (n % (i * i * i) == 0): 
            return False; 
  
    return True; 
      
# Print all cube free numbers smaller 
# than n.     
def printCubeFree( n ): 
    for i in range(2, n+1): 
        if (isCubeFree(i)): 
            print ( i , end= " ") 
              
n = 20
printCubeFree(n) 
  
# Contributed by _omg 

