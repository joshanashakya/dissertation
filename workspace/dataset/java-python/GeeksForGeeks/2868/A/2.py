

# Python3 implementation of the approach 
cnt = 0
  
graph = [0] * 100
for i in range(100): 
    graph[i] = [] 
  
weight = ["0"] * 100
  
# Function that returns true 
# if x is a palindrome 
def isPalindrome(x): 
    n = len(x) 
  
    for i in range(0, n // 2): 
        if x[i] != x[n - 1 - i]: 
            return False
  
    return True
  
# Function to perform dfs 
def dfs(node, parent): 
    global cnt 
  
    # Weight of the current node 
    x = weight[node] 
  
    # If the weight is a palindrome 
    if (isPalindrome(x)): 
        cnt += 1
  
    for to in graph[node]: 
        if to == parent: 
            continue
        dfs(to, node) 
  
# Driver Code 
if __name__ == "__main__": 
  
    # Weights of the node 
    weight[0] = "" 
    weight[1] = "abc"
    weight[2] = "aba"
    weight[3] = "bcb"
    weight[4] = "moh"
    weight[5] = "aa"
  
    # Edges of the tree 
    graph[1].append(2) 
    graph[2].append(3) 
    graph[2].append(4) 
    graph[1].append(5) 
  
    dfs(1, 1) 
  
    print(cnt) 
  
# This code is contributed by 
# sanjeev2552 

