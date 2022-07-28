

# Python3 implementation of the approach 
from bisect import bisect_left as lower_bound 
  
# Merge procedure to merge two 
# vectors into a single vector 
def merge(v1, v2): 
    i = 0
    j = 0
  
    # Final vector to return 
    # after merging 
    v = [] 
  
    # Loop continues until it reaches 
    # the end of one of the vectors 
    while (i < len(v1) and j < len(v2)): 
        if (v1[i] <= v2[j]): 
            v.append(v1[i]) 
            i += 1
        else: 
            v.append(v2[j]) 
            j += 1
  
    # Here, simply add the remaining 
    # elements to the vector v 
    for k in range(i, len(v1)): 
        v.append(v1[k]) 
    for k in range(j, len(v2)): 
        v.append(v2[k]) 
    return v 
  
# Procedure to build the segment tree 
def buildTree(tree,arr,index, s, e): 
  
    # Reached the leaf node 
    # of the segment tree 
    if (s == e): 
        tree[index].append(arr[s]) 
        return
  
    # Recursively call the buildTree 
    # on both the nodes of the tree 
    mid = (s + e) // 2
    buildTree(tree, arr, 2 * index, s, mid) 
    buildTree(tree, arr, 2 * index + 1, mid + 1, e) 
  
    # Storing the final vector after merging 
    # the two of its sorted child vector 
    tree[index] = merge(tree[2 * index], tree[2 * index + 1]) 
  
# Query procedure to get the answer 
# for each query l and r are query range 
def query(tree, index, s, e, l, r, k): 
  
    # out of bound or no overlap 
    if (r < s or l > e): 
        return 0
  
    # Complete overlap 
    # Query range completely lies in 
    # the segment tree node range 
    if (s >= l and e <= r): 
          
        # binary search to find index of k 
        return len(tree[index]) - (lower_bound(tree[index], k)) 
  
    # Partially overlap 
    # Query range partially lies in 
    # the segment tree node range 
    mid = (s + e) // 2
    return (query(tree, 2 * index, s,mid, l, r, k) 
            + query(tree, 2 * index + 1, mid + 1,e, l, r, k)) 
  
# Function to perform the queries 
def performQueries(L, R, K,n, q,tree): 
    for i in range(q): 
        print(query(tree, 1, 0, n - 1,L[i] - 1, R[i] - 1, K[i])) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [7, 3, 9, 13, 5, 4] 
    n = len(arr) 
    tree = [[] for i in range(4 * n + 1)] 
    buildTree(tree, arr, 1, 0, n - 1) 
  
    # 1-based indexing 
    L = [1, 2] 
    R = [4, 6] 
    K = [6, 8] 
  
    # Number of queries 
    q = len(L) 
  
     performQueries(L, R, K, n, q, tree) 
       
# This code is contributed by mohit kumar 29          

