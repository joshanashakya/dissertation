

# Python3 implementation of the approach  
  
# Structure to hold the contents  
# of the new node  
class add:  
      
    # Constructor to create a new node  
    def __init__(self, data):  
        self.data = data  
        self.left = self.right = None
  
root1 = None
  
# Function to add a node to the  
# Binary Tree in the level order  
def addinBT(data): 
    global root1 
      
    # If it is the first node  
    # to be added then make  
    # it the root node  
    if (root1 == None): 
        root1 = add(data)  
    else:  
        Q = [root1] 
        while (len(Q)): 
              
            # Get and remove the front  
            temp = Q[0] 
            Q.pop(0)  
              
            # If the left child of the current  
            # node is None then create the new  
            # node here and break  
            if (temp.left == None): 
                temp.left = add(data)  
                break
            else: 
                Q.append(temp.left)  
                  
            # If the right child of the current  
            # node is None then create the new  
            # node here and break  
            if (temp.right == None): 
                temp.right = add(data)  
                break
            else: 
                Q.append(temp.right)  
                  
# Function to add a node to  
# the Binary Search tree  
def addinBST( root, data): 
      
    # If the current node is None  
    # then create a new node here  
    # with the given data  
    if (root == None): 
        root = add(data)  
          
    # If the data is smaller than the  
    # current node's data then recur  
    # for the left sub-tree  
    elif (data < root.data): 
        root.left = addinBST(root.left, data)  
          
    # Else recur for the right sub-tree  
    else: 
        root.right = addinBST(root.right, data)  
    return root  
      
# Function to perform a level order  
# insertion in the Binary Tree from  
# the given Binary Search tree  
def addinorder( root): 
    if (root == None): 
        return
    addinorder(root.left)  
    addinBT(root.data)  
    addinorder(root.right)  
      
# Function to print the level order  
# traversal of the binary tree  
def printlvl(): 
  
    Q = [] 
      
    # Push root to the  
    Q.append(root1)  
    while (len(Q)): 
          
        # Get the front  
        temp = Q[0] 
          
        # Remove the front  
        Q.pop(0)  
          
        # Print the data  
        print(temp.data ,end=" ") 
          
        # Push the left child  
        if (temp.left != None): 
            Q.append(temp.left)  
          
        # Push the right child  
        if (temp.right != None): 
            Q.append(temp.right)  
  
# Driver code  
  
# Create the Binary Search Tree  
root = add(1)  
root = addinBST(root, 2)  
root = addinBST(root, 3)  
root = addinBST(root, 4)  
root = addinBST(root, 5)  
  
# Add nodes of the Binary Search  
# Tree to the Binary Tree  
addinorder(root)  
  
# Print the level order traversal  
# of the Binary Tree  
printlvl()  
  
# This code is contributed by SHUBHAMSINGH10  

