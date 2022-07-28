

# Python3 Program to count possible binary  
# trees using dynamic programming  
  
def countTrees(n) : 
  
    # Array to store number of Binary  
    # tree for every count of nodes  
    BT = [0] * (n + 1)  
  
    BT[0] = BT[1] = 1
  
    # Start finding from 2 nodes, since  
    # already know for 1 node.  
    for i in range(2, n + 1):  
        for j in range(i): 
            BT[i] += BT[j] * BT[i - j - 1]  
  
    return BT[n]  
  
# Driver Code  
if __name__ == '__main__': 
  
    n = 5
    print("Total Possible Binary Trees are : ",  
                                 countTrees(n)) 
                                   
# This code is contributed by 
# Shubham Singh(SHUBHAMSINGH10) 

