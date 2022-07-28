

# Python3 implementation to reverse 
# a doubly linked list 
import math 
  
# a node of the doubly linked list 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# function to get a new node 
def getNode(data): 
      
    # allocate space 
    new_node = Node(data) 
  
    # put in the data 
    new_node.data = data 
    new_node.next = None
    new_node.prev = None
    return new_node 
  
# function to insert a node at the beginging 
# of the Doubly Linked List 
def push(head_ref, new_node): 
      
    # since we are adding at the beginning, 
    # prev is always None 
    new_node.prev = None
  
    # link the old list off the new node 
    new_node.next = head_ref 
  
    # change prev of head node to new node 
    if (head_ref != None): 
        head_ref.prev = new_node 
  
    # move the head to po to the new node 
    head_ref = new_node 
    return head_ref 
  
# function to reverse a doubly linked list 
def reverseList(head_ref): 
      
    # if list is empty or it contains 
    # a single node only 
    if (head_ref == None or 
       (head_ref).next == None): 
        return None
  
    new_head = None
    curr = head_ref 
  
    while (curr != None): 
  
        # get poer to next node 
        next = curr.next
  
        # push 'curr' node at the beginning of the 
        # list with starting with 'new_head' 
        new_head = push(new_head, curr) 
  
        # update 'curr' 
        curr = next
      
    # update 'head_ref' 
    head_ref = new_head 
  
    return head_ref 
  
# Function to pr nodes in a 
# given doubly linked list 
def prList(head): 
    while (head != None) : 
        print(head.data, end = " ") 
        head = head.next
  
# Driver Code 
if __name__=='__main__': 
      
    # Start with the empty list 
    head = None
  
    # Create doubly linked: 10<.8<.4<.2 */ 
    head = push(head, getNode(2));  
    head = push(head, getNode(4));  
    head = push(head, getNode(8));  
    head = push(head, getNode(10)); 
  
    print("Original list: ", end = "") 
    prList(head) 
  
    # Reverse doubly linked list 
    head = reverseList(head) 
  
    print("\nReversed list: ", end = "") 
    prList(head) 
  
# This code is contributed by Srathore 

