

# Python3 implementation of the approach 
  
# Tree node 
class Node: 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
      
# Recursive function to update 
# the parent array such that parent[i] 
# stores the parent of i 
def updateParent(parent, node): 
  
    # If node is None then return 
    if (node == None): 
        return parent 
  
    # If left child of the node is not 
    # None then set node as the parent 
    # of its left child 
    if (node.left != None): 
        parent[node.left.data] = node.data 
  
    # If right child of the node is not 
    # None then set node as the parent 
    # of its right child 
    if (node.right != None): 
        parent[node.right.data] = node.data 
  
    # Recursive call for the 
    # children of current node 
    parent = updateParent(parent, node.left) 
    parent = updateParent(parent, node.right) 
    return parent 
  
# Function to return the maximum value 
# of a node on the path from root to val 
# when Xored with x 
def getMaxXor(root, n, val, x): 
  
    # Create the parent array 
    parent = [0]*(n + 1) 
    parent=updateParent(parent, root) 
  
    # Initialze max with x XOR val 
    maximum = x ^ val 
  
    # Get to the parent of val 
    val = parent[val] 
  
    # 0 is the parent of the root 
    while (val != 0): 
      
        # Update maximum 
        maximum = max(maximum, x ^ val) 
  
        # Get one level up the tree 
        val = parent[val] 
      
    return maximum 
  
# Driver Code 
n = 6
  
root = Node(1) 
root.left = Node(2) 
root.right = Node(3) 
root.left.left = Node(4) 
root.right.right = Node(5) 
root.right.right.left = Node(6) 
  
val = 6
x = 4
print( getMaxXor(root, n, val, x) ) 
  
# This code is contributed by Arnab Kundu 
  
  

