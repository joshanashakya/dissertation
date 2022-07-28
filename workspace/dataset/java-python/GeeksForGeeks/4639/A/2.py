

# Python3 Program to print doubly  
# linked list in reverse order  
import math 
  
# Doubly linked list node 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Function to print nodes of Doubly  
# Linked List in reverse order  
def reversePrint(head_ref): 
    tail = head_ref 
  
    # Traversing till tail of the linked list 
    while (tail.next != None): 
        tail = tail.next
  
    # Traversing linked list from tail 
    # and pring the node.data 
    while (tail != head_ref): 
        print(tail.data, end = " ") 
        tail = tail.prev 
      
    print(tail.data) 
  
# UTILITY FUNCTIONS  
# Function to insert a node at the  
# beginging of the Doubly Linked List  
def push(head_ref, new_data): 
      
    # allocate node  
    new_node = Node(new_data) 
  
    # put in the data  
    new_node.data = new_data 
  
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
  
# Driver Code 
if __name__=='__main__': 
      
    # Start with the empty list  
    head = None
  
    # Let us create a sorted linked list 
    # to test the functions  
    # Created linked list will be 10.8.4.2  
    head = push(head, 2)  
    head = push(head, 4)  
    head = push(head, 8)  
    head = push(head, 10) 
  
    print("Linked List elements in reverse order : ") 
  
    reversePrint(head) 
  
# This code is contributed by Srathore 

