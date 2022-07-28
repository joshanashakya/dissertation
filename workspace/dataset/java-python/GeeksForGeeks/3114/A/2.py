

# Python3 implementation of the approach 
MAX = 15
  
tree = [0]*MAX
lazy = [0]*MAX
  
# Function to build the segment tree 
def build(arr,node, a, b): 
    if (a == b): 
        tree[node] = arr[a] 
        return
  
    # left child 
    build(arr,2 * node, a, (a + b) // 2) 
  
    # right child 
    build(arr,2 * node + 1, 1 + (a + b) // 2, b) 
  
    tree[node] = tree[node * 2] +tree[node * 2 + 1] 
  
def update_tree(node, a,b, i, j): 
  
    # If lazy of node is 1 then 
    # value in current node 
    # needs to be flipped 
    if (lazy[node] != 0): 
  
        # Update it 
        tree[node] = tree[node] * (-1) 
  
        if (a != b): 
  
            # flip value in lazy 
            lazy[node * 2] =not (lazy[node * 2]) 
  
            # flip value in lazy 
            lazy[node * 2 + 1] =not (lazy[node * 2 + 1]) 
  
  
        # Reset the node lazy value 
        lazy[node] = 0
  
  
    # Current segment is not 
    # within range [i, j] 
    if (a > b or a > j or b < i): 
        return
  
    # Segment is fully 
    # within range 
    if (a >= i and b <= j): 
        tree[node] = tree[node] * (-1) 
  
        # Not leaf node 
        if (a != b): 
  
            # Flip the value as if lazy is 
            # 1 and again asked to flip 
            # value then without flipping 
            # value two times 
            lazy[node * 2] = not (lazy[node * 2]) 
            lazy[node * 2 + 1] = not (lazy[node * 2 + 1]) 
  
  
        return
  
  
    # Updating left child 
    update_tree(node * 2, a,(a + b) // 2, i, j) 
  
    # Updating right child 
    update_tree(1 + node * 2, 1 +(a + b) // 2, b, i, j) 
  
    # Updating root with 
    # sum of its child 
    tree[node] = tree[node * 2] +tree[node * 2 + 1] 
  
  
def query_tree(node, a,b, i, j): 
    # Out of range 
    if (a > b or a > j or b < i): 
        return 0
  
    # If lazy of node is 1 then value 
    # in current node needs to be flipped 
    if (lazy[node] != 0): 
  
  
        tree[node] = tree[node] * (-1) 
        if (a != b): 
            lazy[node * 2] =not (lazy[node * 2]) 
  
            # flip value in lazy 
            lazy[node * 2 + 1] = not (lazy[node * 2 + 1]) 
  
  
        lazy[node] = 0
  
  
    # Current segment is totally 
    # within range [i, j] 
    if (a >= i and b <= j): 
        return tree[node] 
  
    # Query left child 
    q1 = query_tree(node * 2, a,(a + b) // 2, i, j) 
  
    # Query right child 
    q2 = query_tree(1 + node * 2,1 + (a + b) // 2, b, i, j) 
  
    # Return final result 
    return q1 + q2 
  
# Driver code 
if __name__ == '__main__': 
  
    arr=[1,2,3,4,5] 
  
    n=len(arr) 
  
    # Building segment tree 
    build(arr,1, 0, n - 1) 
  
    # Array is { 1, 2, 3, 4, 5 
    print(query_tree(1, 0, n - 1, 0, 4)) 
  
    # Flip range 0 to 4 
    update_tree(1, 0, n - 1, 0, 4) 
  
    # Array becomes { -1, -2, -3, -4, -5 
    print(query_tree(1, 0, n - 1, 0, 4)) 
  
    # Flip range 0 t0 2 
    update_tree(1, 0, n - 1, 0, 2) 
  
    # Array becomes { 1, 2, 3, -4, -5 
    print(query_tree(1, 0, n - 1, 0, 4)) 
  
# This code is contributed by mohit kumar 29 

