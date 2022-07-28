

# Python3 code to print order of  
# insertion into AVL tree to  
# ensure no rotations 
  
# Tree Node 
class Node:  
    def __init__(self, d):  
        self.data = d  
        self.left = None
        self.right = None
  
# Function to convert sorted array  
# to a balanced AVL Tree/BST 
# Input : sorted array of integers  
# Output: root node of balanced AVL Tree/BST  
def sortedArrayToBST(arr):  
      
    if not arr:  
        return None
  
    # Find middle and get its floor value 
    mid = int((len(arr)) / 2) 
    root = Node(arr[mid])  
      
    # Recursively construct the left  
    # and right subtree 
    root.left = sortedArrayToBST(arr[:mid])  
    root.right = sortedArrayToBST(arr[mid + 1:])  
  
    # Return the root of the  
    # constructed tree 
    return root  
  
# A utility function to print the 
# Level Order Traversal of AVL Tree 
# using a Queue 
def printLevelOrder(root):  
    if not root:  
        return
      
    q = [] 
    q.append(root) 
  
    # Keep printing the top element and 
    # adding to queue while it is not empty 
    while q != []: 
        node = q.pop(0) 
        print(node.data, end=" ") 
  
        # If left node exists, enqueue it 
        if node.left: 
            q.append(node.left) 
  
        # If right node exists, enqueue it  
        if node.right: 
            q.append(node.right) 
  
# Driver Code 
arr = [1, 2, 3, 4, 5, 6, 7]  
root = sortedArrayToBST(arr)  
printLevelOrder(root)  
  
# This code is contributed  
# by Adikar Bharath  

