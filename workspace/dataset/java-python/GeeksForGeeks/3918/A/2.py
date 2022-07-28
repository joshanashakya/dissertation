

# Python3 implementation of the approach  
  
# Function to calculate the degree 
# of all the vertices  
def init(degree, edges, n) :  
  
    # Initializing degree of 
    # all the vertices as 0  
    for i in range(n) : 
        degree[i] = 0;  
  
    # For each edge from A to B,  
    # degree[A] and degree[B]  
    # are increased by 1  
    for i in range(len(edges)) : 
        degree[edges[i][0]] += 1;  
        degree[edges[i][1]] += 1;  
  
# Function to perform the queries  
def performQueries(edges, q, n) :  
  
    # To store the of degree  
    # of all the vertices  
    degree = [0] * n;  
  
    # Calculate the degree for all the vertices  
    init(degree, edges, n);  
  
    # For every query  
    for i in range(len(q)) : 
  
        node = q[i];  
        if (node == 0) : 
            print("No");  
            continue;  
  
        # If the current node has 1 degree  
        if (degree[node] == 1) : 
            print("Yes");  
        else : 
            print("No");  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Number of vertices  
    n = 6;  
  
    # Edges of the tree  
    edges = [[ 0, 1 ], [ 0, 2 ],  
             [ 1, 3 ], [ 1, 4 ],  
             [ 4, 5 ]];  
  
    # Queries  
    q = [ 0, 3, 4, 5 ];  
  
    # Perform the queries  
    performQueries(edges, q, n);  
  
# This code is contributed by AnkitRai01 

