

# Python3 program to prminimum element  
# in each level of binary tree.  
  
# Importing Queue 
from queue import Queue 
  
# Utility class to create a  
# new tree node  
class newNode: 
    def __init__(self, data): 
        self.data = data  
        self.left = self.right = None
      
# return height of tree p 
def heightoftree(root): 
  
    if (root == None):  
        return 0
  
    left = heightoftree(root.left)  
    right = heightoftree(root.right)  
    if left > right: 
        return left + 1
    else: 
        return right + 1
          
# Iterative method to find every level  
# minimum element of Binary Tree  
def printPerLevelMinimum(root): 
  
    # Base Case  
    if (root == None):  
        return
  
    # Create an empty queue for  
    # level order traversal  
    q = Queue()  
  
    # put the root for Change the level  
    q.put(root)  
  
    # for go level by level  
    q.put(None)  
  
    Min = 9999999999999
      
    # for check the level  
    level = 0
  
    while (q.empty() == False):  
  
        # Get get of queue  
        node = q.queue[0]  
        q.get()  
  
        # if node == None (Means this is  
        # boundary between two levels)  
        if (node == None):  
  
            print("level", level, "min is =", Min)  
  
            # here queue is empty represent  
            # no element in the actual  
            # queue  
            if (q.empty()):  
                break
  
            q.put(None)  
  
            # increment level  
            level += 1
  
            # Reset min for next level  
            # minimum value  
            Min = 999999999999
  
            continue
  
        # get Minimum in every level  
        if (Min > node.data):  
            Min = node.data  
  
        # Enqueue left child  
        if (node.left != None):  
            q.put(node.left)  
  
        #Enqueue right child  
        if (node.right != None):  
            q.put(node.right) 
  
# Driver Code 
if __name__ == '__main__': 
      
    # Let us create binary tree shown  
    # in above diagram  
    root = newNode(7)  
    root.left = newNode(6)  
    root.right = newNode(5)  
    root.left.left = newNode(4)  
    root.left.right = newNode(3)  
    root.right.left = newNode(2)  
    root.right.right = newNode(1)  
  
    #     7  
    # / \  
    # 6 5  
    # / \ / \  
    # 4 3 2 1          
    print("Every Level minimum is") 
          
    printPerLevelMinimum(root) 
  
# This code is contributed by PranchalK 

