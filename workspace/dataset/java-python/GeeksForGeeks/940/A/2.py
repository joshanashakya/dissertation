

# Python3 implementation of the approach 
  
''' Link list node '''
class new_Node:  
          
    # Constructor to initialize the node object  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Function to return the intersection point 
# of the two linked lists head1 and head2 
def getIntesectionNode(head1, head2): 
      
    current1 = head1 
    current2 = head2 
      
    # If one of the head is None 
    if (not current1 or not current2 ): 
        return -1
          
    # Continue until we find intersection node 
    while (current1 and current2 and current1 != current2): 
        current1 = current1.next
        current2 = current2.next
          
        # If we get intersection node 
        if (current1 == current2): 
            return current1.data 
              
        # If one of them reaches end 
        if (not current1): 
            current1 = head2 
          
        if (not current2): 
            current2 = head1 
              
    return current1.data 
  
# Driver code 
'''  
    Create two linked lists  
  
    1st 3.6.9.15.30  
    2nd 10.15.30  
  
    15 is the intersection po 
'''
  
# Addition of newNodes 
head1 = new_Node(10) 
  
head2 = new_Node(3) 
  
newNode = new_Node(6) 
head2.next = newNode 
  
newNode = new_Node(9) 
head2.next.next = newNode 
  
newNode = new_Node(15) 
head1.next = newNode 
head2.next.next.next = newNode 
  
newNode = new_Node(30) 
head1.next.next = newNode 
  
head1.next.next.next = None
  
print(getIntesectionNode(head1, head2)) 
  
# This code is contributed by shubhamsingh10 

