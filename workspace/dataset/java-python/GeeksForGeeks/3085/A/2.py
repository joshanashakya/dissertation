

"""Python3 program to find n-th node of  
Postorder Traversal of Binary Tree"""
  
# A Binary Tree Node  
# Utility function to create a new tree node  
class createNode:  
  
    # Constructor to create a newNode  
    def __init__(self, data):  
        self.data= data  
        self.left = None
        self.right = None
  
# function to find the N-th node  
# in the postorder traversal of 
# a given binary tree 
flag = [0] 
def NthPostordernode(root, N):  
  
    if (root == None): 
        return
  
    if (flag[0] <= N[0]): 
          
        # left recursion  
        NthPostordernode(root.left, N)  
  
        # right recursion  
        NthPostordernode(root.right, N)  
  
        flag[0] += 1
  
        # prints the n-th node of 
        # preorder traversal  
        if (flag[0] == N[0]): 
            print(root.data) 
                          
# Driver Code 
if __name__ == '__main__': 
    root = createNode(25)  
    root.left = createNode(20)  
    root.right = createNode(30)  
    root.left.left = createNode(18)  
    root.left.right = createNode(22)  
    root.right.left = createNode(24)  
    root.right.right = createNode(32)  
  
    N = [6]  
  
    # prints n-th node found  
    NthPostordernode(root, N) 
  
# This code is contributed by  
# SHUBHAMSINGH10 

