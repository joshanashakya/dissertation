

    # Python3 program to calculate sum and  
# product from singly circular linked list  
# nodes which are divisible by given key 
import math  
  
# Circular list node 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.next = None
  
# Function to calculate sum and product 
def sumProduct(head, key): 
    current = head 
  
    sum = 0
    product = 1
  
    # if list is empty simply show message 
    if (head == None): 
        print("\nDisplay List is empty\n") 
        return
      
    # traverse first to last node 
    else : 
          
        # check if current node's data is 
        # divisible by key 
        if ((current.data) % key == 0) : 
  
            # Calculate sum 
            sum = sum + current.data 
  
            # Calculate product 
            product = product * current.data 
  
        current = current.next
        while (current != head): 
            if ((current.data) % key == 0) : 
  
                # Calculate sum 
                sum = sum + current.data 
      
                # Calculate product 
                product = product * current.data 
               
            current = current.next
      
    print("\nSum =", sum, end = ", ") 
    print("Product =", product) 
  
# Function print the list 
def displayList(head): 
    current = head 
  
    # if list is empty simply show message 
    if (head == None): 
        print("\nDisplay List is empty\n") 
        return
      
    # traverse first to last node 
    else : 
          
        print(current.data, end = " ") 
        current = current.next
        while (current != head): 
            print(current.data, end = " ") 
            current = current.next
      
# Function to insert a node at the end of 
# a Circular linked list 
def InsertNode(head, data): 
    current = head 
      
    # Create a new node 
    newNode = Node(data) 
  
    # check node is created or not 
    if (newNode == None): 
        print("\nMemory Error\n") 
        return head 
      
    # insert data o newly created node 
    newNode.data = data 
  
    # check list is empty 
    # if not have any node then 
    # make first node it 
    if (head == None): 
        newNode.next = newNode 
        head = newNode 
        return head 
      
    # if list have already some node 
    else : 
  
        # move firt node to last node 
        while (current.next != head): 
            current = current.next
          
        # put first or head node address 
        # in new node link 
        newNode.next = head 
  
        # put new node address o last node link(next) 
        current.next = newNode 
      
    return head 
  
# Driver Code 
if __name__=='__main__':  
    head = None
    head = InsertNode(head, 5)  
    head = InsertNode(head, 6)  
    head = InsertNode(head, 7)  
    head = InsertNode(head, 8)  
    head = InsertNode(head, 9)  
    head = InsertNode(head, 10)  
    head = InsertNode(head, 11)  
    head = InsertNode(head, 11)  
      
    print("Initial List: ", end = "") 
    displayList(head) 
  
    sumProduct(head, 11) 
  
# This code is contributed by Srathore 

