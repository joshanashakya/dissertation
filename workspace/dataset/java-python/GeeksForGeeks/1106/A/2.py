

# Python3 program to find 
# if product of every pair 
# is present in array. 
  
# Returns True if product 
# of every pair in arr[] is  
# present in arr[] 
def checkArray(arr, n): 
  
    # variable to store number 
    # of zeroes, ones, minus  
    # one and other numbers. 
    zero = 0; one = 0;  
    minusone = 0; other = 0
    for i in range(0, n): 
      
        # incrementing the  
        # variable values 
        if (arr[i] == 0): 
            zero += 1
        elif (arr[i] == 1): 
            one += 1
        elif (arr[i] == -1): 
            minusone += 1
        else: 
            other += 1
      
    # checking the conditions 
    if (other > 1): 
        return false 
    elif (other != 0 and 
          minusone != 0): 
        return false 
    elif (minusone >= 1 and 
          one == 0): 
        return false 
  
    return True
  
  
# Driver Code 
arr = [0, 1, 1, 10] 
n = len(arr) 
if (checkArray(arr, n)): 
    print("Yes") 
else: 
    print("No") 
      
# This code is contributed 
# by Smitha Dinesh Semwal. 

