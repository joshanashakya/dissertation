

# Python3 code for Efficient method   
# to print cubes between a and b 
  
def cbrt(n) : 
    return (int)( n ** (1. / 3)) 
  
# An efficient solution to print 
# perfect cubes between a and b 
def printCubes(a, b) : 
      
    # Find cube root of  
    # both a and b 
    acrt = cbrt(a) 
    bcrt = cbrt(b) 
  
    # Print cubes between acrt and bcrt 
    for i in range(acrt, bcrt + 1) : 
        if (i * i * i >= a and i * i * i <= b) : 
            print(i * i * i, " ", end ="") 
  
# Driver code 
a = 24
b = 576
print("Perfect cubes in given range:") 
printCubes(a, b) 
  
  
# This code is contributed  
# by Nikita Tiwari. 

