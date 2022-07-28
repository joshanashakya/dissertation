

# Python 3 to find the maximum  
# number of Edge-Disjoint  
# Spanning tree possible  
import math 
  
# Function to calculate max  
# number of Edge-Disjoint  
# Spanning tree possible  
def edgeDisjoint(n): 
  
    result = 0
  
    result = math.floor(n / 2)  
  
    return result  
  
# Driver Code 
if __name__ == "__main__" :  
  
    n = 4
  
    print(int(edgeDisjoint(n))) 
  
# This Code is contributed 
# by Naman_Garg 

