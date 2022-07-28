

# Python3 implementation of the approach 
MAX = 26
  
# Function to return 
# the value (x - 97) 
def f(x): 
    return ord(x) - ord('a') 
  
# Fucntion to return the minimum cost 
def findMinCost( arr): 
    global MAX
    n = len(arr) 
    m = len(arr[0]) 
  
    # Graph 
    gr = [] 
      
    for x in range(MAX): 
        gr.append([]) 
  
    # Adjacency matrix 
    edge = [] 
  
    # Initialising the adjacency matrix 
    for k in range(MAX): 
        edge.append([]) 
        for l in range(MAX): 
            edge[k].append(0) 
  
    # Creating the adjacency matrix 
    for i in range(n): 
        for j in range(m):  
            if (i + 1 < n and edge[f(arr[i][j])][f(arr[i + 1][j])] == 0):  
                gr[f(arr[i][j])].append(f(arr[i + 1][j])) 
                edge[f(arr[i][j])][f(arr[i + 1][j])] = 1
              
            if (j - 1 >= 0 and edge[f(arr[i][j])][f(arr[i][j - 1])] == 0):  
                gr[f(arr[i][j])].append(f(arr[i][j - 1])) 
                edge[f(arr[i][j])][f(arr[i][j - 1])] = 1
              
            if (j + 1 < m and edge[f(arr[i][j])][f(arr[i][j + 1])] == 0):  
                gr[f(arr[i][j])].append(f(arr[i][j + 1])) 
                edge[f(arr[i][j])][f(arr[i][j + 1])] = 1
              
            if (i - 1 >= 0 and edge[f(arr[i][j])][f(arr[i - 1][j])] == 0):  
                gr[f(arr[i][j])].append(f(arr[i - 1][j])) 
                edge[f(arr[i][j])][f(arr[i - 1][j])] = 1
              
    # Queue to perform BFS 
    q = [] 
    q.append(ord(arr[0][0]) - ord('a')) 
  
    # Visited array 
    v = [] 
    for i in range(MAX): 
        v.append(0) 
  
    # To store the depth of BFS 
    d = 0
  
    # BFS 
    while (len(q) > 0):  
  
        # Number of elements in 
        # the current level 
        cnt = len(q) 
  
        # Inner loop 
        while (cnt > 0):  
            cnt = cnt - 1
              
            # Current element 
            curr = q[0] 
  
            # Popping queue 
            q.pop(0) 
  
            # If the current node has 
            # already been visited 
            if (v[curr] != 0): 
                continue
            v[curr] = 1
              
            # Checking if the current 
            # node is the required node 
            if (curr == (ord(arr[n - 1][m - 1]) - ord('a'))): 
                return d 
  
            # Iterating through the current node 
            for it in gr[curr]: 
                q.append(it) 
          
        # Updating the depth 
        d = d + 1
  
    return -1
  
# Driver code 
arr =[ "abc","def","gbi" ] 
print( findMinCost(arr)) 
  
# This code is contributed by Arnab Kundu 

