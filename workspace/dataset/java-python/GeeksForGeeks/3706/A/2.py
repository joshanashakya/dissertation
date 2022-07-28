

# Python3 implementation of the approach 
  
# Function to return the count 
# of all valid pairs 
def countPairs(arr, n): 
  
    # To store the frequencies 
    # of (arr[i] - i) 
    map = dict() 
    for i in range(n): 
        map[arr[i] - i] = map.get(arr[i] - i, 0) + 1
  
    # To store the required count 
    res = 0
    for x in map: 
        cnt = map[x] 
  
        # If cnt is the number of elements 
        # whose differecne with their index 
        # is same then ((cnt * (cnt - 1)) / 2) 
        # such pairs are possible 
        res += ((cnt * (cnt - 1)) // 2) 
  
    return res 
  
# Driver code 
arr = [1, 5, 6, 7, 9] 
n = len(arr) 
  
print(countPairs(arr, n)) 
  
# This code is contributed by Mohit Kumar 

