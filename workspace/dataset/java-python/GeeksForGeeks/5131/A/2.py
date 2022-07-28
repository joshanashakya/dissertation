

# Python 3 Program to find 
# mean absolute deviation  
# of given array. 
  
# Function to find mean 
# of the array elements. 
def Mean(arr, n) : 
  
    # Calculate sum of all 
    # elements. 
    sm = 0
      
    for i in range(0, n) : 
        sm = sm + arr[i] 
    return sm // n 
      
# Function to find mean  
# absolute deviation of  
# given elements. 
def meanAbsoluteDeviation(arr, n) : 
      
    # Calculate the sum of  
    # absolute deviation  
    # about mean. 
    absSum = 0
    for i in range(0, n ): 
        absSum = absSum + abs(arr[i] -
                         Mean(arr, n)) 
  
    # Return mean absolute  
    # deviation about mean. 
    return absSum / n 
  
# Driver function. 
arr = [ 10, 15, 15, 17, 18, 21 ] 
n = len(arr) 
  
print(meanAbsoluteDeviation(arr, n)) 
  
# This code is contributed by Nikita Tiwari. 

