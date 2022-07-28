

# Python3 program to replace every  
# element of the array with the 
# element that appears after it  
  
# Function to print the array after  
# replacing every element of the  
# array with the element that appears 
# after it  
def updateArray(arr, n): 
  
    # Update array  
    for i in range (n - 1): 
        arr[i] = arr[i + 1] 
  
    # Change the last element to -1  
    arr[n - 1] = -1
  
    # Print the updated array  
    for i in range( n): 
        print (arr[i], end = " ") 
  
# Driver Code  
if __name__ == "__main__": 
  
    arr = [ 5, 1, 3, 2, 4 ] 
    N = len(arr) 
    updateArray(arr, N) 
  
# This code is contributed  
# by ChitraNayal 

