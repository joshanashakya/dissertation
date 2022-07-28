

# Python3 implementation of the approach  
  
# Function to return the minimum cost  
def getMinCost(n, m):  
  
    cost = (n - 1) * m + (m - 1) * n  
    return cost  
  
# Driver code  
if __name__ == "__main__":  
  
    n, m = 4, 5
    print(getMinCost(n, m))  
  
# This code is contributed by 
# Rituraj Jain 

