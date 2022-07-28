

# Python3 program to print maximum element 
# among all right child nodes 
  
# Tree node  
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
  
# Utility function to create a new tree node 
def newNode(data): 
  
    temp = Node(0) 
    temp.data = data 
    temp.left = temp.right = None
    return temp 
  
# Function to find maximum element 
# among all right child nodes using 
# Inorder Traversal 
def maxOfRightElement(root): 
  
    # Temp variable 
    res = -999999
  
    # If tree is empty 
    if (root == None): 
        return -1
  
    # If right child exists 
    if (root.right != None): 
        res = root.right.data 
  
    # Return maximum of three values 
    # 1) Recursive max in right subtree 
    # 2) Value in right child node 
    # 3) Recursive max in left subtree 
    return max( maxOfRightElement(root.right), 
                res, 
                maxOfRightElement(root.left) ) 
  
# Driver Code 
  
# Create binary tree 
# as shown below 
#     7 
# / \ 
# 6 5 
# / \ / \ 
# 4 3 2 1  
root = newNode(7) 
root.left = newNode(6) 
root.right = newNode(5) 
root.left.left = newNode(4) 
root.left.right = newNode(3) 
root.right.left = newNode(2) 
root.right.right = newNode(1) 
  
print (maxOfRightElement(root)) 
  
# This code is contributed by Arnab Kundu 

