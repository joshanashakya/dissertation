

# Find closest leaf to the given 
# node x in a tree  
  
# Utility class to create a new node  
class newNode: 
    def __init__(self, key): 
        self.key = key  
        self.left = self.right = None
      
# This function finds closest leaf to  
# root. This distance is stored at *minDist.  
def findLeafDown(root, lev, minDist): 
      
    # base case  
    if (root == None):  
        return
  
    # If this is a leaf node, then check if  
    # it is closer than the closest so far  
    if (root.left == None and 
        root.right == None): 
        if (lev < (minDist[0])):  
            minDist[0] = lev  
        return
  
    # Recur for left and right subtrees  
    findLeafDown(root.left, lev + 1, minDist)  
    findLeafDown(root.right, lev + 1, minDist) 
  
# This function finds if there is  
# closer leaf to x through parent node.  
def findThroughParent(root, x, minDist): 
      
    # Base cases  
    if (root == None): 
        return -1
    if (root == x): 
        return 0
  
    # Search x in left subtree of root  
    l = findThroughParent(root.left, x,  
                               minDist)  
  
    # If left subtree has x  
    if (l != -1): 
          
        # Find closest leaf in right subtree  
        findLeafDown(root.right, l + 2, minDist)  
        return l + 1
  
    # Search x in right subtree of root  
    r = findThroughParent(root.right, x, minDist)  
  
    # If right subtree has x  
    if (r != -1): 
          
        # Find closest leaf in left subtree  
        findLeafDown(root.left, r + 2, minDist)  
        return r + 1
  
    return -1
  
# Returns minimum distance of a leaf 
# from given node x  
def minimumDistance(root, x): 
      
    # Initialize result (minimum  
    # distance from a leaf)  
    minDist = [999999999999] 
  
    # Find closest leaf down to x  
    findLeafDown(x, 0, minDist)  
  
    # See if there is a closer leaf 
    # through parent  
    findThroughParent(root, x, minDist)  
  
    return minDist[0] 
  
# Driver Code 
if __name__ == '__main__': 
      
    # Let us create Binary Tree shown 
    # in above example  
    root = newNode(1)  
    root.left = newNode(12)  
    root.right = newNode(13)  
  
    root.right.left = newNode(14)  
    root.right.right = newNode(15)  
  
    root.right.left.left = newNode(21)  
    root.right.left.right = newNode(22)  
    root.right.right.left = newNode(23)  
    root.right.right.right = newNode(24)  
  
    root.right.left.left.left = newNode(1)  
    root.right.left.left.right = newNode(2)  
    root.right.left.right.left = newNode(3)  
    root.right.left.right.right = newNode(4)  
    root.right.right.left.left = newNode(5)  
    root.right.right.left.right = newNode(6)  
    root.right.right.right.left = newNode(7)  
    root.right.right.right.right = newNode(8)  
  
    x = root.right  
  
    print("The closest leaf to the node with value", 
           x.key, "is at a distance of",  
           minimumDistance(root, x)) 
  
# This code is contributed by PranchalK 

