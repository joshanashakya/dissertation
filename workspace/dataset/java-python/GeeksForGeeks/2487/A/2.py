

# Python3 implementation of the approach 
import math  
  
# Structure for the node 
# of the linked list 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Utility function to add a new 
# node to the linked list 
def add(data): 
    newnode = Node(data) 
  
    # Assign the data to the data part 
    # and assign None to the address part 
    newnode.data = data 
    newnode.next = None
    return newnode 
  
# Function to print the linked list 
def printlist(head): 
    while (head != None) : 
        print(head.data, end = " -> ") 
        head = head.next
      
    print("None") 
  
# Function that returns true if 
# ch is a special character 
def isSpecialChar(ch): 
  
    # If lower-case character 
    if (ch >= 'a' and ch <= 'z'): 
        return False
  
    # If upper-case character 
    if (ch >= 'A' and ch <= 'Z'): 
        return False
  
    # If digit 
    if (ch >= '0' and ch <= '9'): 
        return False
  
    # ch is a special character 
    return True
  
# Function to remove the special 
# characters from the linked list 
def removeFromLL(head): 
  
    # Declare two variables curr and 
    # prev both pointing to head 
    curr = head 
    prev = head 
  
    # The following loop removes special 
    # characters from the head of the linked list 
    # In case the special character is present at 
    # the head of the linked list, make head point 
    # to the next valid character 
    while (curr != None and 
           isSpecialChar(curr.data)): 
        temp = curr 
        head = curr.next
        curr = curr.next
        temp = None
      
    # Make prev point to head 
    prev = head 
  
    # Repeat the process for 
    # the entire Linked list 
    while (curr != None): 
  
        # Repeat the process for all the elements 
        # of linked list, in case a special character 
        # is encountered then make the previous valid 
        # character point to the next valid character 
        # and remove the current node from the linked list 
        while (curr != None and 
               isSpecialChar(curr.data)): 
            temp = curr 
            prev.next = curr.next
            curr = curr.next
            temp = None
          
        # If the end is reached 
        if (curr == None): 
            break
        prev = curr 
        curr = curr.next
      
    return head 
  
# Driver code 
if __name__=='__main__': 
  
    # Create the linked list 
    head = None
    head = add('(') 
    head.next = add('G') 
    head.next.next = add('E') 
    head.next.next.next = add('E') 
    head.next.next.next.next = add('*') 
    head.next.next.next.next.next = add('K') 
    head.next.next.next.next.next.next = add('S') 
    head.next.next.next.next.next.next.next = add('*') 
  
    # Remove the special characters 
    # from the linked list 
    head = removeFromLL(head) 
  
    # Print the updated list 
    printlist(head) 
  
# This code is contributed by Srathore 

