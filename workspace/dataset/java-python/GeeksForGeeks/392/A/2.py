

# Python3 implementaion to find the sum 
# of all subarrays of size K 
   
# Function to find the sum of  
# all subarrays of size K 
def calcSum(arr, n, k): 
   
    # Loop to consider every  
    # subarray of size K 
    for i in range(n - k + 1): 
           
        # Initialize sum = 0 
        sum = 0
   
        # Calculate sum of all elements 
        # of current subarray 
        for j in range(i, k + i): 
            sum += arr[j] 
   
        # Prsum of each subarray 
        print(sum, end=" ") 
   
# Driver Code 
arr=[1, 2, 3, 4, 5, 6] 
n = len(arr) 
k = 3
  
# Function Call 
calcSum(arr, n, k) 
  
# This code is contributed by mohit kumar 29 

