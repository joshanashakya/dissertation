

# Python implementation of  
# above approach 
  
# Function that will tell 
# whether it is possible or Not 
def Series(Arr, N, K): 
    count = 0
    for i in range(N): 
        if Arr[i] == 1: 
            count += 1
    if K >= (N - count): 
        return 1
    return 0
  
# Driver code 
Arr = [5, 1, 2] 
N = len(Arr) 
K = 2
  
result = Series(Arr, N, K) 
if result == 1: 
    print("Possible") 
else: 
    print("Not Possible") 
  
# This code is contributed 
# by Shrikant13 

