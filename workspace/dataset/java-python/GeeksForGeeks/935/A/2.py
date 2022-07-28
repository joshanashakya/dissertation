

# Python3 implementation to find the  
# sum of nodes of the Linked List 
import math  
  
# A Linked list node  
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# function to insert a node at the 
# beginning of the linked list 
def push(head_ref, new_data): 
      
    # allocate node  
    new_node = Node(new_data) 
  
    # put in the data  
    new_node.data = new_data 
  
    # link the old list to the new node  
    new_node.next = head_ref 
  
    # move the head to po to the new node  
    head_ref = new_node 
    return head_ref 
  
# function to find the sum of 
# nodes of the given linked list 
def sumOfNodes(head): 
    ptr = head 
    sum = 0
    while (ptr != None): 
  
        sum = sum + ptr.data 
        ptr = ptr.next
      
    return sum
  
# Driver Code 
if __name__=='__main__': 
    head = None
  
    # create linked list 7.6.8.4.1 
    head = push(head, 7) 
    head = push(head, 6) 
    head = push(head, 8) 
    head = push(head, 4) 
    head = push(head, 1) 
  
    print("Sum of nodes =",  
           sumOfNodes(head)) 
      
# This code is contributed by Srathore 

