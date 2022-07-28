

# Python3 program to print the number of 
# leaf nodes of every node 
adjacency = [[] for i in range(100)] 
  
# Function to insert edges of tree 
def insert(x, y): 
    adjacency[x].append(y) 
  
# Function to run DFS on a tree 
def dfs(node, leaf, vis): 
  
    leaf[node] = 0
    vis[node] = 1
  
    # iterate on all the nodes 
    # connected to node 
    for it in adjacency[node]: 
  
        # If not visited 
        if (vis[it] == False): 
            dfs(it, leaf, vis) 
            leaf[node] += leaf[it] 
  
    if (len(adjacency[node]) == 0): 
        leaf[node] = 1
  
# Function to prnumber of 
# leaf nodes of a node 
def printLeaf(n, leaf): 
      
    # Function to prleaf nodes 
    for i in range(1, n + 1): 
        print("The node", i, "has",   
               leaf[i], "leaf nodes") 
  
# Driver Code 
  
# Given N-ary Tree 
''' 
/*     1 
    / \ 
    2     3 
        / | \ 
        4 5 6 '''
  
N = 6 # no of nodes 
# adjacency list for tree 
  
insert(1, 2) 
insert(1, 3) 
insert(3, 4) 
insert(3, 5) 
insert(3, 6) 
  
# Store count of leaf in subtree of i 
leaf = [0 for i in range(N + 1)]  
  
# mark nodes visited 
vis = [0 for i in range(N + 1)]  
  
dfs(1, leaf, vis) 
  
printLeaf(N, leaf) 
  
# This code is contributed by Mohit Kumar 

