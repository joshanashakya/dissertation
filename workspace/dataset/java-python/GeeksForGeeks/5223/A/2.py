

# Python3 program to find XOR of path between  
# any two nodes in a Binary Tree  
  
# Tree node 
class Node: 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
  
# Helper function that allocates a node with the  
# given data and None left and right pointers.  
def getNode(data): 
  
    newNode = Node(0)  
    newNode.data = data  
    newNode.left = newNode.right = None
    return newNode  
  
mp = dict() 
  
# Function to store XOR of path from  
# root to every node  
# mp[x] will store XOR of path from root to node x  
def storePath( root, XOR) : 
    global mp 
      
    # if root is None  
    # there is no path  
    if (root == None) : 
        return
  
    mp[root.data] = XOR ^ root.data;  
  
    XOR = XOR ^ root.data  
  
    if (root.left != None):  
        storePath(root.left, XOR)  
  
    if (root.right != None) : 
        storePath(root.right, XOR)  
  
# Function to get XOR of nodes between any two nodes  
def findXORPath( node1, node2) : 
    global mp 
    return mp.get(node1,0) ^ mp.get(node2,0)  
  
# Driver Code  
  
# binary tree formation  
root = getNode(0)  
root.left = getNode(1)  
root.left.left = getNode(3)  
root.left.left.left = getNode(7)  
root.left.right = getNode(4)  
root.left.right.left = getNode(8)  
root.left.right.right = getNode(9)  
root.right = getNode(2)  
root.right.left = getNode(5)  
root.right.right = getNode(6)  
  
XOR = 0
  
node1 = 3
node2 = 5
  
# Store XOR path from root to every node  
storePath(root, XOR)  
  
print( findXORPath( node1, node2))  
  
# This code is contributed by Arnab Kundu 

