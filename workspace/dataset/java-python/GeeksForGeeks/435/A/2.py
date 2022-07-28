

# Python3 program to find the  
# number of ordered pairs  
from collections import defaultdict 
  
# Function to find count of Ordered pairs  
def countOrderedPairs(A, n):  
  
    # Initialize pairs to 0  
    orderedPairs = 0
  
    # Store frequencies  
    m = defaultdict(lambda:0) 
    for i in range(0, n):  
        m[A[i]] += 1
      
    # Count total Ordered_pairs  
    for X,Y in m.items():  
          
        for j in range(1, Y + 1):  
            if m[j] >= X:  
                orderedPairs += 1
          
    return orderedPairs  
  
# Driver Code  
if __name__ == "__main__": 
  
    A = [1, 1, 2, 2, 3]  
    n = len(A)  
    print(countOrderedPairs(A, n))  
      
# This code is contributed by Rituraj Jain 

