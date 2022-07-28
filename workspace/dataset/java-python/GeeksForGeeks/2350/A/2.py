

# Python3 program to find index of zero  
# to be replaced by one to get longest  
# continuous sequence of ones.  
  
# Returns index of 0 to be replaced  
# with 1 to get longest continuous  
# sequence of 1s. If there is no 0  
# in array, then it returns -1.  
def maxOnesIndex(arr, n):  
  
    i = 0
  
    # To store count of ones on left  
    # side of current element zero  
    leftCnt = 0
  
    # To store count of ones on right  
    # side of current element zero  
    rightCnt = 0
  
    # Index of zero with maximum number  
    # of ones around it.  
    maxIndex = -1
  
    # Index of last zero element seen  
    lastInd = -1
  
    # Count of ones if zero at index  
    # maxInd is replaced by one.  
    maxCnt = 0
  
    while i < n:  
  
        # Keep incrementing count until  
        # current element is 1.  
        if arr[i] == 1:  
            rightCnt += 1
  
        else: 
            # If current zero element  
            # is not first zero element,  
            # then count number of ones  
            # obtained by replacing zero at  
            # index lastInd. Update maxCnt  
            # and maxIndex if required.  
            if lastInd != -1:  
                if rightCnt + leftCnt + 1 > maxCnt:  
                    maxCnt = leftCnt + rightCnt + 1
                    maxIndex = lastInd  
                  
            lastInd = i  
            leftCnt = rightCnt  
            rightCnt = 0
          
        i += 1
  
    # Find number of ones in continuous  
    # sequence when last zero element is  
    # replaced by one.  
    if lastInd != -1:  
        if leftCnt + rightCnt + 1 > maxCnt:  
            maxCnt = leftCnt + rightCnt + 1
            maxIndex = lastInd  
          
    return maxIndex  
  
# Driver code  
if __name__ == "__main__": 
  
    arr = [1, 1, 0, 0, 1, 0, 1, 
              1, 1, 0, 1, 1, 1]  
      
    n = len(arr)  
    print("Index of 0 to be replaced is", 
                    maxOnesIndex(arr, n))  
  
# This code is contributed  
# by Rituraj Jain  

