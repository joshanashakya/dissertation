

# Python 3 program to find the size of  
# the smallest subset with the 
# maximum value of Bitwise OR  
  
# Function to find the size of the smallest 
# subset with the maximum value of Bitwise OR 
def findMaxOR(arr, n) : 
      
    # sort the array in decreasing 
    # order 
    arr.sort(reverse = True) 
  
    # Maximum element in the set 
    maxOR = arr[0] 
  
    count = 1
  
    for i in range(1, n) : 
          
        # if bitwise or with the next element  
        # is greater than current value 
        if ((maxOR | arr[i]) > maxOR) : 
              
            # then add this element in the set and 
            # update the current maxOR value 
            maxOR = maxOR | arr[i]; 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__" : 
      
    arr = [ 5, 1, 3, 4, 2 ] 
    n = len(arr) 
  
    print(findMaxOR(arr, n))  
  
# This code is contributed by Ryuga 

