

# Python implementation of  
# the above approach 
  
# Precomputed values of segment 
# used by digit 0 to 9. 
seg = [6, 2, 5, 5, 4,  
       5, 6, 3, 7, 6] 
  
# Return the number of 
# segments used by x. 
def computeSegment(x): 
    if(x == 0): 
        return seg[0] 
  
    count = 0
  
    # Finding sum of the segment  
    # used by each digit of a number. 
    while(x): 
        count += seg[x % 10] 
        x = x // 10
  
    return count 
  
# function to return minimum sum index 
def elementMinSegment(arr, n): 
  
    # Initalising the minimum  
    # segment and minimum number index. 
    minseg = computeSegment(arr[0]) 
    minindex = 0
  
    # Finding and comparing segment 
    # used by each number arr[i]. 
    for i in range(1, n): 
        temp = computeSegment(arr[i]) 
  
        # If arr[i] used less segment 
        # then update minimum segment 
        # and minimum number. 
        if(temp < minseg): 
  
            minseg = temp 
            minindex = i 
  
    return arr[minindex] 
  
# Driver Code 
arr = [489, 206, 745, 123, 756] 
n = len(arr) 
  
# function print required answer 
print(elementMinSegment(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

