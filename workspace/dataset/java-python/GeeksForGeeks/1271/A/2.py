

# Python3 program to find closest  
# value in Binary search Tree 
  
_MIN = -2147483648
_MAX = 2147483648
  
# Helper function that allocates a new  
# node with the given data and None  
# left and right poers.                                      
class getnode:  
  
    # Constructor to create a new node  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
  
# utility function to return level 
# of given node 
def getlevel(root, data):  
  
    q = []  
    level = 1
    q.append(root)  
  
    # extra None is appended to keep track  
    # of all the nodes to be appended  
    # before level is incremented by 1  
    q.append(None)  
    while (len(q)):  
        temp = q[0]  
        q.pop(0)  
        if (temp == None) : 
            if len(q) == 0: 
                return 0
            if (q[0] != None): 
                q.append(None) 
            level += 1
        else : 
            if (temp.data == data) : 
                return level 
            if (temp.left): 
                q.append(temp.left) 
            if (temp.right) : 
                q.append(temp.right)      
    return 0
  
# Driver Code  
if __name__ == '__main__': 
      
    # create a binary tree  
    root = getnode(20)  
    root.left = getnode(10)  
    root.right = getnode(30)  
    root.left.left = getnode(5)  
    root.left.right = getnode(15)  
    root.left.right.left = getnode(12)  
    root.right.left = getnode(25)  
    root.right.right = getnode(40)  
  
    # return level of node  
    level = getlevel(root, 30) 
    if level != 0: 
        print("level of node 30 is", level) 
    else: 
        print("node 30 not found")  
  
    level = getlevel(root, 12) 
    if level != 0: 
        print("level of node 12 is", level) 
    else: 
        print("node 12 not found") 
          
    level = getlevel(root, 25)  
    if level != 0: 
        print("level of node 25 is", level) 
    else: 
        print("node 25 not found")  
  
    level = getlevel(root, 27)  
    if level != 0: 
        print("level of node 27 is", level) 
    else: 
        print("node 27 not found")  
  
# This code is contributed by 
# Shubham Singh(SHUBHAMSINGH10) 

