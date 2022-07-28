

# Python3 implementation of the approach 
  
# A linked list node 
class Node: 
    def __init__(self, data = 0): 
        self.data = data 
        self.next = None
  
# A binary tree node 
class treeNode: 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
      
# Function to print the linked list 
def print_(head): 
  
    if (head == None):  
        return
  
    temp = head 
    while (temp != None): 
        print ( temp.data, end = " " ) 
        temp = temp.next
      
# Function to create Linked list from given binary tree 
def sortedList( head, root): 
  
    # return head if root is None 
    if (root == None) : 
      
        return head 
  
    # First make the sorted linked list 
    # of the left sub-tree 
    head = sortedList(head, root.left) 
    newNode = Node(root.data) 
    temp = head 
    prev = None
  
    # If linked list is empty add the 
    # node to the head 
    if (temp == None) : 
        head = newNode 
      
    else: 
  
        # Find the correct position of the node 
        # in the given linked list 
        while (temp != None): 
          
            if (temp.data > root.data) : 
                break
              
            else: 
                prev = temp 
                temp = temp.next
  
        # Given node is to be attached 
        # at the end of the list 
        if (temp == None): 
            prev.next = newNode 
          
        else: 
              
            # Given node is to be attached 
            # at the head of the list 
            if (prev == None) : 
                newNode.next = temp 
                head = newNode 
              
            else: 
  
                # Insertion in between the list 
                newNode.next = temp 
                prev.next = newNode 
              
    # Now add the nodes of the right sub-tree 
    # to the sorted linked list 
    head = sortedList(head, root.right) 
    return head 
  
# Driver code 
  
# Tree: 
# 10 
# / \ 
# 15 2 
# / \ 
#1 5 
  
root = treeNode(10) 
root.left = treeNode(15) 
root.right = treeNode(2) 
root.left.left = treeNode(1) 
root.left.right = treeNode(5) 
  
head = sortedList(None, root) 
  
print_(head) 
  
# This code is contributed by Arnab Kundu 

