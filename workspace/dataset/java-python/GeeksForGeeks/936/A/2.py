

# Python3 implementation to find the product of  
# nodes of the Linked List  
import math 
  
# A linked List node 
class Node: 
    def __init__(self,data): 
        self.data = data 
        self.next = None
  
# Function to insert a node at the  
# beginning of the linked list  
def push(head,data): 
    if not head: 
  
        # Return new node 
        return Node(data) 
      
    # allocate node  
    new_node = Node(data) 
      
    # link the old list to the new node  
    new_node.next = head 
      
    # move the head to point to the new node 
    head = new_node 
    return head 
  
# Function to find the product of  
# nodes of the given linked list  
def productOfNodes(head): 
      
    # Pointer to traverse the list  
    ptr = head 
    product = 1 # Variable to store product  
  
    # Traverse the list and  
    # calculate the product 
    while(ptr): 
        product *= ptr.data 
        ptr = ptr.next
          
    # Return the product      
    return product 
  
# Driver Code  
if __name__=='__main__': 
    head = None
  
    # create linked list 7->6->8->4->1 
    head = push(head,7) 
    head = push(head,6) 
    head = push(head,8) 
    head = push(head,4) 
    head = push(head,1) 
    print("Product = {}".format(productOfNodes(head))) 
  
# This Code is Contribute By Vikash Kumar 37 

