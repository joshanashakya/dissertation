

# Python3 implementation of the algorithm 
# A binary tree node has data,  
# pointer to left child and a pointer 
# to right child  
  
# Class Node has data and references  
# to the left and the right child. 
class Node: 
    def __init__(self, data = 0): 
        self.data = data 
        self.left = None
        self.right = None
      
# Function that creates the tree 
def constructTreeUtil(post , n): 
  
    # Last node is root 
    root = Node(post[n - 1]) 
    s = [] 
    s.append(root) 
    i = n - 2
  
    # Traverse from second last node 
    while ( i >= 0): 
        x = Node(post[i]) 
  
        # Keep popping nodes while top()  
        # of stack is greater. 
        temp = None
        while (len(s) > 0 and post[i] < s[-1].data) : 
            temp = s[-1] 
            s.pop()      
  
        # Make x as left child of temp  
        if (temp != None):  
            temp.left = x      
  
        # Else make x as right of top      
        else: 
            s[-1].right = x 
        s.append(x) 
        i = i - 1
      
    return root 
  
# Function that calls the method 
# which contructs the tree 
def constructTree( post, size): 
    return constructTreeUtil(post, size) 
  
# A utility function to print  
# inorder traversal of a Binary Tree 
def printInorder( node): 
    if (node == None): 
        return
    printInorder(node.left) 
    print( node.data, end = " ") 
    printInorder(node.right) 
  
# Driver Code 
post = [1, 7, 5, 50, 40, 10]  
size = len(post) 
  
root = constructTree(post, size) 
  
print( "Inorder traversal of the constructed tree:") 
printInorder(root) 
  
# This code is contributed by Arnab Kundu 

