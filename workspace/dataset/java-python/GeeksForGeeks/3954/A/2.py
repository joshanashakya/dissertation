

# Python program for special order traversal 
  
# Linked List node  
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
  
# Given a perfect binary tree,  
# print its nodes in specific level order  
def specific_level_order_traversal(root) : 
  
    # for level order traversal  
    q = [] 
      
    # Stack to print reverse  
    s = [] 
      
    q.append(root)  
    sz = 0
      
    while(len(q) > 0) : 
      
        # vector to store the level  
        v = []  
        sz = len(q) # considering size of the level  
        i = 0
        while( i < sz) : 
          
            temp = q[0]  
            q.pop(0)  
              
            # push data of the node of a  
            # particular level to vector  
            v.append(temp.data)  
              
            if(temp.left != None) : 
                q.append(temp.left)  
      
            if(temp.right != None) : 
                q.append(temp.right)  
          
            i = i + 1
          
        # push vector containg a level in Stack  
        s.append(v)  
      
    # print the Stack  
    while(len(s) > 0) : 
      
        # Finally pop all Nodes from Stack  
        # and prints them.  
        v = s[-1]  
        s.pop()  
        i = 0
        j = len(v) - 1
        while( i < j) : 
            print(v[i] , " " , v[j] ,end= " ")  
            j = j - 1
            i = i + 1
              
    # finally print root  
    print(root.data)  
      
# Driver code  
  
root = Node(1)  
  
root.left = Node(2)  
root.right = Node(3)  
  
print("Specific Level Order traversal of binary tree is")  
specific_level_order_traversal(root)  
  
# This code is contributed by Arnab Kundu 

