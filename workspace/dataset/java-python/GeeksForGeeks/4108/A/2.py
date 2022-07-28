

# Python 3 program to count pairs  
# whose sum cubes is N 
import math  
  
# Function to count the pairs  
# satisfying a ^ 3 + b ^ 3 = N 
def countPairs(N): 
  
    count = 0
  
    # Check for each number 1 
    # to cbrt(N) 
    for i in range(1, int(math.pow(N, 1/3) + 1)): 
      
        # Store cube of a number 
        cb = i * i * i 
  
        # Subtract the cube from given N 
        diff = N - cb 
  
        # Check if the difference is also 
        # a perfect cube 
        cbrtDiff = int(math.pow(diff, 1/3)) 
  
        # If yes, then increment count 
        if (cbrtDiff * cbrtDiff * cbrtDiff == diff): 
            count += 1
      
    # Return count 
    return count 
  
  
# Driver program 
  
# Loop to Count no. of pairs satisfying 
# a ^ 3 + b ^ 3 = i for N = 1 to 10 
for i in range(1, 11): 
    print('For n = ', i, ', ', countPairs(i), 
                                ' pair exists') 
  
  
# This code is contributed by Smitha. 

