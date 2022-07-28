

# Python 3 implementation of the approach  
  
# Utility function to print  
# the contents of an array  
def printArray(arr, n) : 
  
    for i in range(n) : 
        print(arr[i], end = " ");  
  
# Function to remove the minimum  
# value of the array from every  
# element of the array  
def removeMin(arr, n) :  
      
    minVal = arr[0];  
  
    # Get the minimum value from 
    # the array  
    for i in range(1, n) : 
        minVal = min(minVal, arr[i]);  
  
    # Remove the minimum value from  
    # every element of the array  
    for i in range(n) : 
        arr[i] = arr[i] - minVal;  
  
# Function to remove every element  
# of the array from the maximum 
# value of the array  
def removeFromMax(arr, n) : 
      
    maxVal = arr[0];  
  
    # Get the maximum value from 
    # the array  
    for i in range(1, n) : 
        maxVal = max(maxVal, arr[i]);  
  
    # Remove every element of the  
    # array from the maximum value  
    # of the array  
    for i in range(n) : 
        arr[i] = maxVal - arr[i];  
  
# Function to print the modified   
# array after k operations  
def modifyArray(arr, n, k) :  
  
    # If k is odd then remove the minimum  
    # element of the array from every 
    # element of the array  
    if (k % 2 == 0) : 
        removeMin(arr, n);  
  
    # Else remove every element of  
    # the array from the maximum  
    # value from the array  
    else : 
        removeFromMax(arr, n);  
  
    # Print the modified array  
    printArray(arr, n);  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [ 4, 8, 12, 16 ];  
    n = len(arr) 
      
    k = 2;  
    modifyArray(arr, n, k);  
  
# This code is contributed by Ryuga 

