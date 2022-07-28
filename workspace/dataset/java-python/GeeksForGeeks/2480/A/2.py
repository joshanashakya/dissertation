

# Python implementation to find the product of 
# last 'n' Nodes of the Linked List 
  
n, prod = 0, 0; 
  
''' A Linked list Node '''
  
class Node: 
  
    def __init__(self, data): 
        self.data = data 
        self.next = next
  
# function to insert a Node at the 
# beginning of the linked list 
def push(head_ref, new_data): 
      
    ''' allocate Node '''
    new_Node = Node(0); 
  
    ''' put in the data '''
    new_Node.data = new_data; 
  
    ''' link the old list to the new Node '''
    new_Node.next = head_ref; 
  
    ''' move the head to poto the new Node '''
    head_ref = new_Node; 
    return head_ref; 
  
# Function to recursively find the product of last 
# 'n' Nodes of the given linked list 
def productOfLastN_Nodes(head): 
    global n, prod; 
      
    # if head = None 
    if (head == None): 
        return; 
  
    # recursively traverse the remaining Nodes 
    productOfLastN_Nodes(head.next); 
  
    # if Node count 'n' is greater than 0 
    if (n > 0): 
          
        # accumulate sum 
        prod = prod * head.data; 
  
        # reduce Node count 'n' by 1 
        n -= 1; 
  
# utility function to find the product of last 'n' Nodes 
def productOfLastN_NodesUtil(head): 
    global n,prod; 
      
    # if n == 0 
    if (n <= 0): 
        return 0; 
  
    prod = 1; 
  
    # find the sum of last 'n' Nodes 
    productOfLastN_Nodes(head); 
      
    # required product 
    return prod; 
  
# Driver program to test above 
if __name__ == '__main__': 
    head = None; 
    n = 2; 
      
    # create linked list 10->6->8->4->12 
    head = push(head, 12); 
    head = push(head, 4); 
    head = push(head, 8); 
    head = push(head, 6); 
    head = push(head, 10); 
  
    print(productOfLastN_NodesUtil(head)); 
  
# This code is contributed by 29AjayKumar 

