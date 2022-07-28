

# Python3 implementation of the approach 
import math 
  
class GfG : 
  
    # Private constructor for initializing 
    # the table and the height of the tree 
    def __init__(self, n): 
      
        # log(n) with base 2 
        # To store the height of the tree 
        self.height = int(math.ceil(math.log10(n) / math.log10(2))) 
          
        # Table for storing 2^ith parent 
        self.table = [0] * (n + 1) 
      
    # Filling with -1 as initial 
    def preprocessing(self): 
        i = 0
        while ( i < len(self.table)) : 
            self.table[i] = [-1]*(self.height + 1) 
            i = i + 1
          
    # Calculating sparse table[][] dynamically 
    def calculateSparse(self, u, v): 
      
        # Using the recurrence relation to 
        # calculate the values of table[][] 
        self.table[v][0] = u 
        i = 1
        while ( i <= self.height) : 
            self.table[v][i] = self.table[self.table[v][i - 1]][i - 1] 
  
            # If we go out of bounds of the tree 
            if (self.table[v][i] == -1): 
                break
            i = i + 1
          
    # Function to return the Kth ancestor of V 
    def kthancestor(self, V, k): 
        i = 0
  
        # Doing bitwise operation to 
        # check the set bit 
        while ( i <= self.height) : 
            if ((k & (1 << i)) != 0) : 
                V = self.table[V][i] 
                if (V == -1): 
                    break
            i = i + 1
          
        return V 
      
# Driver code 
  
# Number of vertices 
n = 6
  
# Calling the constructor 
obj = GfG(n) 
  
# Pre-processing 
obj.preprocessing() 
  
# Calculating ancestors of v 
obj.calculateSparse(1, 2) 
obj.calculateSparse(1, 3) 
obj.calculateSparse(2, 4) 
obj.calculateSparse(2, 5) 
obj.calculateSparse(3, 6) 
  
K = 2
V = 5
print(obj.kthancestor(V, K)) 
      
# This code is contributed by Arnab Kundu 

