

# Python 3 implementation of the approach 
from math import gcd 
N = 9
  
# Function to add edges in the tree 
def addEgde(adj, u, v): 
    adj[u].append(v) 
    adj[v].append(u) 
  
# Function to find the GCD  
# from root to leaf path 
def DFS(node, parent, G, leaf, val, adj): 
      
    # If we reach the desired leaf 
    if (node == leaf): 
        G = gcd(G, val[node]) 
        print(G, end = "") 
        return
  
    # Call DFS for children 
    for it in adj[node]: 
        if (it != parent): 
            DFS(it, node, gcd(G, val[it]), 
                          leaf, val, adj) 
  
# Driver code 
if __name__ == '__main__': 
    n = 8
    adj = [[0 for i in range(n + 1)]  
              for j in range(n + 1)] 
   
    addEgde(adj, 1, 2) 
    addEgde(adj, 2, 4) 
    addEgde(adj, 1, 3) 
    addEgde(adj, 3, 5) 
    addEgde(adj, 3, 6) 
    addEgde(adj, 6, 7) 
    addEgde(adj, 6, 8) 
  
    leaf = 5
  
    # -1 to indicate no value in node 0 
    val = [-1, 6, 2, 6, 3, 4, 12, 10, 18] 
  
    # Initially GCD is the value of the root 
    G = val[1] 
  
    DFS(1, -1, G, leaf, val, adj) 
  
# This code is contributed by 
# Surendra_Gangwar 

