

# Python3 program to print path from root  
# to all nodes in a complete binary tree.  
  
# Function to print path of all the nodes  
# nth node represent as given node kth 
# node represents as left and right node  
def printPath(res, nThNode, kThNode):  
  
    # base condition  
    # if kth node value is greater  
    # then nth node then its means  
    # kth node is not valid so  
    # we not store it into the res  
    # simply we just return  
    if kThNode > nThNode:  
        return
  
    # Storing node into res  
    res.append(kThNode)  
  
    # Print the path from root to node  
    for i in range(0, len(res)):  
        print(res[i], end = " ")  
    print()  
  
    # store left path of a tree  
    # So for left we will go node(kThNode*2)  
    printPath(res[:], nThNode, kThNode * 2)  
  
    # right path of a tree  
    # and for right we will go node(kThNode*2+1)  
    printPath(res[:], nThNode, kThNode * 2 + 1)  
  
# Function to print path from root  
# to all of the nodes  
def printPathToCoverAllNodeUtil(nThNode):  
  
    # res is for store the path  
    # from root to particulate node  
    res = [] 
  
    # Print path from root to all node.  
    # third argument 1 because of we have  
    # to consider root node is 1  
    printPath(res, nThNode, 1)  
  
# Driver Code  
if __name__ == "__main__":  
  
    # Given Node  
    nThNode = 7
  
    # Print path from root to all node.  
    printPathToCoverAllNodeUtil(nThNode)  
  
# This code is contributed by Rituraj Jain 

