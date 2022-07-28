

# Python implementation to find the product  
# of last 'n' nodes of the Linked List 
  
# Link list node  
class Node:  
      
    def __init__(self, data):  
        self.data = data  
        self.next = next
          
head = None
  
# function to insert a node at the 
# beginning of the linked list 
def push(head_ref, new_data): 
  
    global head  
      
    # allocate node  
    new_node = Node(0) 
  
    # put in the data  
    new_node.data = new_data 
  
    # link the old list to the new node  
    new_node.next = (head_ref) 
  
    # move the head to point to the new node  
    (head_ref) = new_node 
    head = head_ref 
  
# utility function to find the product  
# of last 'n' nodes 
def productOfLastN_NodesUtil(head, n): 
  
    # if n == 0 
    if (n <= 0): 
        return 0
  
    st = [] 
    prod = 1
  
    # traverses the list from left to right 
    while (head != None) : 
      
        # push the node's data 
        # onto the stack 'st' 
        st.append(head.data) 
  
        # move to next node 
        head = head.next
      
    # pop 'n' nodes from 'st' and 
    # add them 
    while (n > 0) : 
        n = n - 1
        prod *= st[-1] 
        st.pop() 
      
    # required product 
    return prod 
  
# Driver Code 
  
head = None
  
# create linked list 10->6->8->4->12 
push(head, 12) 
push(head, 4) 
push(head, 8) 
push(head, 6) 
push(head, 10) 
  
n = 2
print(productOfLastN_NodesUtil(head, n)) 
  
# This code is contributed by Arnab Kundu 

