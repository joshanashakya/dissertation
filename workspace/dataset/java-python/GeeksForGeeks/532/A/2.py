

# Python3 implementation of the approach 
  
# Function to return the count 
# of the required sub-sequences 
def countSubSeq(i, Sum, cnt, a, n): 
  
    # Base case 
    if (i == n): 
  
        # Check if the Sum is 0 
        # and at least a single element 
        # is in the sub-sequence 
        if (Sum == 0 and cnt > 0): 
            return 1
        else: 
            return 0
    ans = 0
  
    # Do not take the number in 
    # the current sub-sequence 
    ans += countSubSeq(i + 1, Sum, cnt, a, n) 
  
    # Take the number in the 
    # current sub-sequence 
    ans += countSubSeq(i + 1, Sum + a[i],  
                           cnt + 1, a, n) 
  
    return ans 
  
# Driver code 
a = [-1, 2, -2, 1] 
n = len(a) 
print(countSubSeq(0, 0, 0, a, n)) 
  
# This code is contributed by mohit kumar 

