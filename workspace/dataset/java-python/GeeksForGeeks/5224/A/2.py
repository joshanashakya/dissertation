

# Python3 program to find minimum path sum  
# between two leaves of a binary tree  
      
# Tree node  
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
  
# Utility function to allocate memory  
# for a new node  
def newNode( data):  
  
    node = Node(0)  
    node.data = data  
    node.left = node.right = None
  
    return (node)  
  
result = -1
  
# A utility function to find the  
# minimum sum between any two leaves. 
# This function calculates two values:  
# 1. Minimum path sum between two leaves   
# which is stored in result and,  
# 2. The minimum root to leaf path sum  
# which is returned.  
# If one side of root is empty,  
# then it returns INT_MIN  
def minPathSumUtil(root) : 
    global result 
      
    # Base cases  
    if (root == None):  
        return 0
  
    if (root.left == None and 
        root.right == None) : 
        return root.data  
  
    # Find minimum sum in left and right sub tree.  
    # Also find minimum root to leaf sums in  
    # left and right sub trees and store them  
    # in ls and rs  
    ls = minPathSumUtil(root.left)  
    rs = minPathSumUtil(root.right)  
  
    # If both left and right children exist  
    if (root.left != None and 
        root.right != None) : 
      
        # Update result if needed  
        result = min(result, ls + 
                     rs + root.data)  
  
        # Return minimum possible value for  
        # root being on one side  
        return min(ls + root.data,  
                   rs + root.data)  
      
    # If any of the two children is empty,  
    # return root sum for root being on one side  
    if (root.left == None) : 
        return rs + root.data  
    else: 
        return ls + root.data  
  
# Function to return the minimum  
# sum path between two leaves  
def minPathSum( root):  
    global result 
    result = 9999999
    minPathSumUtil(root)  
    return result  
  
# Driver code  
root = newNode(4)  
root.left = newNode(5)  
root.right = newNode(-6)  
root.left.left = newNode(2)  
root.left.right = newNode(-3)  
root.right.left = newNode(1)  
root.right.right = newNode(8)  
  
print(minPathSum(root))  
  
# This code is contributed  
# by Arnab Kundu 

