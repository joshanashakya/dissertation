

# Python 3 program to find the number 
# of pairs such that the path between 
# every pair contains two given vertices 
  
N = 1000001
c = 0
n = 0
m = 0
a = 0
b = 0
  
# Function to perform DFS on the given graph 
# by fixing the a vertex 
def dfs(a,b,v,vis): 
    global c 
    # To mark a particular vertex as visited 
    vis[a] = 1
    # Variable to store the count of the 
    # vertices which can be reached from a 
    c += 1
  
    # Performing the DFS by iterating over 
    # the visited array 
    for i in v[a]: 
        # If the vertex is not visited 
        # and removing the vertex b 
        if (vis[i]==0 and i != b): 
            dfs(i, b, v, vis) 
  
# Function to return the number of pairs 
# such that path between any two pairs 
# consists the given two vertices A and B 
def Calculate(v): 
    global c 
      
    # Initializing the visited array 
    # and assigning it with 0's 
    vis = [0 for i in range(n + 1)] 
  
    # Initially, the count of vertices is 0 
    c = 0
  
    # Performing DFS by removing the vertex B 
    dfs(a, b, v, vis) 
  
    # Count the vertices which cannot be 
    # reached after removing the vertex B 
    ans1 = n - c - 1
  
    # Again reinitializing the visited array 
    vis = [0 for i in range(len(vis))]  
  
    # Setting the count of vertices to 0 to 
    # perform the DFS again 
    c = 0
  
    # Performing the DFS by removing the vertex A 
    dfs(b, a, v, vis) 
  
    # Count the vertices which cannot be 
    # reached after removing the vertex A 
    ans2 = n - c - 1
  
    # Multiplying both the vertices set 
    print(ans1 * ans2) 
  
# Driver code 
if __name__ == '__main__': 
    n = 7
    m = 7
    a = 3
    b = 5
  
    edges = [[1, 2], [2, 3], [3, 4], [4, 5], [5, 6], [6, 7], [7, 5]] 
    v = [[] for i in range(n + 1)] 
  
    # Loop to store the graph 
    for i in range(m): 
        v[edges[i][0]].append(edges[i][1]) 
        v[edges[i][1]].append(edges[i][0]) 
  
    Calculate(v) 
  
# This code is contributed by Surendra_Gangwar 

