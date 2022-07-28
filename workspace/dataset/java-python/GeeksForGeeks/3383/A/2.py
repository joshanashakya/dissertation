

# Python3 implementation of the approach 
  
N = 100005
   
# To store the graph 
gr = [[] for i in range(N)] 
   
# To store colour of each vertex 
colour = [-1] * N 
   
# To store edges 
edges = [] 
   
# To check graph is bipartite or not 
bip = True
   
# Function to add edges 
def add_edge(x, y): 
  
    gr[x].append(y) 
    gr[y].append(x) 
    edges.append((x, y)) 
  
# Function to check given graph 
# is bipartite or not 
def dfs(x, col): 
  
    # colour the vertex x 
    colour[x] = col 
    global bip 
   
    # For all it's child vertices 
    for i in gr[x]:  
        # If still not visited 
        if colour[i] == -1: 
            dfs(i, col ^ 1) 
   
        # If visited and having 
        # same colour as parent 
        elif colour[i] == col: 
            bip = False
      
# Function to convert the undirected 
# graph into the directed graph such that 
# there is no path of length greater than 1 
def Directed_Graph(n, m): 
  
    # Call bipartite function 
    dfs(1, 1) 
   
    # If bipartite is not possible 
    if not bip: 
        print(-1) 
        return
      
    # If bipartite is possible 
    for i in range(0, m):  
   
        # Make an edge from vertex 
        # having colour 1 to colour 0 
        if colour[edges[i][0]] == 0: 
            edges[i][0], edges[i][1] = edges[i][1], edges[i][0] 
   
        print(edges[i][0], edges[i][1]) 
   
# Driver code 
if __name__ == "__main__": 
  
    n, m = 4, 3
   
    # Add edges 
    add_edge(1, 2) 
    add_edge(1, 3) 
    add_edge(1, 4) 
   
    # Function call 
    Directed_Graph(n, m) 
   
# This code is contributed by Rituraj Jain 

