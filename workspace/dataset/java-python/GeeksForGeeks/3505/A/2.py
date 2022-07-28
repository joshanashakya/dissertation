

# A recursive program to find difference between sum of nodes 
# at odd level and sum at even level 
  
# A Binary Tree node 
class Node: 
  
    # Constructor to create a new node 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
  
# The main function that returns difference between odd and  
# even level nodes 
def getLevelDiff(root): 
  
    # Base Case  
    if root is None: 
        return 0 
  
    # Difference for root is root's data - difference for 
    # left subtree - difference for right subtree 
    return (root.data - getLevelDiff(root.left)- 
        getLevelDiff(root.right)) 
  
# Driver program to test above function 
root = Node(5) 
root.left = Node(2) 
root.right = Node(6) 
root.left.left = Node(1) 
root.left.right = Node(4) 
root.left.right.left = Node(3) 
root.right.right = Node(8) 
root.right.right.right = Node(9) 
root.right.right.left = Node(7) 
print "%d is the required difference" %(getLevelDiff(root)) 
  
# This code is contributed by Nikhil Kumar Singh(nickzuck_007) 

