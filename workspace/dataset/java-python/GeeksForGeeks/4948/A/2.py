

# Python 3 implementation of the approach 
  
# Function to return the number  
# to be added 
def getNumToAdd(arr, n): 
    arr.sort(reverse = False) 
    d = arr[1] - arr[0] 
    numToAdd = -1
    numAdded = False
  
    for i in range(2, n, 1): 
        diff = arr[i] - arr[i - 1] 
  
        # If difference of the current consecutive  
        # elements is different from the common 
        # difference 
        if (diff != d): 
              
            # If number has already been chosen  
            # then it's not possible to add  
            # another number 
            if (numAdded): 
                return -1
  
            # If the current different is twice  
            # the common difference then a  
            # number can be added midway from  
            # current and previous element 
            if (diff == 2 * d): 
                numToAdd = arr[i] - d 
  
                # Number has been chosen 
                numAdded = True
          
            # It's not possible to maintain 
            # the common difference 
            else: 
                return -1
      
    # Return last element + common difference 
    # if no element is chosen and the array 
    # is already in AP 
    if (numToAdd == -1): 
        return (arr[n - 1] + d) 
  
    # Else return the chosen number 
    return numToAdd 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 3, 5, 7, 11, 13, 15] 
    n = len(arr) 
    print(getNumToAdd(arr, n)) 
  
# This code is contributed 
# mohit kumar 29 

