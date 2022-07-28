

# Python3 implementation of the above 
# approach: 
  
# Function to check if it is possible  
# to split the array in two halfs with 
# equal Sum 
def isSpiltPossible(n, a): 
  
    Sum = 0
    c1 = 0
  
    # Calculate Sum of elements 
    # and count of 1's 
    for i in range(n): 
        Sum += a[i] 
  
        if (a[i] == 1): 
            c1 += 1
  
    # If total Sum is odd, return False 
    if (Sum % 2): 
        return False
  
    # If Sum of each half is even, 
    # return True 
    if ((Sum // 2) % 2 == 0): 
        return True
  
    # If Sum of each half is even  
    # but there is atleast one 1 
    if (c1 > 0): 
        return True
    else: 
        return False
  
# Driver Code 
n = 3
a = [ 1, 1, 2 ] 
  
if (isSpiltPossible(n, a)): 
    print("YES") 
else: 
    print("NO") 
  
# This code is contributed 
# by Mohit Kumar 

