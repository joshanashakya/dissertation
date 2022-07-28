

# Python 3 implementation of the approach 
  
# Function to return the count of elements 
# from the array which are greater than k 
def countGreater(arr, n, k): 
    l = 0
    r = n - 1
  
    # Stores the index of the left most element 
    # from the array which is greater than k 
    leftGreater = n 
  
    # Finds number of elements greater than k 
    while (l <= r): 
        m = int(l + (r - l) / 2) 
  
        # If mid element is greater than 
        # k update leftGreater and r 
        if (arr[m] > k): 
            leftGreater = m 
            r = m - 1
  
        # If mid element is less than 
        # or equal to k update l 
        else: 
            l = m + 1
  
    # Return the count of elements  
    # greater than k 
    return (n - leftGreater) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [3, 3, 4, 7, 7, 7, 11, 13, 13] 
    n = len(arr) 
    k = 7
  
    print(countGreater(arr, n, k)) 
# This code is contributed by 
# Surendra_Gangwar 

