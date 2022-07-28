

# Python3 implementation of the approach  
  
A = [11, 15, 7, 19]   
N = len(A)  
  
# Set to store all possible AND values.  
Set = set()  
  
# Starting index of the sub-array.  
for i in range(0, N):  
  
    # Ending index of the sub-array. 
    res = 2147483647    # Integer.MAX_VALUE 
    for j in range(i, N):   
        res &= A[j]  
  
        # AND value is added to the set.  
        Set.add(res)  
               
# The set contains all possible AND values.  
print(Set) 
  
# This code is contributed by Rituraj Jain 

