

# Python3 implementation to find the  
# Minimum time required to cover a Binary Array  
  
# function to calculate the time  
def solve(arr, n) : 
  
    k = len(arr)  
  
    # Map to mark or store the binary values 
    # Firstly fill the boolean  
    # array with all zeroes  
    mp = [False for i in range(n + 2)]  
  
    # Mark the 1s  
    for i in range(k) : 
        mp[arr[i]] = True
  
    # Number of 0s until first '1' occurs  
    leftSegment = arr[0] - 1
  
    # Maximum Number of 0s in between 2 '1's.  
    for i in range(1,k) : 
        leftSegment = max(leftSegment, arr[i] - arr[i - 1] - 1) 
  
    # Number of 0s from right until first '1' occurs  
    rightSegment = n - arr[k - 1] 
  
    # Return maximum from left and right segment  
    maxSegment = max(leftSegment, rightSegment);  
  
    tim = 0
  
    # check if count is odd  
    if (maxSegment & 1) : 
        tim = (maxSegment // 2) + 1
  
    # check ifcount is even  
    else : 
        tim = maxSegment // 2
  
    # return the time  
    return tim 
  
# Driver code  
# initialise N  
N = 5
  
# array initialisation  
arr = [ 1, 4 ]  
  
print(solve(arr, N)) 
  
# This code is contributed by Sanjit_Prasad 

