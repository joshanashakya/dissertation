

# Python3 implementation of the approach  
  
# Function to count the number of  
# nodes in the tree using DFS  
def dfs(node, parent, adj, vis):  
  
    # Base case  
    ans = 1
  
    # Mark as visited  
    vis[node] = True
  
    # Traverse for all children  
    for it in adj[node]:  
  
        # If not equal to parent  
        if it != parent:  
            ans += dfs(it, node, adj, vis)  
      
    return ans  
  
# Function that returns the  
# count of unique paths  
def countPaths(adj, k, maxn):  
  
    # An array that marks if  
    # the node is visited or not  
    vis = [False] * (maxn + 1)  
    ans = 0
  
    # Traverse till max value of node  
    for i in range(1, maxn+1):  
  
        # If not visited  
        if not vis[i]: 
  
            # Get the number of  
            # nodes in that tree  
            numNodes = dfs(i, 0, adj, vis)  
  
            # Total unique paths in the current  
            # tree where numNodes is the total  
            # nodes in the tree  
            ans += numNodes * (numNodes - 1) // 2
          
    return ans  
  
# Function to add edges to  
# tree if value is less than K  
def addEdge(adj, u, v, k):  
  
    if u > k and v > k: 
        adj[u].append(v)  
        adj[v].append(u)  
  
# Driver code  
if __name__ == "__main__": 
  
    maxn = 12
  
    adj = [[] for i in range(maxn + 1)]  
    k = 3
  
    # Create undirected edges  
    addEdge(adj, 2, 11, k)  
    addEdge(adj, 2, 6, k)  
    addEdge(adj, 5, 11, k)  
    addEdge(adj, 5, 10, k)  
    addEdge(adj, 5, 12, k)  
    addEdge(adj, 6, 7, k)  
    addEdge(adj, 6, 8, k)  
  
    print(countPaths(adj, k, maxn)) 
  
# This code is contributed by Rituraj Jain 

