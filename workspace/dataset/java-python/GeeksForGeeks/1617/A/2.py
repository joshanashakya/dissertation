

    # Python3 program to construct a linked list 
# from given 2D matrix 
import math 
  
# struct node of linked list 
class Node:  
    def __init__(self, data):  
        self.data = data  
        self.right = None
        self.down = None
  
# returns head pointer of linked list 
# constructed from 2D matrix 
def construct(arr, i, j, m, n): 
      
    # return if i or j is out of bounds 
    if (i > n - 1 or j > m - 1): 
        return None
  
    # create a new node for current i and j 
    # and recursively allocate its down and 
    # right pointers 
    temp = Node(arr[i][j]) 
    temp.data = arr[i][j] 
    temp.right = construct(arr, i, j + 1, m, n) 
    temp.down = construct(arr, i + 1, j, m, n) 
    return temp 
  
# utility function for displaying 
# linked list data 
def display(head): 
      
    # pointer to move right 
    # Rp 
  
    # pointer to move down 
    Dp = head 
  
    # loop till node.down is not None 
    while (Dp): 
        Rp = Dp 
  
        # loop till node.right is not None 
        while (Rp): 
            print(Rp.data, end = " ") 
            Rp = Rp.right 
          
        print() 
        Dp = Dp.down 
      
# Driver Code 
if __name__=='__main__':  
    # 2D matrix 
    arr = [[ 1, 2, 3 ], 
           [ 4, 5, 6 ], 
           [ 7, 8, 9 ]] 
  
    m, n = 3, 3
    head = construct(arr, 0, 0, m, n) 
    display(head) 
      
# This code is contributed by AbhiThakur 

