

# Python program to rearrange nodes 
# as alternate odd even nodes in 
# a Singly Linked List 
  
# Link list node  
class Node:  
      
    def __init__(self, data):  
        self.data = data  
        self.next = next
          
# A utility function to print 
# linked list 
def printList( node): 
  
    while (node != None) : 
        print(node.data , end=" ") 
        node = node.next
      
    print("\n") 
  
# Function to create newNode 
# in a linkedlist 
def newNode(key): 
  
    temp = Node(0) 
    temp.data = key 
    temp.next = None
    return temp 
  
# Function to insert at beginning 
def insertBeg(head, val): 
  
    temp = newNode(val) 
    temp.next = head 
    head = temp 
    return head 
  
# Function to rearrange the 
# odd and even nodes 
def rearrangeOddEven( head): 
  
    odd = [] 
    even = [] 
    i = 1
  
    while (head != None):  
  
        if (head.data % 2 != 0 and i % 2 == 0):  
  
            # Odd Value in Even Position 
            # Add pointer to current node 
            # in odd stack 
            odd.append(head) 
          
        elif (head.data % 2 == 0 and i % 2 != 0):  
  
            # Even Value in Odd Position 
            # Add pointer to current node 
            # in even stack 
            even.append(head) 
  
        head = head.next
        i = i + 1
  
    while (len(odd) != 0 and len(even) != 0) : 
  
        # Swap Data at the top of two stacks 
        odd[-1].data, even[-1].data = even[-1].data, odd[-1].data 
        odd.pop() 
        even.pop() 
      
    return head 
  
# Driver code 
  
head = newNode(8) 
head = insertBeg(head, 7) 
head = insertBeg(head, 6) 
head = insertBeg(head, 5) 
head = insertBeg(head, 3) 
head = insertBeg(head, 2) 
head = insertBeg(head, 1) 
  
print( "Linked List:" ) 
printList(head) 
rearrangeOddEven(head) 
  
print( "Linked List after ", "Rearranging:" ) 
printList(head) 
  
# This code is contributed by Arnab Kundu 

