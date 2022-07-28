

# Python3 Program to check if three straight  
# line are concurrent or not 
  
# Return true if three line are concurrent, 
# else false. 
def checkConcurrent(a1, b1, c1, a2, b2, c2, 
                                 a3, b3, c3): 
  
    return (a3 * (b1 * c2 - b2 * c1) +
            b3 * (c1 * a2 - c2 * a1) +
            c3 * (a1 * b2 - a2 * b1) == 0) 
  
  
# Driven Program 
a1 = 2
b1 = -3
c1 = 5
a2 = 3
b2 = 4
c2 = -7
a3 = 9
b3 = -5
c3 = 8
  
if(checkConcurrent(a1, b1, c1, a2, b2, c2, 
                               a3, b3, c3)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Smitha 

