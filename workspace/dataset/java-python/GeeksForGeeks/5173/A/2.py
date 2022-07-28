

# Python3 Implementation of 
# the above approach 
class Node: 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
  
# Helper function that allocates   
# a new node with the given data  
# and null left and right pointers. 
def insert(node, data): 
    if node is None : 
        return Node(data) 
    else: 
        if data <= node.data: 
            node.left = insert(node.left, data) 
        else: 
            node.right = insert(node.right, data) 
  
        return node 
  
# Function to return the minimum node 
# in the given binary search tree 
def minValue(node): 
    if node.left == None: 
        return node.data 
    return minValue(node.left) 
  
# Driver code 
if __name__ == "__main__" : 
      
    # Create the BST 
    root = None
    root = insert(root, 4) 
    insert(root, 2) 
    insert(root, 1) 
    insert(root, 3) 
    insert(root, 6) 
    insert(root, 5) 
  
    print(minValue(root)) 
  
# This code is contributed by vinayak 

