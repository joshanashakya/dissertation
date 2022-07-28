

# Python3 program to find maximum product 
# of a level in Binary Tree 
  
# Helper function that allocates a new  
# node with the given data and None left  
# and right poers.                                      
class newNode:  
  
    # Construct to create a new node  
    def __init__(self, key):  
        self.data = key 
        self.left = None
        self.right = None
  
# Function to find the maximum product  
# of a level in tree using level order 
# traversal 
def maxLevelProduct(root): 
  
    # Base case 
    if (root == None): 
        return 0
  
    # Initialize result 
    result = root.data 
  
    # Do Level order traversal keeping track  
    # of number of nodes at every level. 
    q = [] 
    q.append(root) 
    while (len(q)):  
  
        # Get the size of queue when the level  
        # order traversal for one level finishes 
        count = len(q) 
  
        # Iterate for all the nodes in  
        # the queue currently 
        product = 1
        while (count): 
            count -= 1
              
            # Dequeue an node from queue 
            temp = q[0] 
            q.pop(0) 
  
            # Multiply this node's value to  
            # current product. 
            product = product * temp.data 
  
            # Enqueue left and right children  
            # of dequeued node 
            if (temp.left != None): 
                q.append(temp.left) 
            if (temp.right != None): 
                q.append(temp.right) 
          
        # Update the maximum node count value 
        result = max(product, result) 
      
    return result 
  
# Driver Code  
if __name__ == '__main__': 
      
    """  
    Let us create Binary Tree  
    shown in above example """
    root = newNode(1) 
    root.left = newNode(2) 
    root.right = newNode(3) 
    root.left.left = newNode(4) 
    root.left.right = newNode(5) 
    root.right.right = newNode(8) 
    root.right.right.left = newNode(6) 
    root.right.right.right = newNode(7) 
      
    """ Constructed Binary tree is: 
            1 
            / \ 
        2 3 
        / \ \ 
        4 5 8 
                / \ 
            6 7 """
  
    print("Maximum level product is", 
               maxLevelProduct(root)) 
  
# This code is contributed by 
# Shubham Singh(SHUBHAMSINGH10) 

