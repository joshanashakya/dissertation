

# Python3 implementation of  
# the above approach 
def distinct(arr): 
    count = 0
  
    # if array has only one element, return 1 
    if len(arr) == 1: 
        return 1
      
    for i in range(0, len(arr) - 1): 
  
        # For first element compare 
        # with only next element 
        if(i == 0): 
            if(arr[i] != arr[i + 1]): 
                count += 1
  
        # For remaining elements compare with 
        # both prev and next elements 
        elif(i > 0 & i < len(arr) - 1): 
            if(arr[i] != arr[i + 1] or 
               arr[i] != arr[i - 1]): 
                count += 1
  
    # For last element compare  
    # with only prev element 
    if(arr[len(arr) - 1] != arr[len(arr) - 2]): 
        count += 1
    return count 
  
# Driver code 
arr = [0, 0, 0, 0, 0, 1, 0] 
  
print(distinct(arr)) 
  
# This code is contributed by Mohit Kumar 

