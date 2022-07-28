

# Python3 implementation for above approach 
  
# Function to find the number of ways  
# to divide N into four parts  
# such that a = c and b = d 
def possibleways(n): 
  
    if (n % 2 == 1): 
        return 0; 
    elif (n % 4 == 0): 
        return n // 4 - 1; 
    else: 
        return n // 4; 
  
# Driver code 
n = 20; 
print(possibleways(n)); 
  
# This code is contributed by mits 

