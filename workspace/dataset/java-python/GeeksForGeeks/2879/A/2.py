

# Python3 program to find all 
# indices of a number 
def AllIndexesRecursive(input, x, start): 
      
    # If the start index reaches the 
    # length of the array, then 
    # return empty array 
    if (start == len(input)): 
        ans = [] # empty array 
        return ans 
  
    # Getting the recursive answer in 
    # smallIndex array 
    smallIndex = AllIndexesRecursive(input, x,  
                                     start + 1) 
  
    # If the element at start index is equal 
    # to x then 
    # (which is the answer of recursion) and then 
    # (which came through recursion) 
    if (input[start] == x): 
        myAns = [0 for i in range(len(smallIndex) + 1)] 
  
        # Put the start index in front 
        # of the array 
        myAns[0] = start 
        for i in range(len(smallIndex)): 
  
            # Shift the elements of the array 
            # one step to the right 
            # and putting them in 
            # myAns array 
            myAns[i + 1] = smallIndex[i] 
  
        return myAns 
    else: 
  
        # If the element at start index is not 
        # equal to x then just simply return the 
        # answer which came from recursion. 
        return smallIndex 
  
# Function to find all indices of a number 
def AllIndexes(input, x): 
  
    return AllIndexesRecursive(input, x, 0) 
  
# Driver Code 
arr = [ 1, 2, 3, 2, 2, 5 ] 
x = 2
  
output=AllIndexes(arr, x) 
  
# Printing the output array 
for i in output: 
    print(i, end = " ") 
  
# This code is contributed by Mohit Kumar 

