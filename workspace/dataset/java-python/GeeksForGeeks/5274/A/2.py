

# Python3 implementation of the approach 
from bisect import bisect as upper_bound 
  
def getCount(v, n): 
      
    # Sorting the vector 
    v = sorted(v) 
    cnt = 0
    for i in range(n): 
  
        # Count of numbers which 
        # are greater than v[i] 
        tmp = n - 1 - upper_bound(v, v[i] - 1) 
  
        if (tmp == v[i]): 
            cnt += 1
    return cnt 
  
# Driver codemain() 
n = 4
v = [] 
v.append(1) 
v.append(2) 
v.append(3) 
v.append(4) 
  
print(getCount(v, n)) 
  
# This code is contributed by Mohit Kumar 

