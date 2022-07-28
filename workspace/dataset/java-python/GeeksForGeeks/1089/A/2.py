

# Python 3 program to find the length of  
# the largest sub-array of an array every 
# element of whose is a perfect square 
from math import sqrt 
  
# function to return the length of the 
# largest sub-array of an array every 
# element of whose is a perfect square 
def contiguousPerfectSquare(arr, n): 
    current_length = 0
    max_length = 0
  
    for i in range(0, n, 1): 
        b = sqrt(arr[i]) 
        a = int(b) 
  
        # if both a and b are equal then 
        # arr[i] is a perfect square 
        if (a == b): 
            current_length += 1
        else: 
            current_length = 0
  
        max_length = max(max_length,  
                         current_length) 
      
    return max_length 
  
# Driver code 
if __name__ == '__main__': 
    arr = [9, 75, 4, 64, 121, 25] 
    n = len(arr) 
  
    print(contiguousPerfectSquare(arr, n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

