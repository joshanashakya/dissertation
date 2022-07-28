

# Python program to count number of odd squares 
# in given range [n, m] 
  
def countOddSquares(n, m): 
    return int(m**0.5) - int((n-1)**0.5) 
  
# Driver code 
n = 5
m = 100
print("Count is", countOddSquares(n, m)) 
  
# Mohit Gupta_OMG <0_o> 

