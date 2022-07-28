

# Python 3 implementation to   
# find the number of edges  
# in a complete graph  
  
# Function to find the total  
# number of edges in a complete 
# graph with N vertices 
def totEdge(n) : 
  
    result = (n * (n - 1)) // 2
  
    return result 
              
# Driver Code 
if __name__ == "__main__" : 
  
    n = 6
  
    print(totEdge(n)) 
  
# This code is contributed 
# by ANKITRAI1 

