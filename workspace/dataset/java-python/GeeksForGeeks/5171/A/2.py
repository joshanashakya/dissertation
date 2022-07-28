

# Python3 program to print the nodes of binary 
# tree as they become the leaf node 
  
# Binary tree node  
class newNode:  
      
    def __init__(self, data,order):  
        self.data = data  
        self.order=order 
        self.left = None
        self.right = None
  
# Function for postorder traversal of tree and 
# assigning values to nodes 
def Postorder(node,v): 
    if (node == None): 
        return
      
    """ first recur on left child """
    Postorder(node.left, v) 
      
    """ now recur on right child """
    Postorder(node.right, v) 
      
    # If current node is leaf node,  
    # it's order will be 1 
    if (node.right == None and 
        node.left == None): 
        node.order = 1
          
        # make pair of assigned value and tree value 
        v[0].append([node.order, node.data]) 
      
    else: 
          
        # otherwise, the order will be: 
        # max(left_child_order, right_child_order) + 1 
        node.order = max((node.left).order,  
                         (node.right).order) + 1
          
        # make pair of assigned value and tree value 
        v[0].append([node.order, node.data]) 
          
# Function to print leaf nodes in 
# the given order 
def printLeafNodes(n, v): 
      
    # Sort the vector in increasing order of 
    # assigned node values 
    v=sorted(v[0]) 
    for i in range(n - 1): 
        if (v[i][0]== v[i + 1][0]): 
            print(v[i][1], end = " ") 
        else: 
            print(v[i][1]) 
    if (v[-1][0]== v[-2][0]): 
            print(v[-1][1], end = " ") 
    else: 
        print(v[-1][1]) 
      
# Driver Code 
root = newNode(8, 0) 
root.left = newNode(3, 0) 
root.right = newNode(10, 0) 
root.left.left = newNode(1, 0) 
root.left.right = newNode(6, 0) 
root.right.left = newNode(14, 0) 
root.right.right = newNode(4, 0) 
root.left.left.left = newNode(7, 0) 
root.left.left.right = newNode(13, 0) 
  
n = 9
v = [[] for i in range(1)] 
  
Postorder(root, v) 
printLeafNodes(n, v) 
  
# This code is contributed by SHUBHAMSINGH10 

