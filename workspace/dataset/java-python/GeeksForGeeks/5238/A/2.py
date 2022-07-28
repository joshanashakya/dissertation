

# Python3 program to find the  
# number of boxes to be removed  
  
# Function to find the number 
# of boxes to be removed  
def totalBoxesRemoved(arr, n):  
  
    count = 0
      
    # Store height of previous pile  
    prev = arr[0]  
  
    # Start traversing the array  
    for i in range(1, n): 
          
        # if height of current pile  
        # is greater than previous pile  
        if (arr[i] > prev) :  
              
            # Increment count by  
            # difference of two heights  
            count += (arr[i] - prev)  
  
            # Update current height  
            arr[i] = prev  
  
            # Update prev for next  
            # iteration  
            prev = arr[i]  
          
        else : 
            # Update prev for next  
            # iteration  
            prev = arr[i]  
          
    return count 
  
# Driver code  
arr = [ 5, 4, 7, 3, 2, 1 ]  
  
n = len(arr)  
  
print(totalBoxesRemoved(arr, n))  
  
# This code is contributed  
# by Yatin Gupta 

