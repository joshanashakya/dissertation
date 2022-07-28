

# Python3 implementation of the approach 
  
# Function to find n positive integers 
# that satisfy the given conditions 
def findIntegers(n, x, y): 
  
    # To store n positive integers 
    ans = [] 
  
    # Place N - 1 one's 
    for i in range(n - 1): 
        ans.append(1) 
  
    # If can not place (y - (n - 1)) 
    # as the Nth integer 
    if (y - (n - 1) <= 0): 
        print("-1", end = "") 
        return
  
    # Place Nth integer 
    ans.append(y - (n - 1)) 
  
    # To store the sum of 
    # squares of N integers 
    store = 0
  
    for i in range(n): 
        store += ans[i] * ans[i] 
  
    # If it is less than x 
    if (store < x): 
        print("-1", end = "") 
        return; 
  
    # Print the required integers 
    for i in range(n): 
        print(ans[i], end = " ") 
  
# Driver code 
n, x, y = 3, 254, 18
findIntegers(n, x, y) 
  
# This code is contributed by mohit kumar 

