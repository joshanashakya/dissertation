

# Python 3 code to find the bucket  
# to choose for picking flowers 
# out of it 
import math 
  
def findBucketNo(p): 
  
    return math.ceil( ( math.sqrt( 
               8*p + 1 ) -1 ) / 2 )  
  
# Driver code 
p = 10
  
print(findBucketNo(p)) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

