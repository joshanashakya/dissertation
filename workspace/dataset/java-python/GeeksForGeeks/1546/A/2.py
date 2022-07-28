

# Python3 program to contrcut all unique 
# BSTs for keys from 1 to n  
  
# Binary Tree Node  
""" A utility function to create a 
new BST node """
class newNode:  
  
    # Construct to create a newNode  
    def __init__(self, data):  
        self.data = data 
        self.left = None
        self.right = None
  
# Function to perform inorder traversal  
def inorder(root) : 
  
    if (root == None):  
        return
  
    inorder(root.left)  
  
    print(root.data, end = " ")  
  
    inorder(root.right)  
  
# Function to check if two BSTs  
# are identical  
def isIdentical(root1, root2) : 
  
    # Check if both the trees are empty  
    if (root1 == None and root2 == None) : 
        return 1
          
    # If any one of the tree is non-empty  
    # and other is empty, return false  
    elif (root1 != None and root2 == None) : 
        return 0
    elif (root1 == None and root2 != None) : 
        return 0
    else: # Check if current data of both trees  
          # equal and recursively check for left  
          # and right subtrees  
        if (root1.data == root2.data and 
            isIdentical(root1.left, root2.left)  
            and isIdentical(root1.right, root2.right)) : 
            return 1
        else: 
            return 0
      
# Driver Code  
if __name__ == '__main__': 
  
    root1 = newNode(5)  
    root2 = newNode(5)  
    root1.left = newNode(3)  
    root1.right = newNode(8)  
    root1.left.left = newNode(2)  
    root1.left.right = newNode(4)  
  
    root2.left = newNode(3)  
    root2.right = newNode(8)  
    root2.left.left = newNode(2)  
    root2.left.right = newNode(4)  
  
    if (isIdentical(root1, root2)):  
        print("Both BSTs are identical") 
    else: 
        print("BSTs are not identical") 
  
# This code is contributed by 
# Shubham Singh(SHUBHAMSINGH10) 

