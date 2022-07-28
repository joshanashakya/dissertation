

# Python program to print largest value 
# on each level of binary tree 
  
INT_MIN = -2147483648
  
# Helper function that allocates a new  
# node with the given data and None left  
# and right pointers.                                      
class newNode:  
  
    # Constructor to create a new node  
    def __init__(self, data):  
        self.data = data  
        self.left = None
        self.right = None
  
# function to find largest values  
def largestValueInEachLevel(root): 
    if ( not root):  
        return
    q = [] 
    nc = 10
    max = 0
    q.append(root) 
    while (1) :  
        # node count for the current level  
        nc = len(q) 
  
        # if true then all the nodes of  
        # the tree have been traversed  
        if (nc == 0) : 
            break
  
        # maximum element for the current  
        # level  
        max = INT_MIN 
        while (nc) : 
  
            # get the front element from 'q'  
            front = q[0]  
  
            # remove front element from 'q'  
            q = q[1:] 
              
            # if true, then update 'max'  
            if (max < front.data) : 
                max = front.data  
  
            # if left child exists  
            if (front.left):  
                q.append(front.left)  
  
            # if right child exists  
            if (front.right != None):  
                q.append(front.right) 
            nc-=1
  
        # print maximum element of  
        # current level  
        print(max,end = " ") 
  
  
          
# Driver Code  
if __name__ == '__main__': 
    """ Let us construct the following Tree 
        4  
        / \  
        9 2  
    / \ \ 
    3 5 7 """
    root = newNode(4)  
    root.left = newNode(9)  
    root.right = newNode(2)  
    root.left.left = newNode(3) 
    root.left.right = newNode(5) 
    root.right.right = newNode(7) 
    largestValueInEachLevel(root) 
  
# This code is contributed 
# Shubham Singh(SHUBHAMSINGH10) 

