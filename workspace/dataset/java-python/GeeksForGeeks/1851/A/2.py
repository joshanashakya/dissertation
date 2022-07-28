

# Python3 implementation of the approach 
ans = 0
  
graph = [[] for i in range(100)] 
weight = [0]*100
  
# Function that returns True if count 
# of set bits in x is even 
def isEvenParity(x): 
  
    # parity will store the 
    # count of set bits 
    parity = 0
    while (x != 0): 
        x = x & (x - 1) 
        parity += 1
          
    if (parity % 2 == 0): 
        return True
    else: 
        return False
  
# Function to perform dfs 
def dfs(node, parent): 
    global ans 
      
    # If weight of the current 
    # node has even parity 
    if (isEvenParity(weight[node])): 
        ans += 1
      
    for to in graph[node]: 
        if (to == parent): 
            continue
        dfs(to, node) 
  
# Driver code 
  
# Weights of the node 
weight[1] = 5
weight[2] = 10
weight[3] = 11
weight[4] = 8
weight[5] = 6
  
# Edges of the tree 
graph[1].append(2) 
graph[2].append(3) 
graph[2].append(4) 
graph[1].append(5) 
  
dfs(1, 1) 
print(ans) 
  
# This code is contributed by SHUBHAMSINGH10 

