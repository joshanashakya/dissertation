

# Python3 program to find count of minimum  
# frequqncy elements in Linked list  
import sys 
import math 
  
# Link list node 
class Node: 
    def __init__(self,data): 
        self.data = data 
        self.next = None
  
# Given a reference (pointer to pointer) to the head  
# of a list and an int, push a new node on the front  
# of the list.  
def push(head,data): 
    if not head: 
        return Node(data) 
    temp = Node(data) 
    temp.next = head 
    head = temp 
    return head 
  
# Function to count minimum frequency elements  
# in the linked list  
def countMinimun(head): 
      
    # Store frequencies of all nodes.  
    freq = {} 
    temp = head 
    while(temp): 
        d = temp.data 
        if d in freq: 
            freq[d] = freq.get(d) + 1
        else: 
            freq[d] = 1
        temp = temp.next
      
    # Find min frequency 
    minimum_freq = sys.maxsize 
    for i in freq: 
        minimum_freq = min(minimum_freq, freq.get(i)) 
      
    # Find count of min frequency elements  
    countMin = 0
    for i in freq: 
        if freq.get(i) == minimum_freq: 
            countMin += 1
    return countMin 
  
# Driver program to test count function # 
if __name__=='__main__': 
  
    # Start with the empty list 
    head = None
      
    # Use push() to construct below list  
    #10->10->11->30->10  
    head = push(head,10) 
    head = push(head,30) 
    head = push(head,11) 
    head = push(head,10) 
    head = push(head,10) 
  
    print(countMinimun(head)) 
  
# This code is Contribute by Vikash Kumar 37 

