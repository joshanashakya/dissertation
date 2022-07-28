

# Python3 program to illustrate inserting a Node in  
# a Cicular Doubly Linked list in begging, end  
# and middle  
import math 
  
# Structure of a Node  
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Function to insert a node at the end  
def insertNode(start, value): 
      
    # If the list is empty, create a single node  
    # circular and doubly list  
    if (start == None) :  
        new_node = Node(value)  
        new_node.data = value  
        new_node.next = new_node 
        new_node.prev = new_node  
        start = new_node  
        return new_node 
      
    # If list is not empty  
  
    # Find last node */ 
    last = start.prev  
  
    # Create Node dynamically  
    new_node = Node(value)  
    new_node.data = value  
  
    # Start is going to be next of new_node  
    new_node.next = start  
  
    # Make new node previous of start  
    (start).prev = new_node  
  
    # Make last preivous of new node  
    new_node.prev = last  
  
    # Make new node next of old last  
    last.next = new_node 
    return start 
  
# Function to display the 
# circular doubly linked list 
def displayList(start):  
    temp = start  
  
    while (temp.next != start):  
        print(temp.data, end = " ")  
        temp = temp.next
      
    print(temp.data)  
  
# Function to search the particular element 
# from the list 
def searchList(start, search): 
      
    # Declare the temp variable 
    temp = start 
      
    # Declare other control 
    # variable for the searching 
    count = 0
    flag = 0
    value = 0
      
    # If start is None return -1 
    if(temp == None): 
        return -1
    else: 
          
        # Move the temp pointer until,  
        # temp.next doesn't move 
        # start address (Circular Fashion) 
        while(temp.next != start): 
              
            # Increment count for location 
            count = count + 1
              
            # If it is found raise the 
            # flag and break the loop 
            if(temp.data == search): 
                flag = 1
                count = count - 1
                break
              
            # Increment temp pointer 
            temp = temp.next
          
        # Check whether last element in the 
        # list content the value if contain,  
        # raise a flag and increment count 
        if(temp.data == search): 
            count = count + 1
            flag = 1
      
        # If flag is true, then element 
        # found, else not 
        if(flag == 1): 
            print(search,"found at location ", count) 
        else: 
            print(search, " not found") 
      
    return -1
  
# Driver code 
if __name__=='__main__':  
  
    # Start with the empty list */ 
    start = None
  
    # Insert 4. So linked list becomes 4.None  
    start = insertNode(start, 4) 
  
    # Insert 5. So linked list becomes 4.5  
    start = insertNode(start, 5)  
  
    # Insert 7. So linked list  
    # becomes 4.5.7  
    start = insertNode(start, 7)  
  
    # Insert 8. So linked list  
    # becomes 4.5.7.8  
    start = insertNode(start, 8)  
  
    # Insert 6. So linked list  
    # becomes 4.5.7.8.6  
    start = insertNode(start, 6)  
  
    print("Created circular doubly linked list is: ", 
                                            end = "")  
    displayList(start)  
      
    searchList(start, 5) 
  
# This article contributed by Srathore 

