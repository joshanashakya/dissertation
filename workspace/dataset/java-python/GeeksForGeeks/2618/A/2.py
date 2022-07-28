

# Python3 program to maximum possible sum 
  
# Function to find the maximum  
# possible sum 
def Maxsum(c1, c2, c3, c4): 
  
    # To store required sum 
    sum = 0
  
    # Number of 234's can be formed 
    two34 = min(c2, min(c3, c4)) 
  
    # Sum obtained with 234s 
    sum = two34 * 234
  
    # Remaining 2's 
    c2 -= two34 
    sum += min(c2, c1) * 12
  
    # Return the requied sum 
    return sum
  
# Driver Code 
c1 = 5; c2 = 2; c3 = 3; c4 = 4
print(Maxsum(c1, c2, c3, c4)) 
  
# This code is contributed by Shrikant13 

