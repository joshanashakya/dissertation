

# Python3 program to find deepest  
# left leaf Binary search Tree 
  
_MIN = -2147483648
_MAX = 2147483648
  
# Helper function that allocates a new  
# node with the given data and None  
# left and right poers.                                      
class newnode:  
  
    # Constructor to create a new node  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
  
# utility function to return deepest 
# left leaf node 
def getDeepestLeftLeafNode(root) : 
  
    if (not root): 
        return None
  
    # create a queue for level 
    # order traversal  
    q = []  
    q.append(root)  
  
    result = None
  
    # traverse until the queue is empty  
    while (len(q)):  
        temp = q[0]  
        q.pop(0)  
  
        if (temp.left): 
            q.append(temp.left) 
            if (not temp.left.left and 
                not temp.left.right):  
                result = temp.left  
          
        # Since we go level by level,  
        # the last stored right leaf 
        # node is deepest one  
        if (temp.right):  
            q.append(temp.right)          
      
    return result 
  
# Driver Code  
if __name__ == '__main__': 
      
    # create a binary tree  
    root = newnode(1)  
    root.left = newnode(2)  
    root.right = newnode(3)  
    root.left.Left = newnode(4) 
    root.right.left = newnode(5)  
    root.right.right = newnode(6) 
    root.right.left.right = newnode(7) 
    root.right.right.right = newnode(8) 
    root.right.left.right.left = newnode(9) 
    root.right.right.right.right = newnode(10)  
  
    result = getDeepestLeftLeafNode(root) 
    if result: 
        print("Deepest Left Leaf Node ::", 
                              result.data) 
    else: 
        print("No result, Left leaf not found") 
          
# This code is contributed by 
# Shubham Singh(SHUBHAMSINGH10) 

