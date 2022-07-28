

# Python3 program to find  
# the count of nodes  
# at even distance  
  
# Dfs function to find count of  
# nodes at even distance  
def dfs(graph, node, dist, vis, c) : 
  
    if (vis[node]) : 
        return;  
      
    # Set flag as true for current  
    # node in visited array  
    vis[node] = True;  
  
    # Insert the distance in  
    # dist array for current  
    # visited node u  
    dist[node] = c;  
  
    for i in range(len(graph[node])) : 
        # If its neighbours are not vis,  
        # run dfs for them  
        if (not vis[graph[node][i]]) : 
            dfs(graph, graph[node][i],  
                    dist, vis, c + 1);  
  
def countOfNodes(graph, n) :  
  
    # bool array to  
    # mark visited nodes  
    vis = [False] * (n + 1);  
  
    # Integer array to  
    # compute distance  
    dist = [0] * (n + 1);  
  
    dfs(graph, 1, dist, vis, 0);  
  
    even = 0; odd = 0;  
  
    # Traverse the distance array  
    # and count the even and odd levels  
    for i in range(1, n + 1) : 
        if (dist[i] % 2 == 0) : 
            even += 1;  
      
        else : 
            odd += 1;  
  
    ans = ((even * (even - 1)) + 
            (odd * (odd - 1))) // 2;  
  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 5;  
    graph = [[], [ 2 ], [ 1, 3 ], [ 2 ]];  
  
    ans = countOfNodes(graph, n);  
    print(ans);  
  
# This code is contributed by kanugargng 

