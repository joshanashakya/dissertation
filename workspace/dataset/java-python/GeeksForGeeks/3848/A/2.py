

# Python 3 implementation of the approach 
   
# Utility function to print the 
# elements of an array 
def printArray(arr, n): 
  
    for i in range( n): 
        print(arr[i],end= " ") 
     
# Function to generate the array 
# with the given operations 
def generateArr(arr, n): 
   
    # Base cases 
    if (n == 0): 
        return
    if (n == 1): 
        print( arr[0]) 
        return
      
   
    # To suffixMax[i] will store the maximum 
    # element in the subarray arr[i...n-1] 
    suffixMax=[0]*n 
    suffixMax[n - 1] = arr[n - 1] 
    for i in range(n - 2, -1 ,-1): 
        suffixMax[i] = max(arr[i], suffixMax[i + 1]) 
   
    # To store the minimum element on the left 
    minSoFar = arr[0] 
   
    # The first element has no 
    # element on its left 
    arr[0] = suffixMax[1] 
   
    # From the second element to the 
    # second last element 
    for i in range( 1,n - 1): 
   
        # Store a copy of the currene element 
        temp = arr[i] 
   
        # Absolute difference of the maximum 
        # element to the right and the 
        # minimum element to the left 
        arr[i] = abs(suffixMax[i + 1] - minSoFar) 
   
        # Update the minimum element so far 
        minSoFar = min(minSoFar, temp) 
     
   
    # The last element has no 
    # element on its right 
    arr[n - 1] = minSoFar 
   
    # Print the updated array 
    printArray(arr, n) 
  
  
# Driver code 
if __name__ == "__main__": 
    arr = [ 1, 5, 2, 4, 3 ] 
    n = len(arr) 
    generateArr(arr, n) 
  
# This code is contributed by chitranayal  
  

