

# Python code for above algorithm 
  
# Link list node  
class node:  
      
    def __init__(self, data):  
        self.data = data  
        self.next = next
          
# function to insert a node at the 
# beginning of the linked list 
def push(head_ref, new_data): 
  
    # allocate node  
    new_node = node(0) 
  
    # put in the data  
    new_node.data = new_data 
  
    # link the old list to the new node  
    new_node.next = (head_ref) 
  
    # move the head to point to the new node  
    (head_ref) = new_node 
      
    return head_ref 
      
""" Alternatively reverses the given linked list  
in groups of given size k. """
def kAltReverse(head, k) : 
  
    return _kAltReverse(head, k, True)  
  
""" Helper function for kAltReverse().  
It reverses k nodes of the list only if  
the third parameter b is passed as True,  
otherwise moves the pointer k nodes ahead 
and recursively calls iteself """
def _kAltReverse(Node, k, b) : 
  
    if(Node == None) : 
        return None
      
    count = 1
    prev = None
    current = Node  
    next = None
      
    """ The loop serves two purposes  
        1) If b is True,  
        then it reverses the k nodes  
        2) If b is false,  
        then it moves the current pointer """
    while(current != None and count <= k) : 
      
        next = current.next
      
        """ Reverse the nodes only if b is True"""
        if(b == True) : 
            current.next = prev  
                  
        prev = current  
        current = next
        count = count + 1
      
          
    """ 3) If b is True, then node is the kth node.  
        So attach rest of the list after node.  
        4) After attaching, return the new head """
    if(b == True) : 
      
        Node.next = _kAltReverse(current, k, not b)  
        return prev          
      
    else : 
        """ If b is not True, then attach  
        rest of the list after prev.  
        So attach rest of the list after prev """
        prev.next = _kAltReverse(current, k, not b)  
        return Node      
      
""" Function to print linked list """
def printList(node) : 
  
    count = 0
    while(node != None) : 
      
        print( node.data, end = " ")  
        node = node.next
        count = count + 1
  
# Driver Code 
  
""" Start with the empty list """
head = None
i = 20
  
# create a list 1->2->3->4->5...... ->20  
while(i > 0 ):  
    head = push(head, i)  
    i = i - 1
  
print( "Given linked list ")  
printList(head)  
head = kAltReverse(head, 3)  
  
print( "\nModified Linked list ")  
printList(head)  
  
# This code is contributed by Arnab Kundu 

