

# Python3 implementation of the approach  
  
# Function to return the number of nodes  
# in the current connected component  
def dfs(x, adj, vis): 
  
    # Initialise size to 1  
    sz = 1
  
    # Mark the node as visited  
    vis[x] = 1
  
    # Start a dfs for every unvisited  
    # adjacent node  
    for ch in adj:  
        if (not vis[ch]): 
            sz += dfs(ch, adj, vis)  
  
    # Return the number of nodes in  
    # the current connected component  
    return sz  
  
# Function to return the maximum value  
# of the required permutation  
def maxValue(n, adj): 
  
    val = 0
    vis = [0] * (n + 1) 
  
    # For each connected component  
    # add the corresponding value  
    for i in range(1, n + 1): 
        if (not vis[i]): 
            val += dfs(i, adj, vis) - 1
    return val  
  
# Driver Code 
if __name__ == '__main__': 
    n = 3
    adj = [1, 2 , 2, 3] 
    print(maxValue(n, adj)) 
  
# This code is contributed by 
# SHUBHAMSINGH10 

