

# Python3 implementation of the approach 
  
# Utility function to print 
# the contents of an array 
def printArr(arr, n): 
  
    for i in range(0, n): 
        print(arr[i], end = "") 
  
# A comparison function that return true 
# if 'AB' is smaller than 'BA' when 
# we concatenate two numbers 'A' and 'B' 
# For example, it will return true if 
# we pass 12 and 24 as arguments. 
# This function will be used by sort() function 
def compare(num1, num2): 
  
    # Convert first number to string format 
    A = str(num1) 
  
    # Convert second number to string format 
    B = str(num2) 
  
    # Check if 'AB' is smaller or 'BA' 
    # and return bool value since 
    # comparison operator '<=' returns 
    # true or false 
    return int(A + B) <= int(B + A) 
      
def sort(arr): 
      
    for i in range(len(arr)): 
        for j in range(i + 1, len(arr)): 
              
            if compare(arr[i], arr[j]) == False: 
                arr[i], arr[j] = arr[j], arr[i] 
  
# Function to print the arrangement 
# with the smallest value 
def printSmallest(N, arr): 
  
    # If we pass the name of the comparison 
    # function it will sort the array 
    # according to the compare function 
    sort(arr) 
  
    # Print the sorted array 
    printArr(arr, N) 
  
# Driver code 
if __name__ == "__main__": 
  
    arr = [5, 6, 2, 9, 21, 1] 
    N = len(arr) 
    printSmallest(N, arr) 
  
# This code is contributed by Rituraj Jain 

