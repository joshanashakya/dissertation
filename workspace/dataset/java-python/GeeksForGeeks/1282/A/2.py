

# Python3 implementation of the approach 
class GFG: 
      
    # Class for the node of the tree 
    class Node: 
        def __init__(self,n,data): 
            # List of children 
            self.children = [None]*n 
            self.data = data 
      
    # Function to print the inorder traversal  
    # of the n-ary tree  
    def inorder(self, node): 
        if node == None: 
            return
          
        # Total children count  
        total = len(node.children) 
          
        # All the children except the last 
        for i in range(total-1): 
            self.inorder(node.children[i]) 
          
        # Print the current node's data 
        print(node.data,end=" ") 
          
        # Last child  
        self.inorder(node.children[total-1]) 
      
    # Driver code 
    def main(self): 
        # Create the following tree   
        #          1  
        #       /  |  \  
        #      2   3   4  
        #    / | \  
        #   5  6  7 
          
        n = 3
        root = self.Node(n, 1) 
        root.children[0] = self.Node(n, 2) 
        root.children[1] = self.Node(n, 3) 
        root.children[2] = self.Node(n, 4) 
        root.children[0].children[0] = self.Node(n, 5) 
        root.children[0].children[1] = self.Node(n, 6)  
        root.children[0].children[2] = self.Node(n, 7) 
          
        self.inorder(root) 
          
ob = GFG() # Create class object 
ob.main() # Call main function 
  
# This code is contributed by Shivam Singh 

