

# Node of a doubly linked list  
class Node:  
    def __init__(self, next = None,  
                    prev = None, data = None):  
        self.next = next # reference to next node in DLL  
        self.prev = prev # reference to previous node in DLL  
        self.data = data  
  
# Function to insert a node at the 
# beginning of the Doubly Linked List 
def push(head, new_data):  
  
    new_node = Node(data = new_data)  
  
    new_node.next = head  
    new_node.prev = None
  
    if head is not None:  
        head.prev = new_node  
  
    head = new_node  
    return head  
  
# Utility function to find the size of 
# Doubly Linked List 
def size(head): 
    node = head 
    sz = 0
    while(node is not None): 
        sz+= 1
        node = node.next
    return sz 
  
# Function to print linked list 
def printList(head):  
  
    node = head  
  
    print("Given linked list")  
    while(node is not None):  
        print(node.data, end = " "),  
        last = node  
        node = node.next
  
# Function to rotate a doubly linked 
# list clockwise and update the head 
def rotate(start, N):  
    if N == 0 :  
        return
  
    # Let us understand the below code  
    # for example N = 2 and  
    # list = a <-> b <-> c <-> d <-> e.  
    current = start  
  
    # current will either point to Nth  
    # or None after this loop. Current  
    # will point to node 'b' in the  
    # above example  
    count = 1
    while count < N and current != None :  
        current = current.next
        count += 1
  
    # If current is None, N is greater  
    # than or equal to count of nodes  
    # in linked list. Don't change the  
    # list in this case  
    if current == None :  
        return
  
    # current points to Nth node. Store  
    # it in a variable. NthNode points to  
    # node 'b' in the above example  
    NthNode = current  
  
    # current will point to last node  
    # after this loop current will point  
    # to node 'e' in the above example  
    while current.next != None :  
        current = current.next
  
    # Change next of last node to previous  
    # head. Next of 'e' is now changed to  
    # node 'a'  
    current.next = start  
  
    # Change prev of Head node to current  
    # Prev of 'a' is now changed to node 'e'  
    start.prev = current  
  
    # Change head to (N + 1)th node  
    # head is now changed to node 'c'  
    start = NthNode.next
  
    # Change prev of New Head node to None  
    # Because Prev of Head Node in Doubly  
    # linked list is None  
    start.prev = None
  
    # change next of Nth node to None  
    # next of 'b' is now None  
    NthNode.next = None
  
    return start  
  
# Driver Code  
if __name__ == "__main__":  
    head = None
  
    head = push(head, 'e')  
    head = push(head, 'd')  
    head = push(head, 'c')  
    head = push(head, 'b')  
    head = push(head, 'a')  
  
    printList(head)  
    print("\n")  
      
    N = 2
  
    # Length of the list 
    sz = size(head) 
  
    # If N is greater than the size of Doubly 
    # Linked List, we have to deduce it in the range  
    # of Doubly linked list size by taking modulo with the  
    # length of the list. 
    N = N % sz; 
      
    # We will update N by subtracting it's value length of  
    # the list. After this the question will reduce to 
    # counter-clockwise rotation of linked list to N places 
    N = sz-N; 
      
    head = rotate(head, N)  
  
    printList(head)  

