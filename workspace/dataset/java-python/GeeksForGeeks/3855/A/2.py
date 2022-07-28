

# Python3 implementation of above approach 
  
# Function to return the count of  
# pairs having sum equal to K 
def countPairs(A1, A2, n1, n2, K): 
      
    # Initialize pairs to 0 
    res = 0
      
    # Create dictionary of elements 
    # of array A1 
    m = dict() 
    for i in range(0, n1): 
        if A1[i] not in m.keys(): 
            m[A1[i]] = 1
        else: 
            m[A1[i]] = m[A1[i]] + 1
          
    # count total pairs 
    for i in range(0, n2): 
        temp = K - A2[i] 
        if temp in m.keys(): 
            res = res + 1
              
            # Every element can be part 
            # of at most one pair 
            m[temp] = m[temp] - 1
      
    # return total pairs 
    return res 
  
# Driver Code 
A1 = [1, 1, 3, 4, 5, 6 ,6] 
A2 = [1, 4, 4, 5, 7] 
K = 10
  
n1 = len(A1) 
n2 = len(A2) 
  
# function call to print required answer 
print(countPairs(A1, A2, n1, n2, K)) 
          
# This code is contributed  
# by Shashank_Sharma 

