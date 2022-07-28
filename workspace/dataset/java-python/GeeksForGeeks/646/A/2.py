

# Python 3 implementation of above approach 
  
# Function to find the element 
def findMinRemoval(arr, n): 
  
    # Value variable for storing the 
    # total value 
    value = 0
  
    # Declaring maximum value as zero 
    maximum = 0
  
    # If array contains on element 
    if (n == 1): 
        return 0
  
    for i in range( n): 
  
        # Storing the maximum value in  
        # temp variable 
        if (i != 0 and i != n - 1): 
            value = value + abs(arr[i] - arr[i + 1]) 
  
            # Adding the adjacent difference modulus 
            # values of removed element. Removing  
            # adjacent difference modulus value after 
            # removing element 
            temp = (abs(arr[i] - arr[i + 1]) + 
                    abs(arr[i] - arr[i - 1]) -
                    abs(arr[i - 1] - arr[i + 1])) 
          
        elif (i == 0): 
            value = value + abs(arr[i] - arr[i + 1]) 
            temp = abs(arr[i] - arr[i + 1]) 
      
        else: 
            temp = abs(arr[i] - arr[i - 1]) 
  
        maximum = max(maximum, temp) 
  
    # Returning total value-maximum value 
    return (value - maximum) 
  
# Drivers code 
if __name__ == "__main__": 
  
    arr = [ 1, 5, 3, 2, 10 ] 
    n = len(arr) 
  
    print(findMinRemoval(arr, n)) 
  
# This code is contributed by ita_c 

