

# Python3 Implementation of above approach 
import collections 
  
# function to find minimum increment required 
def minIncrementForUnique(A): 
  
    # collect frequency of each element 
    count = collections.Counter(A) 
  
    # array of unique values taken 
    taken = [] 
  
    ans = 0
  
    for x in range(100000): 
        if count[x] >= 2: 
            taken.extend([x] * (count[x] - 1)) 
        elif taken and count[x] == 0: 
            ans += x - taken.pop() 
  
    # return answer 
    return ans 
  
# Driver code 
A = [3, 2, 1, 2, 1, 7] 
print(minIncrementForUnique(A)) 

