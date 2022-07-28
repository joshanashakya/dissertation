

# Python3 Program to Find the Unique elements in  
# linked lists  
import sys 
import math 
  
# Linked list node  
class Node: 
    def __init__(self,data): 
        self.data = data 
        self.next = None
  
# Function to insert a node at the beginning of  
# the linked list  
def push(head,data): 
    if not head: 
        return Node(data) 
    temp = Node(data) 
    temp.next = head 
    head = temp 
    return head 
  
# function to Find the unique elements in linked lists  
def uniqueElements(head): 
  
    # Initialize hash array that store the  
    # frequency of each element of list 
    _map = {} 
    temp = head 
    while(temp): 
        d = temp.data 
        if d in _map: 
            _map[d]=_map.get(d)+1
        else: 
            _map[d] = 1
        temp = temp.next
    count = 0
    for i in _map: 
  
        # Check whether the frequency of current  
        # element is 1 or not  
        if _map.get(i) == 1: 
            count += 1
            print("{} ".format(i),end="") 
      
    # If No unique element in list  
    if count == 0: 
        print("No Unique Elements") 
  
# Driver program to test above 
if __name__=='__main__': 
  
    # creating linked list 
    head = None
    head = push(head,5) 
    head = push(head,4) 
    head = push(head,3) 
    head = push(head,5) 
    head = push(head,3) 
    head = push(head,2) 
    head = push(head,4) 
    head = push(head,4) 
    head = push(head,1) 
    uniqueElements(head) 
  
# This code is Contributed by Vikash Kumar 37 

