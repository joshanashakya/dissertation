

# Python3 implementation of the approach  
  
# Function to return the minimum number  
# of edges that need to be added to  
# the given graph such that it  
# contains at least one triangle  
def minEdges(v, n) :  
  
    # adj is the adjacency matrix such that  
    # adj[i][j] = 1 when there is an  
    # edge between i and j  
    adj = dict.fromkeys(range(n + 1));  
      
    # adj.resize(n + 1);  
    for i in range(n + 1) : 
        adj[i] = [0] * (n + 1);  
  
    # As the graph is undirected  
    # so there will be an edge  
    # between (i, j) and (j, i)  
    for i in range(len(v)) : 
        adj[v[i][0]][v[i][1]] = 1;  
        adj[v[i][1]][v[i][0]] = 1;  
  
    # To store the required  
    # count of edges  
    edgesNeeded = 3;  
  
    # For every possible vertex triplet  
    for i in range(1, n + 1) :  
        for j in range(i + 1, n + 1) : 
            for k in range(j + 1, n + 1) : 
  
                # If the vertices form a triangle  
                if (adj[i][j] and adj[j][k] and adj[k][i]) : 
                    return 0;  
  
                # If no edges are present  
                if (not (adj[i][j] or adj[j][k] or adj[k][i])) : 
                    edgesNeeded = min(edgesNeeded, 3);  
  
                else : 
  
                    # If only 1 edge is required  
                    if ((adj[i][j] and adj[j][k]) 
                        or (adj[j][k] and adj[k][i])  
                        or (adj[k][i] and adj[i][j])) :  
                        edgesNeeded = 1;  
  
                    # Two edges are required  
                    else : 
                        edgesNeeded = min(edgesNeeded, 2);  
      
    return edgesNeeded;  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Number of nodes  
    n = 3;  
  
    # Storing the edges in a vector of pairs  
    v = [ [ 1, 2 ], [ 1, 3 ] ];  
  
    print(minEdges(v, n));  
      
# This code is contributed by kanugargng 

