

# Python3 program to implement single source 
# shortest path for a Binary Graph 
from sys import maxsize as INT_MAX 
from collections import deque 
  
# no.of vertices 
V = 9
  
# a structure to represent edges 
class node: 
    def __init__(self, to, weight): 
  
        # two variable one denote the node 
        # and other the weight 
        self.to = to 
        self.weight = weight 
  
# vector to store edges 
edges = [0] * V 
for i in range(V): 
    edges[i] = [] 
  
# Prints shortest distance from  
# given source to every other vertex 
def zeroOneBFS(src: int): 
  
    # Initialize distances from given source 
    dist = [0] * V 
    for i in range(V): 
        dist[i] = INT_MAX 
  
    # double ende queue to do BFS. 
    Q = deque() 
    dist[src] = 0
    Q.append(src) 
  
    while Q: 
        v = Q[0] 
        Q.popleft() 
  
        for i in range(len(edges[v])): 
  
            # checking for the optimal distance 
            if (dist[edges[v][i].to] >  
                dist[v] + edges[v][i].weight): 
                dist[edges[v][i].to] = dist[v] + edges[v][i].weight 
  
                # Put 0 weight edges to front and 1 weight 
                # edges to back so that vertices are processed 
                # in increasing order of weights. 
                if edges[v][i].weight == 0: 
                    Q.appendleft(edges[v][i].to) 
                else: 
                    Q.append(edges[v][i].to) 
  
    # printing the shortest distances 
    for i in range(V): 
        print(dist[i], end = " ") 
    print() 
  
def addEdge(u: int, v: int, wt: int): 
    edges[u].append(node(v, wt)) 
    edges[u].append(node(v, wt)) 
  
# Driver Code 
if __name__ == "__main__": 
  
    addEdge(0, 1, 0) 
    addEdge(0, 7, 1) 
    addEdge(1, 7, 1) 
    addEdge(1, 2, 1) 
    addEdge(2, 3, 0) 
    addEdge(2, 5, 0) 
    addEdge(2, 8, 1) 
    addEdge(3, 4, 1) 
    addEdge(3, 5, 1) 
    addEdge(4, 5, 1) 
    addEdge(5, 6, 1) 
    addEdge(6, 7, 1) 
    addEdge(7, 8, 1) 
  
    # source node 
    src = 0
    zeroOneBFS(src) 
  
# This code is contributed by 
# sanjeev2552 

