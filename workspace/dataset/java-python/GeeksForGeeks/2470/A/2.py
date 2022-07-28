

# Python3 program to exchange first and  
# last node in circular linked list 
import math 
  
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
def addToEmpty(head, data): 
  
    # This function is only for empty list 
    if (head != None): 
        return head 
  
    # Creating a node dynamically. 
    temp = Node(data) 
  
    # Assigning the data. 
    temp.data = data 
    head = temp 
  
    # Creating the link. 
    head.next = head 
    return head 
  
def addBegin(head, data): 
  
    if (head == None): 
        return addToEmpty(head, data) 
  
    temp = Node(data) 
    temp.data = data 
    temp.next = head.next
    head.next = temp 
  
    return head 
  
# function for traversing the list  
def traverse(head): 
  
    # If list is empty, return. 
    if (head == None): 
      
        print("List is empty.") 
        return
      
    # Pointing to first Node of the list. 
    p = head 
    print(p.data, end = " ") 
    p = p.next
      
    # Traversing the list. 
    while(p != head): 
      
        print(p.data, end = " ") 
        p = p.next
  
def exchangeNodes(head): 
   
    # Find pointer to previous of last node 
    p = head 
    while (p.next.next != head): 
       p = p.next
        
    # Exchange first and last nodes 
    # using head and p  
    p.next.next = head.next
    head.next = p.next
    p.next = head 
    head = head.next
    
    return head 
   
# Driver Code 
if __name__=='__main__':  
  
    head = None
    head = addToEmpty(head, 6) 
    for x in range(5, 0, -1): 
        head = addBegin(head, x) 
    print("List Before: ", end = "") 
    traverse(head) 
    print() 
      
    print("List After: ", end = "") 
    head = exchangeNodes(head) 
    traverse(head) 
  
# This code is contributed by Srathore 

