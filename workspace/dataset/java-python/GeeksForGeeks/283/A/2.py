

# A python 3 programme to find maximum  
# distinct elements in a subarray of size k 
  
# Function to find maximum unique  
# element in a subarray of size k 
def maxUniqueNum(a, N, M): 
    maxUnique = 0
      
    # search every subarray of size k and  
    # find how many unique element present 
    for i in range(N - M): 
          
        # create an empty set to store 
        # the unique elements 
        s = set() 
  
        for j in range(M): 
            # insert all elements 
            # duplicate elements are not  
            # stored in set 
            s.add(a[i + j]) 
          
        # update the maxUnique  
        if(len(s) > maxUnique): 
            maxUnique = len(s) 
      
    return maxUnique 
  
# Driver Code     
if __name__ == '__main__': 
    arr = [5, 3, 5, 2, 3, 2] 
    M = 3
    N = len(arr) 
    print(maxUniqueNum(arr, N, M)) 
  
# This code is contributed by 
# Sanjit_Prasad 

