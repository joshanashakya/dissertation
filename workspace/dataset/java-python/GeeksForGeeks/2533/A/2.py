

# Python 3 program to find minimum changes 
# required to make two arrays identical 
  
N = 100010
  
# 'id':stores parent of a node 
# 'sz':stores size of a DSU tree 
ID = [0 for i in range(N)] 
sz = [0 for i in range(N)] 
  
# function to assign root 
def Root(idx): 
    i = idx 
    while i != ID[i]: 
        ID[i], i = ID[ID[i]], ID[i] 
    return i 
  
# Function to find Union 
def Union(a, b): 
    i, j = Root(a), Root(b) 
      
    if i != j: 
        if sz[i] >= sz[j]: 
            ID[j] = i 
            sz[i] += sz[j] 
            sz[j] = 0
        else: 
            ID[i] = j 
            sz[j] += sz[i] 
            sz[i] = 0
  
# function to find minimum changes 
# reqired to make both array equal 
def minChange(n, a, b): 
      
    # sets as single elements 
    for i in range(N): 
        ID[i] = i 
        sz[i] = 1
          
    # Combine items if they belong  
    # to differnet sets 
    for i in range(n): 
          
        # true if both elements have 
        # different root 
        if Root(a[i]) != Root(b[i]): 
            Union(a[i], b[i]) 
      
    # find sum sizes of all sets formed 
    ans = 0
    for i in range(n): 
        if ID[i] == i: 
            ans += (sz[i] - 1) 
      
    return ans 
      
# Driver Code 
a = [2, 1, 1, 3, 5] 
b = [1, 2, 2, 4, 5] 
n = len(a) 
  
print(minChange(n, a, b)) 
  
# This code is contributed  
# by Mohit kumar 29 (IIIT gwalior) 

