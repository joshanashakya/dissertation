

# Python3 program to find modular node  
# in a linked list 
import math 
  
# Linked list node 
class Node: 
    def __init__(self, data): 
        self.data = data 
        self.next = None
  
# Function to create a new node  
# with given data 
def newNode(data): 
    new_node = Node(data) 
    new_node.data = data 
    new_node.next = None
    return new_node 
  
# Function to find modular node  
# in the linked list 
def modularNode(head, k): 
      
    # Corner cases 
    if (k <= 0 or head == None): 
        return None
  
    # Traverse the given list 
    i = 1
    modularNode = None
    temp = head 
    while (temp != None): 
        if (i % k == 0): 
            modularNode = temp 
  
        i = i + 1
        temp = temp.next
    return modularNode 
  
# Driver Code 
if __name__ == '__main__': 
    head = newNode(1) 
    head.next = newNode(2) 
    head.next.next = newNode(3) 
    head.next.next.next = newNode(4) 
    head.next.next.next.next = newNode(5) 
    k = 2
    answer = modularNode(head, k) 
    print("Modular node is", end = ' ') 
    if (answer != None): 
        print(answer.data, end = ' ') 
    else: 
        print("None") 
  
# This code is contributed by Srathore 

