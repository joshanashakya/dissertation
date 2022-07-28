

# Python Program to move last m elements 
# to front in a given linked list 
  
# A linked list node 
class Node : 
    def __init__(self): 
        self.data = 0
        self.next = None
          
first = None
last = None
  
length = 0
  
# Function to print nodes 
# in a given linked list 
def printList( node): 
  
    while (node != None) : 
        print( node.data, end=" ") 
        node = node.next
      
# Pointer head and p are being 
# used here because, the head 
# of the linked list is changed in this function. 
def moveToFront( head, p, m): 
      
    global first 
    global last 
    global length 
      
    # If the linked list is empty, 
    # or it contains only one node, 
    # then nothing needs to be done, simply return 
    if (head == None): 
        return head 
  
    p = head 
    head = head.next
    m= m + 1
  
    # if m value reaches length, 
    # the recursion will end 
    if (length == m) : 
      
        # breaking the link 
        p.next = None
  
        # connecting last to first & 
        # will make another node as head 
        last.next = first 
          
        # Making the first node of 
        # last m nodes as root 
        first = head 
      
    else: 
        moveToFront(head, p, m) 
          
# UTILITY FUNCTIONS 
  
# Function to add a node at 
# the beginning of Linked List 
def push( head_ref, new_data): 
      
    global first 
    global last 
    global length 
      
    # allocate node 
    new_node = Node() 
      
    # put in the data 
    new_node.data = new_data 
  
    # link the old list off the new node 
    new_node.next = (head_ref) 
  
    # move the head to point to the new node 
    (head_ref) = new_node 
      
    # making first & last nodes 
    if (length == 0): 
        last = head_ref 
    else: 
        first = head_ref 
  
    # increase the length 
    length= length + 1
      
    return head_ref 
  
# Driver code 
  
start = None
  
# The constructed linked list is: 
# 1.2.3.4.5 
start = push(start, 5) 
start = push(start, 4) 
start = push(start, 3) 
start = push(start, 2) 
start = push(start, 1) 
start = push(start, 0) 
  
print("\n Initial Linked list") 
printList(start) 
m = 4 # no.of nodes to change 
temp = None
moveToFront(start, temp, m) 
  
print("\n Final Linked list") 
start = first 
printList(start) 
  
# This code is contributed by Arnab Kundu 

