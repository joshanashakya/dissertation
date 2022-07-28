

# Python 3 implementation of the approach 
  
# Function to return the maximized median 
def getMaxMedian(arr, n, k): 
    size = n + k 
  
    # Sort the array 
    arr.sort(reverse = False) 
  
    # If size is even 
    if (size % 2 == 0): 
        median = (arr[int(size / 2) - 1] + 
                  arr[int(size / 2)]) / 2
        return median 
  
    # If size is odd 
    median = arr[int(size / 2)] 
    return median 
  
# Driver code 
if __name__ == '__main__': 
    arr = [3, 2, 3, 4, 2] 
    n = len(arr) 
    k = 2
    print(getMaxMedian(arr, n, k)) 
  
# This code is contributed by 
# Surendra_Gangwar 

