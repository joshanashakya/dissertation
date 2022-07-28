

# Python3 implementation of the approach 
  
# Function that return true if 
# a symmetric is possible with 
# the elements of the array 
def isPlusPossible(arr, n): 
  
    # Map to store the frequency 
    # of the array elements 
    mp = dict() 
  
    # Traverse through array elements and 
    # count frequencies 
    for i in range(n): 
        mp[arr[i]] = mp.get(arr[i], 0) + 1
  
    foundModOne = False
  
    # For every unique element 
    for x in mp: 
        element = x 
        frequency = mp[x] 
  
        if (frequency % 4 == 0): 
            continue
        if (frequency % 4 == 1): 
              
            # Element has already been found 
            if (foundModOne == True): 
                return False
            foundModOne = True
              
        # The frequency of the element 
        # something other than 0 and 1 
        else: 
            return False
    return True    
  
# Driver code 
arr = [1, 1, 1, 1, 2, 2, 2, 3, 2] 
n = len(arr) 
  
if (isPlusPossible(arr, n)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Mohit Kumar 

