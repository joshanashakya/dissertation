

# Python program to 
# find minimum swaps 
# required to group 
# all 1's together 
  
# Function to find minimum swaps 
# to group all 1's together 
def minSwaps(arr,n): 
      
    noOfOnes = 0
   
    # find total number of 
    # all in the array 
    for i in range(n): 
        if (arr[i] == 1): 
            noOfOnes=noOfOnes+1
    
   
    # length of subarray to check for 
    x = noOfOnes 
   
    maxOnes = -2147483648
   
    # array to store number of 1's upto 
    # ith index 
    preCompute={} 
   
    # calculate number of 1's upto ith 
    # index and store in the 
    # array preCompute[] 
    if (arr[0] == 1): 
        preCompute[0] = 1
    for i in range(1,n): 
        if (arr[i] == 1): 
            preCompute[i] = preCompute[i - 1] + 1
        else: 
            preCompute[i] = preCompute[i - 1] 
    
   
    # using sliding window 
    # technique to find 
    # max number of ones in 
    # subarray of length x 
    for i in range(x-1,n): 
        if (i == (x - 1)):  
            noOfOnes = preCompute[i] 
        else: 
            noOfOnes = preCompute[i] - preCompute[i - x] 
       
        if (maxOnes < noOfOnes): 
            maxOnes = noOfOnes 
    
   
    # calculate number of zeros in subarray 
    # of length x with maximum number of 1's 
    noOfZeroes = x - maxOnes 
   
    return noOfZeroes 
    
# Driver code 
  
a = [1, 0, 1, 0, 1] 
n = len(a) 
  
print(minSwaps(a, n)) 
  
# This code is contributed 
# by Anant Agarwal. 

