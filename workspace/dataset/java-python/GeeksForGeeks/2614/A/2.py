

# Python implementation of the approach 
from sys import maxsize 
  
maximum, x, ans = -maxsize, None, maxsize 
  
graph = [[] for i in range(100)] 
weight = [0] * 100
  
# Function to perform dfs to find 
# the maximum set bits value 
def dfs(node, parent): 
    global x, ans, graph, weight, maximum 
  
    # If current set bits value is greater than 
    # the current maximum 
    a = bin(weight[node] + x).count('1') 
  
    if maximum < a: 
        maximum = a 
        ans = node 
  
    # If count is equal to the maximum 
    # then choose the node with minimum value 
    elif maximum == a: 
        ans = min(ans, node) 
  
    for to in graph[node]: 
        if to == parent: 
            continue
        dfs(to, node) 
  
# Driver Code 
if __name__ == "__main__": 
  
    x = 15
  
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
  
# This code is contributed by 
# sanjeev2552 

