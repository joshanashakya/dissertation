

# Efficient Python3 program to sort given list in order 
# elements are appearing in an array 
  
# Linked list node 
class Node: 
    def __init__(self): 
        self.data = 0
        self.next = None
  
# Function to insert a node at the 
# beginning of the linked list 
def push( head_ref, new_data): 
  
    new_node = Node() 
    new_node.data = new_data 
    new_node.next = head_ref 
    head_ref = new_node 
    return head_ref 
  
# function to print the linked list 
def printList( head): 
  
    while (head != None): 
      
        print(head.data, end = "->") 
        head = head.next
      
# Function that sort list in order of apperaing 
# elements in an array 
def sortlist( arr, N, head): 
  
    # Store frequencies of elements in a 
    # hash table. 
    hash = dict() 
    temp = head 
    while (temp != None) : 
      
        hash[temp.data] = hash.get(temp.data, 0) + 1
        temp = temp.next
      
    temp = head 
  
    # One by one put elements in lis according 
    # to their appearance in array 
    for i in range(N):  
          
        # Update 'frequency' nodes with value  
        # equal to arr[i] 
        frequency = hash.get(arr[i],0) 
          
        while (frequency > 0) : 
          
            frequency= frequency-1
            # Modify list data as element  
            # appear in an array 
            temp.data = arr[i] 
            temp = temp.next
          
# Driver Code 
  
head = None
arr = [5, 1, 3, 2, 8 ] 
N = len(arr) 
  
# creating the linked list 
head = push(head, 3) 
head = push(head, 2) 
head = push(head, 5) 
head = push(head, 8) 
head = push(head, 5) 
head = push(head, 2) 
head = push(head, 1) 
  
# Function call to sort the list in order 
# elements are apperaing in an array 
sortlist(arr, N, head) 
  
# print the modified linked list 
print("Sorted List:" ) 
printList(head) 
  
  
# This code is contributed by Arnab Kundu 

