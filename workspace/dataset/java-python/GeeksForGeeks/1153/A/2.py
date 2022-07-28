

# Python3 program 
# for the above approach 
  
# Structure Representing 
# the Node in the Binary tree 
class Node:  
    def __init__( self,_val): 
        self.data = _val 
        self.left = self.right = None
      
# Function to perform a level 
# order insertion of a Node 
# in the Binary tree 
def addinBT(root, data): 
  
    # If the root is empty, 
    # make it point to the Node 
    if (root == None) : 
        root = Node(data) 
      
    else : 
  
        # In case there are elements 
        # in the Binary tree, perform 
        # a level order traversal 
        # using a Queue 
        Q = [] 
        Q.append(root) 
  
        while (len(Q) > 0):  
            temp = Q[-1] 
            Q.pop() 
              
            # If the left child does 
            # not exist, insert the 
            # Node as the left child 
            if (temp.left == None) : 
                temp.left = Node(data) 
                break
              
            else: 
                Q.append(temp.left) 
                  
            # In case the right child 
            # does not exist, insert 
            # the Node as the right child 
            if (temp.right == None):  
                temp.right = Node(data) 
                break
              
            else: 
                Q.append(temp.right) 
          
    return root 
  
# Function to print the level 
# order traversal of the Binary tree 
def print_(root): 
  
    Q = []  
    Q.append(root) 
  
    while (len(Q) > 0) : 
        temp = Q[-1] 
        Q.pop() 
        print(temp.data,end = " ") 
        if (temp.left != None): 
            Q.append(temp.left) 
        if (temp.right != None): 
            Q.append(temp.right) 
      
# Function to check if the 
# character is a vowel or not. 
def checkvowel( ch): 
  
    ch = ch.lower() 
    if (ch == 'a' or ch == 'e' or ch == 'i'
                or ch == 'o' or ch == 'u'):  
        return True
      
    else:  
        return False
  
# Function to remove the 
# vowels in the Binary tree 
def removevowels(root): 
  
    Q = [] 
    Q.append(root) 
  
    # Declaring the root of 
    # the tree 
    root1 = None
  
    while (len(Q) > 0):  
        temp = Q[-1] 
        Q.pop() 
  
        # If the given character 
        # is not a vowel, add it 
        # to the Binary tree 
        if (not checkvowel(temp.data)) : 
            root1 = addinBT(root1, temp.data) 
          
        if (temp.left != None):  
            Q.append(temp.left) 
          
        if (temp.right != None):  
            Q.append(temp.right) 
          
    return root1 
  
# Driver code 
s = "geeks"
root = None
  
for i in range( len(s) ) : 
    root = addinBT(root, s[i]) 
      
root = removevowels(root) 
print_(root) 
  
# This code is contributed by Arnab Kundu 

