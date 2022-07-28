

# Python code for minimum  
# swaps required to group  
# all 1's together 
  
# Function to find minimum  
# swaps to group all 1's 
# together 
def minSwaps(arr, n) : 
  
    numberOfOnes = 0
      
    # find total number of  
    # all 1's in the array 
    for i in range(0, n) : 
  
        if (arr[i] == 1) : 
            numberOfOnes = numberOfOnes + 1
      
    # length of subarray 
    # to check for 
    x = numberOfOnes 
      
    count_ones = 0
    maxOnes = 0
      
    # Find 1's for first  
    # subarray of length x 
    for i in range(0, x) : 
  
        if(arr[i] == 1) : 
            count_ones = count_ones + 1
          
    maxOnes = count_ones 
          
    # using sliding window  
    # technique to find 
    # max number of ones in 
    # subarray of length x 
    for i in range(1, (n - x + 1)) : 
          
        # first remove leading 
        # element and check 
        # if it is equal to 1  
        # then decreament the  
        # value of count_ones by 1 
        if (arr[i - 1] == 1) :  
            count_ones = count_ones - 1
          
        # Now add trailing  
        # element and check 
        # if it is equal to 1  
        # Then increment  
        # the value of count_ones by 1 
        if(arr[i + x - 1] == 1) : 
            count_ones = count_ones + 1
          
        if (maxOnes < count_ones) : 
                maxOnes = count_ones 
      
    # calculate number of  
    # zeros in subarray 
    # of length x with  
    # maximum number of 1's 
    numberOfZeroes = x - maxOnes 
      
    return numberOfZeroes 
  
# Driver Code 
a = [0, 0, 1, 0, 1, 1, 0, 0, 1] 
n = 9
print (minSwaps(a, n))  
  
# This code is contributed  
# by Manish Shaw(manishshaw1) 

