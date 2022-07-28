

# Python3 implementation to delete all 
# non-prime nodes from the singly 
# linked list 
import math  
  
# Node of the singly linked list 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# function to insert a node at the beginning 
# of the singly Linked List 
def push(head_ref, new_data): 
    new_node = Node(new_data) 
    new_node.data = new_data 
    new_node.next = head_ref 
    head_ref = new_node 
    return head_ref 
  
# Function to check if a number is prime 
def isPrime(n): 
      
    # Corner cases 
    if (n <= 1): 
        return False
    if (n <= 3): 
        return True
  
    # This is checked so that we can skip 
    # middle five numbers in below loop 
    if (n % 2 == 0 or n % 3 == 0): 
        return False
    for i in range(5, n + 1, 6): 
        if (i * i < n + 2 and 
           (n % i == 0 or n % (i + 2) == 0)): 
            return False
          
    return True
  
# function to delete all non-prime nodes 
# from the singly linked list 
def deleteNonPrimeNodes(head_ref): 
      
    # Remove all composite nodes at the beginning 
    ptr = head_ref 
    while (ptr != None and 
           isPrime(ptr.data)!= True): 
        temp = ptr 
        ptr = ptr.next
        # delete(temp) 
      
    head_ref = ptr 
    if (ptr == None): 
        return None
  
    # Remove remaining nodes 
    curr = ptr.next
    while (curr != None) : 
  
        if (isPrime(curr.data) != True): 
            ptr.next = curr.next
            #delete(curr) 
            curr = ptr.next
          
        else: 
            ptr = curr 
            curr = curr.next
          
        return head_ref      
  
# function to print nodes in a 
# given singly linked list 
def printList( head): 
    while (head != None) : 
        print(head.data, end = " ") 
        head = head.next
      
# Driver Code 
if __name__=='__main__':  
  
    # start with the empty list 
    head = None
  
    # create the linked list 
    # 15 -> 16 -> 7 -> 6 -> 17 
    head = push(head, 17) 
    head = push(head, 7) 
    head = push(head, 6) 
    head = push(head, 16) 
    head = push(head, 15) 
  
    print("Original List: ") 
    printList(head) 
  
    head = deleteNonPrimeNodes(head) 
  
    print("\nModified List: ") 
    printList(head) 
  
# This code is contributed by AbhiThakur 

