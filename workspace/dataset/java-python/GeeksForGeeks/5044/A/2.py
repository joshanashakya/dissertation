

# Python3 implementation of the approach  
  
# Function to return the maximum number  
# of edges possible in a Bipartite  
# graph with N vertices  
def maxEdges(N) :  
  
    edges = 0;  
  
    edges = (N * N) // 4;  
  
    return edges;  
  
# Driver code  
if __name__ == "__main__" : 
      
    N = 5;  
    print(maxEdges(N));  
  
# This code is contributed by AnkitRai01 

