

# Python 3 program to count the number of nodes 
# in the tree whose weight is a 
# Fibonacci number 
sz = 1e5
ans = 0
  
graph = [[] for i in range(100)] 
weight = [0 for i in range(100)] 
  
# To store all fibonacci numbers 
fib = set() 
  
# Function to generate fibonacci numbers using 
# Dynamic Programming and create hash table 
# to check Fibonacci numbers 
def fibonacci(): 
  
    # Inserting the first two Fibonacci numbers 
    # in the hash 
    prev = 0
    curr = 1
    len1 = 2
    fib.add(prev) 
    fib.add(curr) 
  
    # Computing the Fibonacci numbers until 
    # the maximum number and storing them 
    # in the hash 
    while (len1 <= sz): 
        temp = curr + prev 
        fib.add(temp) 
        prev = curr; 
        curr = temp; 
        len1 += 1
  
# Function to perform dfs 
def dfs(node, parent): 
    global ans 
  
    # Check if the weight of the node 
    # is a Fibonacci number or not 
    if (weight[node] in fib): 
        ans += 1
  
    # Performing DFS to iterate the 
    # remaining nodes 
    for to in graph[node]: 
        if (to == parent): 
            continue
        dfs(to, node) 
  
# Driver code 
if __name__ == '__main__': 
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
  
    # Generate fibonacci numbers 
    fibonacci() 
  
    # Call the dfs function to 
    # traverse through the tree 
    dfs(1, 1) 
  
    print(ans) 
  
# This code is contributed by Surendra_Gangwar 

