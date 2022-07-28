

# Program to count the numbers divisible 
# by M in a given range 
  
# Returns count of numbers in [A B] that 
# are divisible by M. 
def countDivisibles(A, B, M): 
      
    # Add 1 explicitly as A is divisible by M 
    if (A % M == 0): 
        return ((B / M) - (A / M)) + 1
  
    # A is not divisible by M 
    return ((B / M) - (A / M)) 
  
# Driver Code 
# A and B define the range, M 
# is the divident 
A = 30
B = 70
M = 10
  
# Printing the result 
print(countDivisibles(A, B, M)) 
  
# This code is contributed by Sam007 

