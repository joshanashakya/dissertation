

# Python3 program to construct ancestor  
# matrix for given tree. 
  
class newnode: 
    def __init__(self, data): 
        self.data = data 
        self.left = self.right = None
          
# anc[] stores all ancestors of current node.  
# This function fills ancestors for all nodes.  
# It also returns size of tree. Size of tree   
# is used to print ancestor matrix.  
def ancestorMatrixRec(root, anc): 
    global mat, MAX
      
    # base case  
    if root == None: 
        return 0
  
    # Update all ancestors of current node  
    data = root.data 
    for i in range(len(anc)): 
        mat[anc[i]][data] = 1
  
    # Push data to list of ancestors  
    anc.append(data)  
  
    # Traverse left and right subtrees  
    l = ancestorMatrixRec(root.left, anc)  
    r = ancestorMatrixRec(root.right, anc)  
  
    # Remove data from list the list of ancestors  
    # as all descendants of it are processed now.  
    anc.pop(-1)  
  
    return l + r + 1
  
# This function mainly calls ancestorMatrixRec()  
def ancestorMatrix(root): 
      
    # Create an empty ancestor array  
    anc = [] 
  
    # Fill ancestor matrix and find  
    # size of tree.  
    n = ancestorMatrixRec(root, anc)  
  
    # Print the filled values 
    for i in range(n): 
        for j in range(n): 
            print(mat[i][j], end = " ")  
        print() 
  
# Driver Code 
MAX = 100
mat = [[0] * MAX for i in range(MAX)] 
  
# Construct the following binary tree  
#         5  
#         / \  
#     1     2  
#     / \ /  
#     0 4 3  
root = newnode(5)  
root.left = newnode(1)  
root.right = newnode(2)  
root.left.left = newnode(0)  
root.left.right = newnode(4)  
root.right.left = newnode(3)  
  
ancestorMatrix(root) 
  
# This code is contributed by PranchalK  

