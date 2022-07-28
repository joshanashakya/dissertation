

# Python 3 program to find Circuit Rank of  
# an Undirected Graph 
  
# Function that calculates the  
# Circuit rank of the Graph.  
def Rank(Edges, Vertices) : 
  
    # calculates Circuit Rank 
    result = Edges - Vertices + 1
  
    return result 
  
# Driver code      
if __name__ == "__main__" : 
  
    Edges, Vertices = 7, 5
  
    print("Circuit Rank =",Rank(Edges, Vertices)) 
  
  
# This code is contributed by ANKITRAI1 

