

# Python3 implementation for above approach 
  
# function to return the count 
# of the valid triplets 
def countTriplets(A, B, C): 
    ans = 0
    for i in range(1, A + 1): 
        for j in range(1, B + 1): 
            for k in range(1, C + 1): 
                if (i * k > j * j): 
                    ans += 1
  
    return ans 
  
# Driver Code 
A = 3
B = 2
C = 2
  
# function calling 
print(countTriplets(A, B, C)) 
  
# This code is contributed by Mohit Kumar 

