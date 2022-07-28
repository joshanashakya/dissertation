

# Python3 program to reverse a linked 
# list using stack  
  
# Link list node  
class Node: 
      
    def __init__(self, data, next): 
        self.data = data 
        self.next = next
  
class LinkedList: 
      
    def __init__(self): 
        self.head = None
          
    # Function to push a new Node in  
    # the linked list  
    def push(self, new_data):  
      
        new_node = Node(new_data, self.head)  
        self.head = new_node 
      
    # Function to reverse linked list  
    def reverseList(self):  
      
        # Stack to store elements of list  
        stk = [] 
      
        # Push the elements of list to stack  
        ptr = self.head  
        while ptr.next != None:  
            stk.append(ptr)  
            ptr = ptr.next
      
        # Pop from stack and replace  
        # current nodes value'  
        self.head = ptr  
        while len(stk) != 0:  
            ptr.next = stk.pop()  
            ptr = ptr.next
          
        ptr.next = None
      
    # Function to print the Linked list  
    def printList(self): 
          
        curr = self.head 
        while curr:  
            print(curr.data, end = " ")  
            curr = curr.next
  
# Driver Code  
if __name__ == "__main__": 
  
    # Start with the empty list 
    linkedList = LinkedList()  
  
    # Use push() to construct below list  
    # 1.2.3.4.5 
    linkedList.push(5)  
    linkedList.push(4)  
    linkedList.push(3)  
    linkedList.push(2)  
    linkedList.push(1)  
  
    linkedList.reverseList()  
  
    linkedList.printList()  
  
# This code is contributed by Rituraj Jain  

