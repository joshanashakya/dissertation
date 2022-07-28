

# Python 3 program to find minimum 
# number of move-to-front moves 
# to arrange items in sorted order. 
  
# Calculate minimum number of moves  
# to arrange array in increasing order. 
def minMoves(arr, n): 
      
    # Since we traverse array from end,  
    # expected item is initially n 
    expectedItem = n 
  
    # Taverse array from end 
    for i in range(n - 1, -1, -1): 
          
        # If current item is at its 
        # correct position, decrement 
        # the expectedItem (which also 
        # means decrement in minimum 
        # number of moves) 
        if (arr[i] == expectedItem): 
            expectedItem -= 1
    return expectedItem 
      
# Driver Code 
arr = [4, 3, 2, 1] 
n = len(arr) 
print(minMoves(arr, n)) 
  
# This code is contributed 29AjayKumar 

