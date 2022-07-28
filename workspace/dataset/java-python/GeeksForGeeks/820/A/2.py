

# Python3 program to find the minimum 
# number of obstacles required 
  
# Function to find the minimum 
# number of obstacles required 
def solve(n, m, obstacles,rangee): 
      
    # Find the minimum rangee required 
    # to put obstacles 
    val = min(n, m) 
  
    # Sorting the radius 
    rangee = sorted(rangee) 
    c = 1
    for i in range(obstacles - 1, -1, -1): 
        rangee[i] = 2 * rangee[i] 
        val -= rangee[i] 
          
        # If val is less than zero 
        # then we have find the number of 
        # obstacles required 
        if (val <= 0): 
            return c 
        else: 
            c += 1
  
    if (val > 0): 
        return -1
  
# Driver code 
n = 4
m = 5
obstacles = 3
rangee = [1.0, 1.25, 1.15] 
print(solve(n, m, obstacles, rangee)) 
  
# This code is contributed by mohit kumar 29 

