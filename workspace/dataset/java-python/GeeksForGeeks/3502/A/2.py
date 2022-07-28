

# Python3 program to find the node   
# with maximum value at a given level  
  
# Helper function that allocates a new  
# node with the given data and None  
# left and right poers.                                      
class newNode:  
  
    # Constructor to create a new node  
    def __init__(self, data):  
        self.data = data 
        self.left = None
        self.right = None
  
# function to find the maximum   
# value at given level  
def maxAtLevel(root, level):  
  
    # If the tree is empty  
    if (root == None) : 
        return 0
  
    # if level becomes 0, it means we  
    # are on any node at the given level  
    if (level == 0) : 
        return root.data  
  
    x = maxAtLevel(root.left, level - 1)  
    y = maxAtLevel(root.right, level - 1)  
  
    # return maximum of two  
    return max(x, y) 
      
# Driver Code  
if __name__ == '__main__': 
  
    """  
    Let us create Binary Tree shown 
    in above example """
    root = newNode(45)  
    root.left = newNode(46)  
    root.left.left = newNode(18)  
    root.left.left.left = newNode(16)  
    root.left.left.right = newNode(23)  
    root.left.right = newNode(17)  
    root.left.right.left = newNode(24)  
    root.left.right.right = newNode(21)  
    root.right = newNode(15)  
    root.right.left = newNode(22)  
    root.right.left.left = newNode(37)  
    root.right.left.right = newNode(41)  
    root.right.right = newNode(19)  
    root.right.right.left = newNode(49)  
    root.right.right.right = newNode(29) 
    level = 3
    print(maxAtLevel(root, level)) 
  
# This code is contributed by 
# Shubham Singh(SHUBHAMSINGH10) 

