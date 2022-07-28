

# Python3 program to prsideways 
# traversal of complete binary tree 
from collections import deque 
  
sz = 10**5
maxLevel = 0
  
# Adjacency list representation 
# of the tree 
tree = [[] for i in range(sz + 1)] 
  
# Boolean array to mark all the 
# vertices which are visited 
vis = [False]*(sz + 1) 
  
# Integer array to store the level 
# of each node 
level = [0]*(sz + 1) 
  
# Array of vector where ith index 
# stores all the nodes at level i 
nodes = [[] for i in range(sz + 1)] 
  
# Utility function to create an 
# edge between two vertices 
def addEdge(a, b): 
  
    # Add a to b's list 
    tree[a].append(b) 
  
    # Add b to a's list 
    tree[b].append(a) 
  
# Modified Breadth-First Function 
def bfs(node): 
    global maxLevel 
  
    # Create a queue of {child, parent} 
    qu = deque() 
  
    # Push root node in the front of 
    # the queue and mark as visited 
    qu.append([node, 0]) 
    nodes[0].append(node) 
    vis[node] = True
    level[1] = 0
  
    while (len(qu) > 0): 
  
        p = qu.popleft() 
  
        # Dequeue a vertex from queue 
        vis[p[0]] = True
  
        # Get all adjacent vertices of the dequeued 
        # vertex s. If any adjacent has not 
        # been visited then enqueue it 
        for child in tree[p[0]]: 
  
            if (vis[child] == False): 
                qu.append([child, p[0]]) 
                level[child] = level[p[0]] + 1
                maxLevel = max(maxLevel, level[child]) 
                nodes[level[child]].append(child) 
  
# Utility Function to display the pattern 
def display(): 
    global maxLevel 
      
    # k represents the level no. 
    # cycle represents how many 
    # cycles has been completed 
    k = 0
    path = 0
    condn = (maxLevel) // 2 + 1
    flag = True
  
    # While there are nodes left to traverse 
    while (condn): 
  
        if (flag): 
  
            # Traversing whole level from 
            # left to right 
            j = len(nodes[k]) - 1
            for j in range(len(nodes[k])- path): 
                print(nodes[k][j],end=" ") 
  
            # Moving to new level 
            k += 1
  
            # Traversing rightmost unvisited 
            # element in path path as we 
            # move up to down 
            while (k < maxLevel): 
  
                j = len(nodes[k]) - 1
                print(nodes[k][j - path], end=" ") 
                k += 1
  
            j = len(nodes[k]) - 1
            if (k > path): 
                while j >= 0: 
                    j -= path 
                    print(nodes[k][j], end=" ") 
                    j -= 1
  
            # Setting value of new maximum 
            # level upto which we have to traverse 
            # next time 
            maxLevel -= 1
  
            # Updating from which level to 
            # start new path 
            k -= 1
            path += 1
  
            flag = not flag 
        else: 
  
            # Traversing each element of remaing 
            # last level from left to right 
            j = len(nodes[k]) - 1
            for j in range(len(nodes[k]) - path): 
                print(nodes[k][j], end=" ") 
  
            # Decrementing value of Max level 
            maxLevel -= 1
  
            k -= 1
  
            # Traversing rightmost unvisited 
            # element in path as we 
            # move down to up 
            while (k > path): 
  
                j = len(nodes[k]) - 1
                print(nodes[k][j - path], end=" ") 
                k -= 1
  
            j = len(nodes[k]) - 1
  
            if (k == path): 
                while j >= 0: 
                    j -= path 
                    print(nodes[k][j],end=" ") 
                    j -= 1
  
            path += 1
  
            # Updating the level number from which 
            # a new cycle has to be started 
            k += 1
            flag = not flag 
        condn -= 1
  
# Driver code 
if __name__ == '__main__': 
  
    # Initialising the above mentioned 
    # complete binary tree 
    for i in range(1,6): 
  
        # Adding edge to a binary tree 
        addEdge(i, 2 * i) 
        addEdge(i, 2 * i + 1) 
  
    # Calling modified bfs function 
    bfs(1) 
  
    display() 
  
# This code is contributed by mohit kumar 29 

