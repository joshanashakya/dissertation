

# Python3 program to reverse given  
# linked list according to its size  
  
class Node: 
      
    def __init__(self, data): 
        self.data = data 
        self.next = None
  
# Prints a list.  
def printList(head):  
   
    temp = head  
    while temp:   
        print(temp.data, end = " ")  
        temp = temp.next 
       
    print() 
  
# Function to push a Node  
def push(head_ref, new_data):  
   
    new_Node = Node(new_data)  
    new_Node.next = head_ref  
    head_ref = new_Node 
      
    return head_ref 
  
# Returns size of list.  
def getSize(head): 
   
    curr = head  
    count = 0 
    while curr:   
        curr = curr.next 
        count += 1 
       
    return count  
   
# Function to reverse the linked  
# list according to its size  
def reverseSizeBy2Util(head, k, skipMiddle):  
   
    if not head: 
        return None 
  
    count = 0 
    curr, prev, next = head, None, None 
      
    # Reverse current block of list.  
    while curr and count < k: 
        next = curr.next 
        curr.next = prev  
        prev = curr  
        curr = next 
        count += 1 
       
    # If size is even, reverse next block too.  
    if not skipMiddle:  
        head.next = reverseSizeBy2Util(next, k, False)  
  
    else: 
  
        # if size is odd, skip next element  
        # and reverse the block after that.  
        head.next = next 
        if next:  
            next.next = reverseSizeBy2Util(next.next,  
                                            k, True)  
       
    return prev  
   
def reverseBySizeBy2(head):  
   
    # Get the size of list.  
    n = getSize(head)  
  
    # If the size is even, no  
    # need to skip middle Node.  
    if n % 2 == 0:  
        return reverseSizeBy2Util(head, n//2, False)  
  
    # If size is odd, middle  
    # Node has to be skipped.  
    else: 
        return reverseSizeBy2Util(head, n//2, True)  
   
# Drivers code  
if __name__ == "__main__":  
   
    # Start with the empty list  
    head = None 
  
    # Created Linked list is 1.2.3.4.5.6.7.8.9  
    head = push(head, 9)  
    head = push(head, 8)  
    head = push(head, 7)  
    head = push(head, 6)  
    head = push(head, 5)  
    head = push(head, 4)  
    head = push(head, 3)  
    head = push(head, 2)  
    head = push(head, 1)  
  
    print("Original List : ", end = "")  
    printList(head)  
  
    print("Reversed List : ", end = "") 
    reversedHead = reverseBySizeBy2(head)  
    printList(reversedHead)  
   
# This code is contributed by Rituraj Jain 

