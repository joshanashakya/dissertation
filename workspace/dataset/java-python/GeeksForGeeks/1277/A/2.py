

# Python3 implementation of the approach  
  
# Binary tree node consists of data, a  
# pointer to the left child and a  
# pointer to the right child  
class newNode : 
    def __init__(self,data) : 
        self.data = data;  
        self.left = None;  
        self.right = None;  
  
# Function to insert data in BST  
def insert(root, data) :  
  
    if (root == None) : 
        return newNode(data);  
          
    else : 
        if (data < root.data) :  
            root.left = insert(root.left, data);  
              
        if (data > root.data) : 
            root.right = insert(root.right, data);  
              
        return root;  
  
# InOrder function to display value of array  
# in sorted order  
def inOrder(root) : 
  
    if (root == None) : 
        return;  
          
    else : 
        inOrder(root.left);  
        print(root.data, end = " ");  
        inOrder(root.right);  
      
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 2, 5, 4, 4 ];  
  
    # Finding size of array arr[]  
    n = len(arr);  
  
    root = None;  
  
    for i in range(n) :  
  
        # Insert element of arr[] in BST  
        root = insert(root, arr[i]);  
  
    # Inorder Traversal to print nodes of Tree  
    inOrder(root);  
  
# This code is contributed by AnkitRai01 

