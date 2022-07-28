

# Python3 program to print reverse of linked list 
# using stack. 
  
# Node of a linked list  
class Node:  
    def __init__(self, next = None, data = None):  
        self.next = next
        self.data = data  
  
# Given a reference (pointer to pointer) to the head 
# of a list and an int, push a new node on the front 
# of the list.  
def push( head_ref, new_data): 
  
    new_node = Node() 
    new_node.data = new_data 
    new_node.next = (head_ref) 
    (head_ref) = new_node 
    return head_ref 
  
# Counts no. of nodes in linked list  
def getCount( head): 
  
    count = 0 # Initialize count 
    current = head # Initialize current 
    while (current != None): 
      
        count = count + 1
        current = current.next
      
    return count 
  
# Takes head pointer of the linked list and index 
# as arguments and return data at index 
def getNth( head, n): 
  
    curr = head 
    i = 0
    while( i < n - 1 and curr != None ): 
        curr = curr.next
        i = i + 1
    return curr.data 
  
def printReverse(head): 
  
    # store Node addresses in stack 
    stk = [] 
    ptr = head 
    while (ptr != None):  
      
        stk.append(ptr) 
        ptr = ptr.next
      
    # print data from stack 
    while (len(stk) > 0): 
      
        print( stk[-1].data, end = " ") 
        stk.pop() # pop after print 
      
    print( " ") 
  
# Driver code 
  
# Start with the empty list  
head = None
  
# Use push() to con below list 
# 1.2.3.4.5  
head = push(head, 5) 
head = push(head, 4) 
head = push(head, 3) 
head = push(head, 2) 
head = push(head, 1) 
  
printReverse(head) 
  
# This code is Contributed by Arnab Kundu 

