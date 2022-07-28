

# Python3 program to print the length of the 
# longest subarray such that adjacent elements 
# of the subarray have at least one digit in 
# common 
import math 
  
# Function to print the longest subarray 
# such that adjacent elements have at least 
# one digit in common 
def longestSubarray(arr, n): 
  
    i = d = 0; 
  
    # To mark presence of digit in current 
    # element. 
    HASH1 = [[0 for x in range(10)]  
                for y in range(2)]; 
  
    # To store current row. 
    currRow = 0; 
  
    # To store maximum length subarray length. 
    maxLen = 1; 
  
    # To store current subarray length. 
    len1 = 0; 
  
    # To store current array element. 
    tmp = 0; 
  
    # Mark the presence of digits 
    # of first element. 
    tmp = arr[0]; 
    while (tmp > 0):  
        HASH1[0][tmp % 10] = 1; 
        tmp = tmp // 10; 
  
    currRow = 1; 
  
    # Find digits of each element and check  
    # if adjacent elements have common digit 
    # and update len. 
    for i in range(0, n):  
        tmp = arr[i]; 
  
        for d in range(0, 10): 
            HASH1[currRow][d] = 0; 
  
        # Find all digits in element. 
        while (tmp > 0):  
            HASH1[currRow][tmp % 10] = 1; 
            tmp = tmp // 10; 
  
        # Find common digit in adjacent element. 
        for d in range(0, 10):  
            if (HASH1[currRow][d] and
                HASH1[1 - currRow][d]): 
                len1 += 1; 
                break; 
  
        # If no common digit is found a new subarray 
        # has to start from current element. 
        if (d == 10):  
            len1 = 1; 
  
        maxLen = max(maxLen, len1); 
  
        currRow = 1 - currRow; 
  
    return maxLen; 
  
# Driver Code 
arr = [ 11, 22, 33, 44, 54, 56, 63 ]; 
n = len(arr); 
  
print(longestSubarray(arr, n)); 
  
# This code is contributed by chandan_jnu 

