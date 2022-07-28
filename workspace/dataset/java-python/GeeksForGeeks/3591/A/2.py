

# Python3 implementation of the approach 
  
# Function to return the number of ways 
# to remove edges from the graph so that 
# odd number of edges are left in the graph 
def countWays(N): 
      
    # Total number of edges 
    E = (N * (N - 1)) / 2
  
    if (N == 1): 
        return 0
  
    return int(pow(2, E - 1)) 
  
# Driver code 
if __name__ == '__main__': 
    N = 4
    print(countWays(N)) 
  
# This code contributed by PrinciRaj1992  

