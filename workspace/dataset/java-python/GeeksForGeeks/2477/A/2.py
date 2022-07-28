

# Python3 program to Append odd position nodes 
# in reverse at the end of even 
# positioned nodes in a Linked List 
import math 
  
# Linked List Node 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# A utility function to create a new node 
def newNode(key): 
    temp = Node(key) 
    temp.data = key 
    temp.next = None
    return temp 
  
# Rearranges given linked list such that  
# all even positioned nodes are before  
# odd positioned in a reverse 
def rearrangeEvenOdd(head): 
      
    # Corner case 
    if (head == None): 
        return None
  
    # Initialize first nodes of even and 
    # odd lists 
    odd = head 
    even = head.next
  
    # Remember the first node of even list so 
    # that we can connect the even list at the 
    # end of odd list. 
    evenFirst = even 
  
    while True: 
  
        # If there are no more nodes, 
        # then connect first node of 
        # even list to the last node 
        # of odd list 
        if (odd == None or even == None or 
                    (even.next) == None): 
            break
      
        # Connecting odd nodes 
        odd.next = even.next
        odd = even.next
  
        # If there are NO more even nodes after 
        # current odd. 
        if (odd.next == None): 
            even.next = None
            break
          
        # Connecting evenevenFirs nodes 
        even.next = odd.next
        even = odd.next
      
    # Reversal of even linked list 
    current = evenFirst 
    prev = None
    front = None
  
    # Iterate in the complete linked list 
    while (current != None): 
        front = current.next
        current.next = prev 
        prev = current 
        current = front 
      
    evenFirst = prev 
  
    # Attach the reversed even linked 
    # list to odd linked list 
    odd.next = evenFirst 
    return head 
  
# A utility function to print a linked list 
def printlist(node): 
    while (node != None) : 
        print(node.data, end = "->") 
        node = node.next
      
    print("NULL") 
  
# Driver code 
if __name__=='__main__':  
    head = newNode(1) 
    head.next = newNode(2) 
    head.next.next = newNode(3) 
    head.next.next.next = newNode(4) 
    head.next.next.next.next = newNode(5) 
    head.next.next.next.next.next = newNode(6) 
  
    head = rearrangeEvenOdd(head) 
  
    printlist(head) 
  
# This code is contributed by Srathore 

