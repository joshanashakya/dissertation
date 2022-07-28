

# Python 3 implementation of the approach  
import math 
  
# Function to return the count of all  
# the subsequences with positive product  
def cntSubSeq(arr, n): 
  
    # To store the count of positive  
    # elements in the array  
    pos_count = 0;  
  
    # To store the count of negative  
    # elements in the array  
    neg_count = 0
  
    for i in range (n): 
  
        # If the current element  
        # is positive  
        if (arr[i] > 0) : 
            pos_count += 1
  
        # If the current element  
        # is negative  
        if (arr[i] < 0):  
            neg_count += 1
  
    # For all the positive  
    # elements of the array  
    result = int(math.pow(2, pos_count))  
  
    # For all the negative  
    # elements of the array  
    if (neg_count > 0): 
        result *= int(math.pow(2, neg_count - 1))  
  
    # For the empty subsequence  
    result -= 1
  
    return result 
  
# Driver code  
arr = [ 2, -3, -1, 4 ]  
n = len (arr);  
  
print (cntSubSeq(arr, n))  
  
# This code is contributed by ANKITKUMAR34 

