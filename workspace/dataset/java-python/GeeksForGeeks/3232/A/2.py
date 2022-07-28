

# Python3 implementation of the approach  
m, x = [0] * 1000, [0] * 22
  
# Array to store the number of times each bit  
# is set in all the values of a subtree  
a = [[0 for i in range(22)]  
        for j in range(1000)] 
ans = 0
  
# Function to perform simple DFS  
def dfs(u, p): 
  
    global ans 
    for i in range(0, len(g[u])):  
        v = g[u][i]  
        if v != p:  
            dfs(v, u)  
  
            # Finding the number of times  
            # each bit is set in all the  
            # values of a subtree rooted at v  
            for i in range(0, 22):  
                a[u][i] += a[v][i]  
  
    # Checking for each bit whether the numbers  
    # with that particular bit as set are  
    # either zero in both the resulting trees or  
    # greater than zero in both the resulting trees  
    pp = 0
    for i in range(0, 22):  
        if (not((a[u][i] > 0 and
                 x[i] - a[u][i] > 0)  
            or (a[u][i] == 0 and x[i] == 0))):  
            pp = 1
            break
          
    if pp == 0:  
        ans += 1
  
# Driver code  
if __name__ == "__main__": 
  
    # Number of nodes  
    n = 4
  
    # ArrayList to store the tree  
    g = [[] for i in range(n+1)] 
  
    # Array to store the value of nodes  
    m[1] = 1
    m[2] = 3
    m[3] = 2
    m[4] = 3
  
    # Array to store the number of times  
    # each bit is set in all the values 
    # in complete tree  
    for i in range(1, n+1):  
        y, k = m[i], 0
  
        # Finding the set bits in the  
        # value of node i  
        while y != 0:  
            p = y % 2
            if p == 1:  
                x[k] += 1
                a[i][k] += 1
              
            y = y // 2
            k += 1
          
    # append edges  
    g[1].append(2)  
    g[2].append(1)  
    g[1].append(3)  
    g[3].append(1)  
    g[1].append(4)  
    g[4].append(1)  
    dfs(1, 0)  
    print(ans)  
  
# This code is contributed by Rituraj Jain 

