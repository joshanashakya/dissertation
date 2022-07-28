

# Python3 program to check  
# children sum property  
  
# A binary tree node  
class Node:  
      
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
  
# Function to check if the tree holds  
# children sum property  
def CheckChildrenSum(root):  
  
    q = []  
      
    # Push the root node  
    q.append(root)  
  
    while len(q) != 0: 
        temp = q.pop()  
  
        # If the current node has both  
        # left and right children  
        if temp.left and temp.right:  
              
            # If the current node is not equal  
            # to the sum of its left and right 
            # children, return false  
            if (temp.data != temp.left.data + 
                             temp.right.data):  
                return False
  
            q.append(temp.left)  
            q.append(temp.right)  
          
        # If the current node has right child  
        elif not temp.left and temp.right:  
              
            # If the current node is not equal  
            # to its right child return false  
            if temp.data != temp.right.data:  
                return False
  
            q.append(temp.right)  
          
        # If the current node has left child  
        elif not temp.right and temp.left:  
              
            # If the current node is not equal  
            # to its left child return false  
            if temp.data != temp.left.data:  
                return False
  
            q.append(temp.left)  
  
    # If the given tree has children  
    # sum property return true  
    return True
  
# Driver code  
if __name__ == "__main__":  
  
    root = Node(10)  
    root.left = Node(8)  
    root.right = Node(2)  
    root.left.left = Node(3)  
    root.left.right = Node(5)  
    root.right.right = Node(2)  
  
    if CheckChildrenSum(root):  
        print("Yes")  
    else: 
        print("No") 
  
# This code is contributed  
# by Rituraj Jain 

