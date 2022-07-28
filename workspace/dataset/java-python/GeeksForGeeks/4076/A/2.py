

# Python 3 program to find most  
# common factor in a range. 
def mostCommon( lower, higher): 
  
    # Check whether lower number  
    # and higher number are same 
    if (lower == higher):  
        return lower 
    else: 
        return 2
  
# Driver Code 
lower = 10 # Lower number 
higher = 20 # Higher number 
  
print("The most frequent factor",  
       mostCommon(lower, higher)) 
  
# This code is contributed by ash264 

