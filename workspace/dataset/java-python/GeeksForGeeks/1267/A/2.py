

# Python3 program to check if the  
# given binary tree is perfect  
import sys 
import math 
  
# A binary tree node 
class Node: 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
  
# Utility function to allocate  
# memory for a new node  
def newNode(data): 
    return Node(data) 
  
# Function to check if the  
# given tree is perfect 
def CheckPerfectTree(root): 
    q = [] 
  
    # Push the root node 
    q.append(root) 
  
    # Flag to check if leaf nodes  
    # have been found  
    flag = 0
      
    while(q): 
        temp = q[0] 
        q.pop(0) 
  
        # If current node has both  
        # left and right child 
        if (temp.left and temp.right): 
              
            # If a leaf node has already been found  
            # then return false  
            if (flag == 1): 
                return False
  
            # If a leaf node has not been discovered yet  
            # push the left and right child in the queue  
            else: 
                q.append(temp.left) 
                q.append(temp.right) 
  
        # If a leaf node is found  
        # mark flag as one      
        elif(not temp.left and 
             not temp.right): 
            flag = 1
  
        # If the current node has only one child  
        # then return false  
        elif(not temp.left or 
             not temp.right): 
            return False
              
    # If the given tree is perfect 
    # return true 
    return True
  
# Driver Code 
if __name__=='__main__': 
    root = newNode(7) 
    root.left = newNode(5) 
    root.left.left = newNode(8) 
    root.left.right = newNode(1) 
    root.right = newNode(6) 
    root.right.left = newNode(3) 
    root.right.right = newNode(9) 
    root.right.right.left = newNode(10) 
    root.right.right.right = newNode(13) 
  
    if CheckPerfectTree(root): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed 
# by Vikash Kumar 37 

