

# Python3 implementation of the approach 
  
# Function to return the optimal strategy 
def TwentyoneMatchstick(arr, N): 
  
    # Removing matchsticks in blocks of five 
    for i in range(N): 
        print(5 - arr[i], end = " ") 
  
# Driver code 
arr = [3, 4, 2, 2 ] 
  
N = len(arr) 
  
TwentyoneMatchstick(arr, N) 
  
# This code is contributed  
# by Mohit Kumar 

