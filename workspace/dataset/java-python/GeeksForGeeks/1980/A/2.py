

# Python 3program to find one of the repeating 
# elements in a read only array 
from math import sqrt 
  
# Function to find one of the repeating 
# elements 
def findRepeatingNumber(arr, n): 
      
    # Size of blocks except the 
    # last block is sq 
    sq = sqrt(n) 
  
    # Number of blocks to incorporate 1 to 
    # n values blocks are numbered from 0 
    # to range-1 (both included) 
    range__= int((n / sq) + 1) 
  
    # Count array maintains the count for 
    # all blocks 
    count = [0 for i in range(range__)]  
  
    # Traversing the read only array and 
    # updating count 
    for i in range(0, n + 1, 1): 
          
        # arr[i] belongs to block number 
        # (arr[i]-1)/sq i is considered 
        # to start from 0 
        count[int((arr[i] - 1) / sq)] += 1
  
    # The selected_block is set to last 
    # block by default. Rest of the blocks 
    # are checked 
    selected_block = range__ - 1
    for i in range(0, range__ - 1, 1): 
        if (count[i] > sq): 
            selected_block = i 
            break
          
    # after finding block with size > sq 
    # method of hashing is used to find 
    # the element repeating in this block 
    m = {i:0 for i in range(n)} 
    for i in range(0, n + 1, 1): 
          
        # checks if the element belongs  
        # to the selected_block 
        if (((selected_block * sq) < arr[i]) and 
             (arr[i] <= ((selected_block + 1) * sq))): 
            m[arr[i]] += 1
  
            # repeating element found 
            if (m[arr[i]] > 1): 
                return arr[i] 
  
    # return -1 if no repeating element exists 
    return -1
  
# Driver Code 
if __name__ == '__main__': 
      
    # read only array, not to be modified 
    arr = [1, 1, 2, 3, 5, 4] 
  
    # array of size 6(n + 1) having 
    # elements between 1 and 5 
    n = 5
  
    print("One of the numbers repeated in the array is:", 
                             findRepeatingNumber(arr, n)) 
      
# This code is contributed by 
# Sahil_shelangia 

