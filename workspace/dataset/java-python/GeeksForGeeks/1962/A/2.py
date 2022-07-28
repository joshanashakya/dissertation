

# Python 3 program to count maximum consecutive 
# 1's in a binary circular array 
  
# Function to return the count of  
# maximum consecutive 1's in a  
# binary circular array 
def getMaxLength(arr, n): 
      
   
    # Starting index 
    start = 0
      
    # To store the maximum length of the  
    # prefix of the given array with all 1s 
    preCnt = 0
    while(start < n and arr[start] == 1): 
        preCnt = preCnt + 1
        start = start + 1
      
    # Ending index 
    end = n - 1
      
    # To store the maximum length of the  
    # suffix of the given array with all 1s 
    suffCnt = 0
    while(end >= 0 and arr[end] == 1): 
        suffCnt = suffCnt + 1
        end = end - 1
      
    # The array contains all 1s 
    if(start > end): 
        return n 
      
    # Find the maximum length subarray  
    # with all 1s from the remaining not  
    # yet traversed subarray 
    midCnt = 0
      
    i = start 
  
    # To store the result for middle 1s 
    result = 0
  
    while(i <= end): 
        if(arr[i] == 1): 
            midCnt = midCnt + 1
            result = max(result, midCnt) 
        else: 
            midCnt = 0
        i = i + 1
      
    # (preCnt + suffCnt) is the subarray when  
    # the given array is assumed to be circular 
    return max(result, preCnt + suffCnt) 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 1, 0, 0, 1, 0,  
        1, 0, 1, 1, 1, 1] 
    n = len(arr) 
    print(getMaxLength(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

