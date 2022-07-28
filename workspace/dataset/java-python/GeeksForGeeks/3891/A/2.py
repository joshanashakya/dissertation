

# Python3 implementation to sort  
# the biotonic doubly linked list  
  
# structure of node of the doubly linked list  
class Node:   
      
    def __init__(self, data): 
        self.data = data 
        self.prev = None
        self.next = None
   
# function to sort a biotonic doubly linked list  
def sort(head):  
   
    # If number of elements are less  
    # than or equal to 1 then return.  
    if head == None or head.next == None:   
        return head  
  
    # Pointer to first element  
    # of doubly linked list.  
    front = head  
  
    # Pointer to last element  
    # of doubly linked list.  
    last = head  
  
    # Dummy node to which resultant  
    # sorted list is added.  
    res = Node(None)  
  
    # Node after which next element  
    # of sorted list is added.  
    resEnd = res  
  
    # Find last element of input list.  
    while last.next != None:  
        last = last.next 
       
    # Compare first and last element  
    # until both pointers are not equal.  
    while front != last:   
  
        # If last element data is less than  
        # or equal to front element data,  
        # then add last element to  
        # result list and change the last  
        # pointer to its previous element.  
        if last.data <= front.data: 
            resEnd.next = last  
            next = last.prev  
            last.prev.next = None 
            last.prev = resEnd  
            last = next 
            resEnd = resEnd.next 
           
        # If front element is smaller, then  
        # add it to result list and change  
        # front pointer to its next element.  
        else:   
            resEnd.next = front  
            next = front.next 
            front.next = None 
            front.prev = resEnd  
            front = next 
            resEnd = resEnd.next 
  
    # Add the single element left to the  
    # result list.  
    resEnd.next = front  
    front.prev = resEnd  
  
    # The head of required sorted list is  
    # next to dummy node res.  
    return res.next 
   
# Function to insert a node at the  
# beginning of the Doubly Linked List  
def push(head_ref, new_data):  
   
    # put in the data  
    new_node = Node(new_data)  
  
    # since we are adding at the  
    # beginning, prev is always None  
    new_node.prev = None 
  
    # link the old list off the new node  
    new_node.next = head_ref 
  
    # change prev of head node to new node  
    if head_ref != None:  
        head_ref.prev = new_node  
  
    # move the head to point to the new node  
    head_ref = new_node 
    return head_ref 
  
# Function to print nodes in  
# a given doubly linked list  
def printList(head):  
   
    # If list is empty  
    if head == None:  
        print("Doubly Linked list empty")  
  
    while head != None:   
        print(head.data, end = " ")  
        head = head.next 
  
# Driver program to test above  
if __name__ == '__main__': 
   
    head = None 
  
    # Create the doubly linked list:  
    # 2<.5<.7<.12<.10<.6<.4<.1  
    head = push(head, 1)  
    head = push(head, 4)  
    head = push(head, 6)  
    head = push(head, 10)  
    head = push(head, 12)  
    head = push(head, 7)  
    head = push(head, 5)  
    head = push(head, 2)  
  
    print("Original Doubly linked list:")  
    printList(head)  
  
    # sort the biotonic DLL  
    head = sort(head) 
  
    print("\nDoubly linked list after sorting:")  
    printList(head) 
          
# This code is contributed by Rituraj Jain 

