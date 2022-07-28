

# Python3 program to delete all even 
# node from a Circular singly linked list 
import math 
  
# Structure for a node 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Function to insert a node at the beginning 
# of a Circular linked list 
def push(head_ref, data): 
    ptr1 = Node(data) 
    temp = head_ref 
    ptr1.data = data 
    ptr1.next = head_ref 
  
    # If linked list is not None then 
    # set the next of last node 
    if (head_ref != None): 
        while (temp.next != head_ref): 
            temp = temp.next
        temp.next = ptr1 
          
    else: 
        ptr1.next = ptr1 # For the first node 
  
    head_ref = ptr1 
    return head_ref 
  
# Delete the node if it is even 
def deleteNode(head_ref, delete): 
    temp = head_ref 
      
    # If node to be deleted is head node 
    if (head_ref == delete): 
        head_ref = delete.next
  
    # traverse list till not found 
    # delete node 
    while (temp.next != delete): 
        temp = temp.next
      
    # copy address of node 
    temp.next = delete.next
      
    # Finally, free the memory occupied by delete 
  
# Function to delete all even nodes 
# from the singly circular linked list 
def deleteEvenNodes(head): 
    ptr = head 
    next = None
  
    # traverse list till the end 
    # if the node is even then delete it 
    # if node is even 
    next = ptr.next
    ptr = next
    while (ptr != head): 
        if (ptr.data % 2 == 0): 
            deleteNode(head, ptr) 
  
        # po to next node 
        next = ptr.next
        ptr = next
    return head 
  
# Function to pr nodes 
def prList(head): 
    temp = head 
    if (head != None): 
        print(temp.data, end = " ") 
        temp = temp.next
        while (temp != head): 
            print(temp.data, end = " ") 
            temp = temp.next
          
# Driver code 
if __name__=='__main__':  
      
    # Initialize lists as empty 
    head = None
  
    # Created linked list will be 57.11.2.56.12.61 
    head = push(head, 61)  
    head = push(head, 12) 
    head = push(head, 56)  
    head = push(head, 2)  
    head = push(head, 11)  
    head = push(head, 57) 
  
    print("List after deletion : ", end = "") 
    head = deleteEvenNodes(head) 
    prList(head) 
      
# This code is contributed by Srathore 

