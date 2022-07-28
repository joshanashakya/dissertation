

# Python3 program to prthe array 
# after K operations 
  
# Function to prthe array 
# after K operations 
def printArray(A, n, K): 
  
    # Variables to store the minimum and 
    # the maximum elements of the array 
    minEle = 10**9
    maxEle = -10**9
  
    # Loop to find the minimum and the 
    # maximum elements of the array 
    for i in range(n): 
        minEle = min(minEle, A[i]) 
        maxEle = max(maxEle, A[i]) 
  
    # If K is not equal to 0 
    if (K != 0): 
  
        # If K is odd 
        if (K % 2 == 1): 
  
            # Replace every element with 
            # max - arr[i] 
            for i in range(n): 
                A[i] = maxEle - A[i] 
  
        # If K is even 
        else: 
  
            # Replace every element with 
            # A[i] - min 
            for i in range(n): 
                A[i] = A[i] - minEle 
  
    # Printing the array after K operations 
    for i in A: 
        print(i, end=" ") 
  
# Driver code 
if __name__ == '__main__': 
    arr=[4, 8, 12, 16] 
    K = 4
    N = len(arr) 
  
    printArray(arr, N, K) 
  
# This code is contributed by mohit kumar 29 

