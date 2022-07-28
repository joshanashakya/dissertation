

# Python program return last number 
# after removing every second 
# element from circular array 
  
# Utility function to return last 
# number after removing element 
def removeAlternate(n): 
    if (n == 1): 
        return 1
  
    if (n % 2 == 0): 
        return 2 * removeAlternate(n / 2) - 1
    else: 
        return 2 * removeAlternate(((n - 1) / 2)) + 1
  
# Driver code 
n = 5
print(removeAlternate(n)) 
n = 10
print(removeAlternate(n)) 
   
# This code is contribited by Smitha Dinesh Semwal 

