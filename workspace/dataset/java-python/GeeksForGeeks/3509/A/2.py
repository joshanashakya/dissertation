

# Python3 implmentation of the approach  
  
# Binary tree node consists of data, a  
# pointer to the left child and a  
# pointer to the right child  
class newNode : 
    def __init__(self, data) : 
        self.data = data;  
        self.left = None;  
        self.right = None;  
  
# Function to return the sum of all  
# the nodes at Kth level using  
# level order traversal  
def sumOfNodesAtNthLevel(root, k) : 
  
    # If the current node is NULL  
    if (root == None) : 
        return 0;  
  
    # Create Queue  
    que = [];  
  
    # Enqueue the root node  
    que.append(root);  
  
    # Level is used to track  
    # the current level  
    level = 0;  
  
    # To store the sum of nodes  
    # at the Kth level  
    sum = 0;  
  
    # flag is used to break out of  
    # the loop after the sum of all  
    # the nodes at Nth level is found  
    flag = 0;  
  
    # Iterate the queue till its not empty  
    while (len(que) != 0) :  
  
        # Calculate the number of nodes  
        # in the current level  
        size = len(que);  
  
        # Process each node of the current  
        # level and enqueue their left  
        # and right child to the queue  
        while (size != 0) : 
              
            size -= 1; 
            ptr = que[0]; 
            que.pop(0); 
              
            # If the current level matches the 
            # required level then calculate the 
            # sum of all the nodes at that level 
            if (level == k) : 
                  
                # Flag initialized to 1 
                # indicates that sum of the 
                # required level is calculated 
                flag = 1; 
                  
                # Calculating the sum of the nodes 
                sum += ptr.data; 
                  
            else : 
                # Traverse to the left child 
                if (ptr.left) : 
                    que.append(ptr.left); 
                      
                # Traverse to the right child 
                if (ptr.right) : 
                    que.append(ptr.right);  
  
        # Increment the variable level  
        # by 1 for each level  
        level += 1;  
  
        # Break out from the loop after the sum  
        # of nodes at K level is found  
        if (flag == 1) :  
            break;  
      
    return sum;  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Tree Construction  
    root = newNode(50);  
    root.left = newNode(30);  
    root.right = newNode(70);  
    root.left.left = newNode(20);  
    root.left.right = newNode(40);  
    root.right.left = newNode(60);  
    level = 2;  
    result = sumOfNodesAtNthLevel(root, level);  
  
    # Printing the result  
    print(result);  
  
# This code is contributed by AnkitRai01 

