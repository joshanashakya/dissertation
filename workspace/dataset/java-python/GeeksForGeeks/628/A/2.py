

# Python3 implementation of the above approach 
N = 100005
  
# Keeping the values array indexed by 1. 
arr = [0, 1, 2, 2, 1, 4, 3, 6] 
tree = [[] for i in range(N)] 
  
idx = 0
tin = [0]*N 
tout = [0]*N 
converted = [0]*N 
  
# Function to perform DFS in the tree 
def dfs(node, parent): 
    global idx 
    idx += 1
    converted[idx] = node 
  
    # To store starting range of a node 
    tin[node] = idx 
    for i in tree[node]: 
        if (i != parent): 
            dfs(i, node) 
  
    # To store ending range of a node 
    tout[node] = idx 
  
# Segment tree 
t = [0]*(N * 4) 
  
# Build using the converted array indexes. 
# Here a simple n-ary tree is converted 
# into a segment tree. 
  
# Now O(NlogN) range updates and queries 
# can be performed. 
def build(node, start, end): 
  
    if (start == end): 
        t[node] = arr[converted[start]] 
    else: 
        mid = (start + end) >> 1
        build(2 * node, start, mid) 
        build(2 * node + 1, mid + 1, end) 
  
        t[node] = t[2 * node] + t[2 * node + 1] 
  
# Function to perform update operation 
# on the tree 
def update(node, start, end,lf, rg, c): 
    if (start > end or start > rg or end < lf): 
        return
  
    if (start == end): 
        t[node] = c 
    else: 
  
        mid = (start + end) >> 1
        update(2 * node, start, mid, lf, rg, c) 
        update(2 * node + 1, mid + 1, end, lf, rg, c) 
  
        t[node] = t[2 * node] + t[2 * node + 1] 
  
# Function to find the sum at every node 
def query(node, start, end, lf, rg): 
    if (start > rg or end < lf): 
        return 0
  
    if (lf <= start and end <= rg): 
        return t[node] 
    else: 
        ans = 0
        mid = (start + end) >> 1
        ans += query(2 * node, start, mid, lf, rg) 
  
        ans += query(2 * node + 1, mid + 1, 
                    end, lf, rg) 
  
        return ans 
  
# Function to prthe tree 
def printTree(q, node, n): 
    while (q > 0): 
          
        # Calculating range of node in segment tree 
        lf = tin[node] 
        rg = tout[node] 
        res = query(1, 1, n, lf, rg) 
        print("sum at node",node,":",res) 
        node += 1
        q -= 1
  
# Driver code 
if __name__ == '__main__': 
    n = 7
    q = 7
  
    # Creating the tree. 
    tree[1].append(2) 
    tree[1].append(3) 
    tree[1].append(4) 
    tree[3].append(5) 
    tree[3].append(6) 
    tree[3].append(7) 
  
    # DFS to get converted array. 
    idx = 0
    dfs(1, -1) 
  
    # Build segment tree with converted array. 
    build(1, 1, n) 
    printTree(7, 1, 7) 
  
    # Updating the value at node 3 
    node = 3
    lf = tin[node] 
    rg = tout[node] 
    value = 4
  
    update(1, 1, n, lf, rg, value) 
  
    print("After Update") 
    printTree(7, 1, 7) 
  
# This code is contributed by mohit kumar 29 

