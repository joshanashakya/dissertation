

# Python 3 program to find  
# minimum number of operations  
# required to make all array 
# elements zero  
  
# Function to find minimum number  
# of operations required to make  
# all array elements zero  
def minimumChanges(arr, n) : 
  
    # It will maintain total 
    # changes required  
    changes = 0
      
    i = 0
      
    while i < n : 
  
        # Check for the first 1 
        if arr[i] == 1 : 
  
            j = i + 1
  
            # Check for number of  
            # consecutive 1's  
            while j < n: 
  
                if arr[j] == 0 : 
                    break
  
                j += 1
  
            # Increment i to the position  
            # of last consecutive 1  
            i = j - 1
              
            changes += 1
  
        i += 1
          
    return changes 
  
# Driver code      
if __name__ == "__main__" : 
  
    arr = [ 1, 1, 0, 0, 0, 1, 0, 1, 1] 
    n = len(arr) 
  
    print("Minimum operations:",  
           minimumChanges(arr, n)) 
  
# This code is contributed by ANKITRAI1 

