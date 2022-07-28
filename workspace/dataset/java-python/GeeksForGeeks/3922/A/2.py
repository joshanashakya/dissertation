

# Python3 implementation of the approach 
  
# To store the required answer 
ans = 0
  
# To store the graph 
gr = [[] for i in range(100005)] 
  
# Function to add edges 
def Add_Edge(u, v): 
    gr[u].append(v) 
    gr[v].append(u) 
  
# Dfs function 
def dfs(child, par, color): 
    global ans 
  
    # When there is difference in colors 
    if (color[child] != color[par]): 
        ans += 1
  
    # For all it's child nodes 
    for it in gr[child]: 
        if (it == par): 
            continue
        dfs(it, child, color) 
      
# Driver code 
  
# Here zero is for parent of node 1 
color = [0, 1, 2, 3, 2, 2, 3] 
  
# Adding edges in the graph 
Add_Edge(1, 2) 
Add_Edge(1, 3) 
Add_Edge(2, 4) 
Add_Edge(2, 5) 
Add_Edge(3, 6) 
  
# Dfs call 
dfs(1, 0, color) 
  
# Required answer 
print(ans) 
  
# This code is contributed  
# by mohit kumar 

