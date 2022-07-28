

# Python3 program to construct string from binary tree 
  
# A Binary Tree node 
class Node: 
    def __init__(self, data): 
        self.data = data 
        self.left = None
        self.right = None
  
# A recursive function to print the paths 
# whose maximum element is greater than 
# or equal to K. 
def findPathUtil(root: Node, k: int, path: list, flag: int): 
    global ans 
  
    if root is None: 
        return
  
    # If the current node value is greater than 
    # or equal to k, then all the subtrees 
    # following that node will get printed, 
    # flag = 1 indicates to print the required path 
    if root.data >= k: 
        flag = 1
  
    # If the leaf node is encountered, then the path is 
    # printed if the size of the path vector is 
    # greater than 0 
    if root.left is None and root.right is None: 
        if flag: 
            ans = 1
            print("(", end = "") 
            for i in range(len(path)): 
                print(path[i], end = ", ") 
            print(root.data, end = "), ") 
        return
  
    # Append the node to the path vector 
    path.append(root.data) 
  
    # Recur left and right subtrees 
    findPathUtil(root.left, k, path, flag) 
    findPathUtil(root.right, k, path, flag) 
  
    # Backtracking to return the vector 
    # and print the path if the flag is 1 
    path.pop() 
  
# Function to initialize the variables 
# and call the utility function to print 
# the paths with maximum values greater than 
# or equal to K 
def findPath(root: Node, k: int): 
    global ans 
  
    # Initialize flag 
    flag = 0
  
    # ans is used to check empty condition 
    ans = 0
  
    v = [] 
  
    # Call function that print path 
    findPathUtil(root, k, v, flag) 
  
    # If the path doesn't exist 
    if ans == 0: 
        print(-1) 
  
# Driver Code 
if __name__ == "__main__": 
  
    ans = 0
    k = 25
  
    # Constructing the following tree: 
    #             10 
    #         / \ 
    #         5     8 
    #     / \ / \ 
    #     29 2 1 98 
    #     /             \ 
    #     20             50 
  
    root = Node(10) 
    root.left = Node(5) 
    root.right = Node(8) 
    root.left.left = Node(29) 
    root.left.right = Node(2) 
    root.right.right = Node(98) 
    root.right.left = Node(1) 
    root.right.right.right = Node(50) 
    root.left.left.left = Node(20) 
  
    findPath(root, k) 
  
# This code is contributed by 
# sanjeev2552 

