

# Python3 implementation of the approach 
N = 5005
  
# To store vertices and value of k 
n, k = 0, 0
  
gr = [[] for i in range(N)] 
  
# To store number vertices at a level i 
d = [[0 for i in range(505)]  
        for i in range(N)] 
  
# To store the final answer 
ans = 0
  
# Function to add an edge between two nodes 
def Add_edge(x, y): 
    gr[x].append(y) 
    gr[y].append(x) 
  
# Function to find the number of distinct 
# pairs of the vertices which have a distance 
# of exactly k in a tree 
def dfs(v, par): 
    global ans 
      
    # At level zero vertex itself is counted 
    d[v][0] = 1
    for i in gr[v]: 
        if (i != par): 
            dfs(i, v) 
  
            # Count the pair of vertices at 
            # distance k 
            for j in range(1, k + 1): 
                ans += d[i][j - 1] * d[v][k - j] 
  
            # For all levels count vertices 
            for j in range(1, k + 1): 
                d[v][j] += d[i][j - 1] 
  
# Driver code 
n = 5
k = 2
  
# Add edges 
Add_edge(1, 2) 
Add_edge(2, 3) 
Add_edge(3, 4) 
Add_edge(2, 5) 
  
# Function call 
dfs(1, 0) 
  
# Required answer 
print(ans) 
  
# This code is contributed by Mohit Kumar 

