

# Python3 implementation to  
# create odd doubly linked list  
  
# Node of the doubly linked list  
class Node: 
      
    def __init__(self, data): 
        self.data = data 
        self.prev = None
        self.next = None
  
# Function to insert a node at the  
# beginning of the Doubly Linked List  
def push(head_ref, new_data):  
  
    # allocate node  
    new_node = Node(new_data)  
  
    # link the old list off the new node  
    new_node.next = head_ref  
  
    # change prev of head node to new node  
    if head_ref != None:  
        head_ref.prev = new_node  
  
    # move the head to point to the new node  
    head_ref = new_node 
    return head_ref 
  
# Function to make all node is odd  
def makeOddNode(head_ref, A, n):  
  
    ptr = head_ref  
    i = 0
      
    # traves list till last node  
    while ptr != None: 
          
        next = ptr.next
          
        # check if node is even then  
        # replace it and incriment in i  
        if ptr.data % 2 == 0:  
            ptr.data = A[i]  
            i += 1
          
        ptr = next
      
    # return sum of nodes which is divided by K  
  
# Function to print nodes in a  
# given doubly linked list  
def printList(head):  
  
    while head != None: 
        print(head.data, end = " ")  
        head = head.next
  
# Driver Code 
if __name__ == "__main__":  
  
    # start with the empty list  
    head = None
  
    # create the doubly linked list  
    # 6 <=> 9 <=> 8 <=> 7 <=> 4  
    Arr = [3, 5, 23, 17, 1]  
    head = push(head, 4)  
    head = push(head, 7)  
    head = push(head, 8)  
    head = push(head, 9)  
    head = push(head, 6)  
    n = len(Arr)  
      
    print("Original List:", end = " ")  
    printList(head)  
    print() 
      
    makeOddNode(head, Arr, n)  
    print("New odd List:", end = " ")  
    printList(head)  
  
# This code is contributed by Rituraj Jain 

