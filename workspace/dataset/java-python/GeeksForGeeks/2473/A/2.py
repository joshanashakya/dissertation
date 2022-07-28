

# Python3 program to delete all prime 
# node from a Circular singly linked list 
import math  
  
# Structure for a node 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Function to insert a node at the  
# beginning of a Circular linked list 
def push(head_ref, data): 
    ptr1 = Node(data) 
    temp = head_ref 
    ptr1.data = data 
    ptr1.next = head_ref 
  
    # If linked list is not None then 
    # set the next of last node 
    if (head_ref != None) : 
        while (temp.next != head_ref): 
            temp = temp.next
        temp.next = ptr1 
      
    else: 
        ptr1.next = ptr1 # For the first node 
  
    head_ref = ptr1 
    return head_ref 
  
# Delete the node if it is prime 
def deleteNode(head_ref, delete): 
    temp = head_ref 
      
    # If node to be deleted is head node 
    if (head_ref == delete): 
        head_ref = delete.next
  
    # traverse list till not found 
    # delete node 
    while (temp.next != delete): 
        temp = temp.next
      
    # copy address of node 
    temp.next = delete.next
  
    # Finally, free the memory 
    # occupied by delete 
    # free(delete) 
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
               (n % i == 0 or 
                n % (i + 2) == 0)): 
            return False
  
    return True
  
# Function to delete all prime nodes 
# from the singly circular linked list 
def deletePrimeNodes( head): 
    ptr = head 
  
    #next 
  
    # traverse list till the endl 
    # if node is prime then delete it 
    # if (isPrime(ptr.data)!=True): 
    # deleteNode(head, ptr) 
  
    # point to next node 
    next = ptr.next
    ptr = next
    while (ptr != head): 
          
        # if node is prime 
        if (isPrime(ptr.data) == True): 
            deleteNode(head, ptr) 
  
        # point to next node 
        next = ptr.next
        ptr = next
  
    return head  
  
# Function to print nodes in a 
# given singly linked list 
def printList(head): 
    temp = head 
    if (head != None) : 
        print(temp.data, end = " ") 
        temp = temp.next
        while (temp != head): 
            print(temp.data, end = " ") 
            temp = temp.next
      
# Driver code 
if __name__=='__main__':  
  
    # Initialize lists as empty 
    head = None
  
    # Created linked list will be 
    # 9.11.32.6.13.20 
    head = push(head, 20) 
    head = push(head, 13) 
    head = push(head, 6) 
    head = push(head, 32) 
    head = push(head, 11) 
    head = push(head, 9) 
  
    print("Given List : ", end = "") 
    printList(head) 
  
    print( "\nList After deleting",  
           "prime nodes : ", end = "") 
    head = deletePrimeNodes(head) 
    printList(head) 
  
# This code is contributed by Srathore 

