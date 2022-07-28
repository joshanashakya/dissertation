

# Python3 implementation of the above approach  
from math import ceil 
  
# Function to calculate minimum glasses  
def Min_glass(n, k, a):  
   
    # sort the array based on their capacity  
    a.sort()  
  
    # calculate the answer  
    return ceil(sum(a[:k]) / 100)  
   
# Driver code  
if __name__ == "__main__":  
   
    n, k = 4, 3 
    a = [200, 150, 140, 300]   
  
    print(Min_glass(n, k, a))  
  
# This code is contributed by Rituraj Jain 

