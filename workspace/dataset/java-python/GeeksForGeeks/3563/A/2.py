

# Python 3 program for count 
# number of trailing zeros 
# in N ! * M ! 
  
# Returns number of zeros in 
# factorial n 
def trailingZero(x) : 
  
    # Dividing x by powers of 5 
    # and update count 
    i = 5
    count = 0
      
    while (x > i) : 
        count = count + x // i 
        i = i * 5
      
    return count 
      
# Returns count of trailing  
# zeros in M ! x N ! 
def countProductTrailing(M, N) : 
    return trailingZero(N) + trailingZero(M) 
      
# Driver program 
N = 67
M = 98
print(countProductTrailing(N, M)) 
  
# This code is contributed by Nikita Tiwari. 

