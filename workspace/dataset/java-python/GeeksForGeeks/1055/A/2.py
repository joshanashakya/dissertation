

# python implementation of efficient approach 
# to count valid pairs. 
  
# returns the number of valid pairs 
def CountPairs (arr,n): 
      
    # traversing the array, counting the 
    # number of 2s and greater than 2 
    # in array 
    twoCount = 0
    twoGrCount = 0
    for i in range(0, n): 
          
        if (arr[i] == 2): 
            twoCount += 1
        elif (arr[i] > 2): 
            twoGrCount += 1
      
    return ((twoCount * twoGrCount)  
      + (twoGrCount * (twoGrCount - 1)) / 2) 
  
# Driver function 
arr = [3, 4, 5] 
n = len(arr) 
print( CountPairs(arr, n)) 
  
# This code is contributed by Sam007. 

