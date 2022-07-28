

# Python3 program to replace the nodes  
# with their surpasser count  
  
# A linked list node  
class Node: 
      
    def __init__(self, data): 
        self.data = data  
        self.next = None
  
# Function to display the linked list  
def printList(node):  
  
    while node != None:  
        print(node.data, end = " ")  
        node = node.next
      
# Function to check Surpasser Count  
def replaceNodes(head):  
  
    # Pointer used to traverse through  
    # all the nodes in the list  
    p = head  
  
    # Pointer used to traverse through 
    # the right elements to count the  
    # greater elements  
    x = None
  
    # Variable to count the number of  
    # elements greater than the  
    # current element on right  
    count = 0
  
    # Traverse through all the elements  
    # in the list  
    while p != None:  
  
        count = 0
  
        # Initialize x to current node  
        x = p  
  
        # Check or count the number of nodes  
        # that are greater than the current  
        # node on right  
        while x != None:  
  
            if x.data > p.data:  
                count += 1
  
            x = x.next
  
        # Replace the node data with the  
        # count of elements greater than  
        # the current element  
        p.data = count  
        p = p.next
  
# Driver code  
if __name__ == "__main__": 
  
    # Creating the linked list  
    head = Node(10)  
    head.next = Node(12)  
    head.next.next = Node(5)  
    head.next.next.next = Node(40)  
    head.next.next.next.next = Node(21)  
    head.next.next.next.next.next = Node(70)  
    head.next.next.next.next.next.next = Node(1)  
    head.next.next.next.next.next.next.next = Node(49)  
    head.next.next.next.next.next.next.next.next = Node(37)  
  
    replaceNodes(head)  
  
    printList(head)  
  
# This code is contributed by Rituraj Jain 

