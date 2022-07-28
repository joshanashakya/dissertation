

# Python3 implementation of the approach 
  
# Function that returns true if it is 
# possible to move from (0, 0) to 
# (x, y) in exactly k moves 
def isPossible(x, y, k): 
      
    # Minimum moves required 
    minMoves = abs(x) + abs(y) 
  
    # If possible 
    if (k >= minMoves and (k - minMoves) % 2 == 0): 
        return True
  
    return False
  
# Driver code 
x = 5
y = 8
k = 20
  
if (isPossible(x, y, k)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

