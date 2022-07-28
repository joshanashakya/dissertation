

# Python3 implementation of the approach 
  
# Function to find the required prefix Sum 
def prefixSum(p_arr, arr, n): 
  
    p_arr[0] = arr[0] 
    for i in range(1, n): 
        p_arr[i] = arr[i] + p_arr[i - 1] 
  
# Function to hash all the values of  
# prefix Sum array in an unordered map 
def hashPrefixSum(p_arr, n, q): 
  
    for i in range(n): 
        q[p_arr[i]] = 1
  
# Function to check if a range 
# can be divided into two equal parts 
def canDivide(p_arr, n, q, l, r): 
      
    # To store the value of Sum 
    # of entire range 
    Sum = 0
  
    if (l == 0): 
        Sum = p_arr[r] 
    else: 
        Sum = p_arr[r] - p_arr[l - 1] 
  
    # If value of Sum is odd 
    if (Sum % 2 == 1): 
        print("No") 
        return
      
    # To store p_arr[l-1] 
    beg = 0
  
    if (l != 0): 
        beg = p_arr[l - 1] 
  
    # If the value exists in the map 
    if (beg + Sum // 2 in q.keys()): 
        print("Yes") 
    else: 
        print("No") 
  
# Driver code 
arr = [1, 1, 2, 3] 
n = len(arr) 
  
# prefix-Sum array 
p_arr = [0 for i in range(n)] 
  
prefixSum(p_arr, arr, n) 
  
# Map to store the values  
# of prefix-Sum 
q = dict() 
  
hashPrefixSum(p_arr, n, q) 
  
# Perform queries 
canDivide(p_arr, n, q, 0, 1) 
canDivide(p_arr, n, q, 1, 3) 
canDivide(p_arr, n, q, 1, 2) 
  
# This code is contributed 
# by mohit kumar 

