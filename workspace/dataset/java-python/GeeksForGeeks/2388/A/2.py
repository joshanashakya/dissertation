

# Python3 program to find the sum of all nodes  
# of a Circular linked list  
import math 
  
# class for a node 
class Node: 
    def __init__(self,data): 
        self.data = data 
        self.next = None
  
# Function to insert a node at the beginning  
# of a Circular linked list  
def push(head, data): 
    if not head: 
        head = Node(data) 
        head.next = head 
        return head 
    lnode = head 
  
    # If linked list is not NULL then  
    # set the next of last node  
    while(lnode and lnode.next is not head): 
        lnode = lnode.next
    ptr1 = Node(data) # For the first node 
    ptr1.next = head 
    lnode.next = ptr1 
    head = ptr1 
    return head 
  
# Function to find sum of the given  
# Circular linked list      
def sumOfList(head): 
    temp = head 
    tsum = temp.data 
    temp = temp.next
    while(temp is not head): 
        tsum += temp.data 
        temp = temp.next
    return tsum 
  
# Driver code  
if __name__=='__main__': 
      
    # Initialize lists as empty 
    head = None
  
    # Created linked list will be 11->2->56->12  
    head = push(head, 12) 
    head = push(head, 56) 
    head = push(head, 2) 
    head = push(head, 11) 
    print("Sum of circular list is = {}" .  
                  format(sumOfList(head))) 
  
# This code is contributed by Vikash Kumar 37 

