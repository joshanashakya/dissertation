

# Python implementation of the above approach 
  
# A binary tree node 
class Node: 
    def __init__(self): 
        self.data = 0
        self.left = None
        self.right = None
  
# A utility function to allocate a new node 
def newNode(data): 
  
    newNode = Node() 
    newNode.data = data 
    newNode.left = newNode.right = None
    return (newNode) 
  
res = 0
  
# This function updates overall count of 1 in 'res' 
# And returns count 1s going through root. 
def countUntil( root): 
    global res 
      
    # Base Case 
    if (root == None): 
        return 0
  
    # l and r store count of 1s going through left and 
    # right child of root respectively 
    l = countUntil(root.left) 
    r = countUntil(root.right) 
  
    # maxCount represents the count of 1s when the Node under 
    # consideration is the root of the maxCount path and no 
    # ancestors of the root are there in maxCount path 
    maxCount = 0
  
    # if the value at node is 1 then its 
    # count will be considered 
    # including the leftCount and the rightCount 
    if (root.data == 1): 
        maxCount = l + r + 1
    else: 
        maxCount = l + r 
  
    # Store the Maximum Result. 
    res = max(res, maxCount) 
  
    # return max count in a single path. 
    # This path must include at-most one child 
    # of the root as well as itself 
  
    # if the value at node is 1 
    # then its count will be considered 
    # including the maximum of leftCount or the rightCount 
    if (root.data == 1): 
        return max(l, r) + 1
    else: 
        return max(l, r) 
  
# Returns maximum count of 1 in any path 
# in tree with given root 
def findMaxCount(root): 
      
    global res 
  
    # Initialize result 
    res = -999999
  
    # Compute and return result 
    countUntil(root) 
    return res 
  
# Driver program 
  
root = newNode(1) 
root.left = newNode(0) 
root.right = newNode(1) 
root.left.left = newNode(1) 
root.left.right = newNode(1) 
root.left.right.left = newNode(1) 
root.left.right.right = newNode(0) 
print(findMaxCount(root)) 
  
# This code is contributed by Arnab Kundu 

