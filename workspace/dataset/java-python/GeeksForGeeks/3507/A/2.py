

# Python3 program to check if a given  
# tree is Binary Heap or not  
  
# Returns true if given level order  
# traversal is Min Heap.  
def isMinHeap(level, n): 
      
    # First non leaf node is at index  
    # (n/2-1). Check whether each parent 
    # is greater than child  
    for i in range(int(n / 2) - 1, -1, -1): 
          
        # Left child will be at index 2*i+1  
        # Right child will be at index 2*i+2  
        if level[i] > level[2 * i + 1]:  
            return False
  
        if 2 * i + 2 < n: 
              
            # If parent is greater than right child  
            if level[i] > level[2 * i + 2]: 
                return False
    return True
  
# Driver code  
if __name__ == '__main__': 
    level = [10, 15, 14, 25, 30]  
    n = len(level) 
    if isMinHeap(level, n):  
        print("True")  
    else: 
        print("False") 
  
# This code is contributed by PranchalK 

