

# Python3 program to find the value 
# of f(n) mod 5 for given n. 
  
# Function for f(n) mod 5 
def fnMod(n): 
  
    # if n % 5 == 1 return 4 
    if (n % 5 == 1): 
        return 4
  
    # else return 0 
    else: 
        return 0
  
# Driver Code 
n = 10
print(fnMod(n)) 
  
n = 11
print(fnMod(n)) 
  
# This code is contributed by Smitha Dinesh Semwal 

