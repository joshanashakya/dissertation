

# Python3 program to delete every kth Node from 
# circular linked list. 
import math 
  
# structure for a Node  
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Utility function to print the circular linked list 
def prList(head): 
    if (head == None): 
        return
    temp = head 
      
    print(temp.data, end = "->") 
    temp = temp.next
    while (temp != head): 
        print(temp.data, end = "->") 
        temp = temp.next
    print(head.data) 
  
# Function to delete every kth Node 
def deleteK(head_ref, k): 
    head = head_ref 
  
    # If list is empty, simply return. 
    if (head == None): 
        return
  
    # take two poers - current and previous 
    curr = head 
    prev = None
    while True: 
  
        # Check if Node is the only Node\ 
        # If yes, we reached the goal, therefore  
        # return. 
        if (curr.next == head and curr == head): 
            break
  
        # Pr intermediate list. 
        prList(head) 
  
        # If more than one Node present in the list, 
        # Make previous pointer po to current 
        # Iterate current pointer k times, 
        # i.e. current Node is to be deleted. 
        for i in range(k): 
            prev = curr 
            curr = curr.next
  
        # If Node to be deleted is head 
        if (curr == head): 
            prev = head 
            while (prev.next != head): 
                prev = prev.next
            head = curr.next
            prev.next = head 
            head_ref = head 
  
        # If Node to be deleted is last Node. 
        elif (curr.next == head) : 
            prev.next = head 
              
        else : 
            prev.next = curr.next
  
# Function to insert a Node at the end of  
#a Circular linked list  
def insertNode(head_ref, x): 
      
    # Create a new Node 
    head = head_ref 
    temp = Node(x) 
  
    # if the list is empty, make the new Node head 
    # Also, it will po to itself. 
    if (head == None): 
        temp.next = temp 
        head_ref = temp 
        return head_ref 
      
    # traverse the list to reach the last Node  
    # and insert the Node 
    else : 
        temp1 = head 
        while (temp1.next != head): 
            temp1 = temp1.next
        temp1.next = temp 
        temp.next = head 
    return head 
  
# Driver Code 
if __name__=='__main__': 
      
    # insert Nodes in the circular linked list 
    head = None
    head = insertNode(head, 1)  
    head = insertNode(head, 2)  
    head = insertNode(head, 3)  
    head = insertNode(head, 4)  
    head = insertNode(head, 5)  
    head = insertNode(head, 6)  
    head = insertNode(head, 7)  
    head = insertNode(head, 8)  
    head = insertNode(head, 9)  
  
    k = 4
  
    # Delete every kth Node from the 
    # circular linked list. 
    deleteK(head, k) 
  
# This code is contributed by Srathore 

