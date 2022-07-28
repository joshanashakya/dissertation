

# Python3 implementation of the approach  
  
# Function that returns true if it  
# is possible to make a square  
# with side equal to l  
def isSquarePossible(arr, n, l) :  
  
    # To store the count of elements  
    # greater than or equal to l  
    cnt = 0
    for i in range(n) : 
  
        # Increment the count  
        if arr[i] >= l :  
            cnt += 1
  
        # If the count becomes greater  
        # than or equal to l  
        if cnt >= l :  
            return True
  
    return False
  
# Function to return the  
# maximum area of the square  
# that can be obtained  
def maxArea(arr, n) :  
  
    l , r = 0, n  
    len = 0
    while l <= r :  
        m = l + ((r - l) // 2)  
  
        # If square is possible with  
        # side length m  
        if isSquarePossible(arr, n, m) :  
            len = m  
            l = m + 1
  
        # Try to find a square with  
        # smaller side length  
        else : 
            r = m - 1
  
    # Return the area  
    return (len * len) 
  
# Driver code  
arr = [ 1, 3, 4, 5, 5 ]  
n = len(arr) 
  
print(maxArea(arr, n))  
  
# This code is contributed by divyamohan 

