

# Python3 implementation of the approach 
  
# Utility function to print the 
# elements of the array 
def printArr(arr, n): 
  
    for i in arr: 
        print(i, end = " ") 
  
# Function to generate and print 
# the required array 
def generateArr(A, n): 
    B = [0 for i in range(n)] 
  
    # For every element of the array 
    for i in range(n): 
  
        # To store the count of elements 
        # on the left that the current 
        # element divides 
        cnt = 0
        for j in range(i): 
            if (A[j] % A[i] == 0): 
                cnt += 1
  
        B[i] = cnt 
  
    # Print the generated array 
    printArr(B, n) 
  
# Driver code 
A = [3, 5, 1] 
n = len(A) 
  
generateArr(A, n) 
  
# This code is contributed by Mohit Kumar  

