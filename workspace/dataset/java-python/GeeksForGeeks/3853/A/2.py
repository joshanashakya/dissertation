

# Python 3 implementation of above idea 
  
# Function to return the index of the  
# rightmost minimum element from the array 
def getRightMin(arr, n): 
      
    # First element is the minimum  
    # in a sorted array 
    min = arr[0] 
    rightMin = 0
    i = 1
    while (i < n): 
          
        # While the elements are equal to  
        # the minimum update rightMin 
        if (arr[i] == min): 
            rightMin = i 
  
        i *= 2
      
    i = rightMin + 1
  
    # Final check whether there are any  
    # elements which are equal to the minimum 
    while (i < n and arr[i] == min): 
        rightMin = i 
        i += 1
      
    return rightMin 
  
# Function to return the index of the  
# leftmost maximum element from the array 
def getLeftMax(arr, n): 
      
    # Last element is the maximum  
    # in a sorted array 
    max = arr[n - 1] 
    leftMax = n - 1
    i = n - 2
    while (i > 0): 
          
        # While the elements are equal to 
        # the maximum update leftMax 
        if (arr[i] == max): 
            leftMax = i 
  
        i = int(i / 2) 
          
    i = leftMax - 1
  
    # Final check whether there are any  
    # elements which are equal to the maximum 
    while (i >= 0 and arr[i] == max): 
        leftMax = i 
        i -= 1
      
    return leftMax 
  
# Driver code 
if __name__ == '__main__': 
    arr = [0, 0, 1, 2, 5, 5, 6, 8, 8]  
    n = len(arr) 
  
    # First element is the leftmost  
    # minimum in a sorted array 
    print("Minimum left :", 0) 
    print("Minimum right :", getRightMin(arr, n)) 
    print("Maximum left :", getLeftMax(arr, n)) 
  
    # Last element is the rightmost maximum  
    # in a sorted array 
    print("Maximum right :", (n - 1)) 
  
# This code is contributed by 
# Surendra_Gangwar 

