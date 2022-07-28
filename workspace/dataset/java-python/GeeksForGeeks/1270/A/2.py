

# Python program to find closest value in 
# Binary search Tree 
  
_MIN = -2147483648
_MAX = 2147483648
  
# Helper function that allocates a new  
# node with the given data and None left  
# and right poers.                                  
class newNode:  
  
    # Constructor to create a new node  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
  
# Function to find the Node closest to the  
# given key in BST using Morris Traversal 
def closestNodeUsingMorrisTraversal(root,key): 
    diff = _MAX 
    curr = root 
    closest=0
  
    while (curr) : 
        if (curr.left == None) : 
  
            # updating diff if the current diff is 
            # smaller than prev difference 
            if (diff > abs(curr.data - key)) : 
                diff = abs(curr.data - key) 
                closest = curr 
              
            curr = curr.right 
          
  
        else : 
  
            # finding the inorder predecessor 
            pre = curr.left 
            while (pre.right != None and
                    pre.right != curr): 
                pre = pre.right 
  
            if (pre.right == None):  
                pre.right = curr 
                curr = curr.left 
              
  
            # threaded link between curr and 
            # its predecessor already exists 
            else : 
                pre.right = None
  
                # if a closer Node found, then update  
                # the diff and set closest to current 
                if (diff > abs(curr.data - key)) : 
                    diff = abs(curr.data - key) 
                    closest = curr 
                  
                # moving to the right child 
                curr = curr.right 
                  
    return closest 
  
          
# Driver Code  
if __name__ == '__main__': 
    """ /* Constructed binary tree is 
        5 
        / \ 
    3 9 
    / \ / \ 
    1 2 8 12 */ """
      
    root = newNode(5)  
    root.left = newNode(3)  
    root.right = newNode(9)  
    root.left.right = newNode(2) 
    root.left.left = newNode(1) 
    root.right.right = newNode(12) 
    root.right.left = newNode(8) 
    print(closestNodeUsingMorrisTraversal(root, 10).data) 
  
# This code is contributed 
# Shubham Singh(SHUBHAMSINGH10) 

