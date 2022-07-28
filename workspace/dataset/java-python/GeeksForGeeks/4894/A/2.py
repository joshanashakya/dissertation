

# Python3 program to find if given array 
# exists as a subsequece in BST 
class Node:  
  
    # Constructor to create a new node  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
          
# A utility function to insert a  
# given key to BST  
def insert(root, key): 
    if root == None:  
        return Node(key)  
    if root.data > key:  
        root.left = insert(root.left, key)  
    else: 
        root.right = insert(root.right, key)  
    return root 
  
# function to check if given sorted  
# sub-sequence exist in BST index . 
# iterator for given sorted sub-sequence  
# seq[] . given sorted sub-sequence  
def seqExistUtil(ptr, seq, index): 
    if ptr == None:  
        return
  
    # We traverse left subtree  
    # first in Inorder  
    seqExistUtil(ptr.left, seq, index)  
  
    # If current node matches with se[index[0]]  
    # then move forward in sub-sequence  
    if ptr.data == seq[index[0]]:  
        index[0] += 1
  
    # We traverse left subtree in 
    # the end in Inorder  
    seqExistUtil(ptr.right, seq, index) 
  
# A wrapper over seqExistUtil. It returns  
# true if seq[0..n-1] exists in tree.  
def seqExist(root, seq, n): 
      
    # Initialize index in seq[]  
    index = [0] 
  
    # Do an inorder traversal and find if  
    # all elements of seq[] were present  
    seqExistUtil(root, seq, index) 
  
    # index would become n if all elements 
    # of seq[] were present  
    if index[0] == n: 
        return True
    else: 
        return False
  
# Driver Code 
if __name__ == '__main__': 
    root = None
    root = insert(root, 8) 
    root = insert(root, 10) 
    root = insert(root, 3) 
    root = insert(root, 6) 
    root = insert(root, 1) 
    root = insert(root, 4) 
    root = insert(root, 7) 
    root = insert(root, 14) 
    root = insert(root, 13) 
  
    seq = [4, 6, 8, 14]  
    n = len(seq) 
    if seqExist(root, seq, n): 
        print("Yes") 
    else: 
        print("No")  
  
# This code is contributed by PranchalK 

