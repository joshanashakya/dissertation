

# Python implementation of the approach 
  
class Node: 
    def __init__(self, key): 
        self.key = key 
        self.left = None
        self.right = None
  
# A utility function to insert 
# a new node with given key in BST */ 
def insert(node: Node, key: int) -> Node: 
  
    # If the tree is empty, 
    # return a new node */ 
    if node is None: 
        return Node(key) 
    # Otherwise, recur down the tree 
    if key < node.key: 
        node.left = insert(node.left, key) 
    elif key > node.key: 
        node.right = insert(node.right, key) 
  
    # return the (unchanged) node pointer 
    return node 
  
# Compute the "maxDepth" of a tree -- 
# the number of nodes along the longest path 
# from the root node down to the farthest leaf node.*/ 
def maxDepth(node: Node) -> int: 
    if node is None: 
        return 0
    else: 
  
        # compute the depth of each subtree 
        lDepth = maxDepth(node.left) 
        rDepth = maxDepth(node.right) 
  
        # use the larger one 
        if lDepth > rDepth: 
            return lDepth + 1
        else: 
            return rDepth + 1
  
# Function to return the maximum 
# heights among the BSTs 
def maxHeight(a: list, n: int) -> int: 
  
    # Create a BST starting from 
    # the first element 
    rootA = Node(a[0]) 
    for i in range(1, n): 
        rootA = insert(rootA, a[i]) 
  
    # Create another BST starting 
    # from the last element 
    rootB = Node(a[n - 1]) 
    for i in range(n - 2, -1, -1): 
        rootB = insert(rootB, a[i]) 
  
    # Find the heights of both the trees 
    A = maxDepth(rootA) - 1
    B = maxDepth(rootB) - 1
  
    return max(A, B) 
  
# Driver Code 
if __name__ == "__main__": 
    a = [2, 1, 3, 4] 
    n = len(a) 
  
    print(maxHeight(a, n)) 
  
# This code is contributed by 
# sanjeev2552 

