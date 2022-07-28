

# Python3 program to find minimum  
# number of edges between any two  
# vertices of the graph  
  
# Class to represent a graph  
class Graph:   
  
    def __init__(self, V): 
        self.V = V 
        self.adj = [[] for i in range(V)] 
          
    def addEdge(self, src, des):  
   
        self.adj[src].append(des)  
        self.adj[des].append(src)  
   
    # Utility function for finding  
    # minimum number of edges using DFS  
    def minEdgeDFSUtil(self, visited, src, des, min_num_of_edges, edge_count):  
       
        # For keeping track of visited nodes in DFS  
        visited[src] = True 
      
        # If we have found the destination vertex  
        # then check whether count of total number of edges  
        # is less than the minimum number of edges or not  
        if src == des:  
            if min_num_of_edges > edge_count:  
                min_num_of_edges = edge_count  
           
        # If current vertex is not destination  
        else:   
      
            # Recur for all the vertices  
            # adjacent to current vertex  
            for v in self.adj[src]:   
                  
                if not visited[v]:   
                    edge_count += 1
      
                    min_num_of_edges, edge_count = \ 
                    self.minEdgeDFSUtil(visited, v, des, min_num_of_edges, edge_count)  
                   
        # Decrement the count of number of edges  
        # and mark current vertex as unvisited  
        visited[src] = False 
        edge_count -= 1
        return min_num_of_edges, edge_count 
       
    # Function to print minimum number of  
    # edges. It uses recursive minEdgeDFSUtil  
    def minEdgeDFS(self, u, v):  
       
        # To keep track of all the  
        # visited vertices  
        visited = [False] * self.V  
      
        # To store minimum number of edges  
        min_num_of_edges = float('inf')  
      
        # To store total number of  
        # edges in each path  
        edge_count = 0 
      
        min_num_of_edges, edge_count = \ 
        self.minEdgeDFSUtil(visited, u, v, min_num_of_edges, edge_count)  
      
        # Print the minimum number of edges  
        print(min_num_of_edges)  
   
# Driver Code  
if __name__ == "__main__":  
   
    # Create a graph  
    g = Graph(5)  
    g.addEdge(0, 1)  
    g.addEdge(0, 4)  
    g.addEdge(1, 2)  
    g.addEdge(2, 4)  
    g.addEdge(2, 3)  
    g.addEdge(3, 4)  
  
    u, v = 0, 3 
    g.minEdgeDFS(u, v)  
  
# This code is contributed by Rituraj Jain 

