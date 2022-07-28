

# Python program to implement above approach 
  
# Function to print the array elements 
def printArray(N, arr) : 
  
    for i in range (0, N) : 
        print(arr[i], end=" ") 
  
    print() 
  
  
# Function to replace all elements with absolute 
# difference of absolute sums of positive 
# and negatve elements 
def replacedArray(N, arr) : 
  
      
    pos_sum = 0
    neg_sum = 0
  
    for i in range (N - 1,-1, -1) :  
  
        # calculate differenbce of both sums 
        diff = abs(pos_sum) - abs(neg_sum) 
  
        # if i-th element is positive, 
        # add it to positive sum 
        if (arr[i] > 0) : 
            pos_sum = pos_sum + arr[i] 
  
        # if i-th element is negative, 
        # add it to negative sum 
        else : 
            neg_sum = neg_sum + arr[i] 
  
        # replace i-th elements with 
        # absolute difference 
        arr[i] = abs(diff) 
  
# Driver Code 
  
N = 5
arr = [ 1, -1, 2, 3, -2 ] 
replacedArray(N, arr) 
printArray(N, arr) 
  
N = 6
arr1 = [ -3, -4, -2, 5, 1, -2 ] 
replacedArray(N, arr1) 
printArray(N, arr1) 
  
# This code is contributed by ihritik 

