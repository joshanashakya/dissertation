

# Python code to find longest running  
# sequence of positive integers. 
  
def getLongestSeq(a, n): 
    maxIdx = 0
    maxLen = 0
    currLen = 0
    currIdx = 0
    for k in range(n): 
        if a[k] > 0: 
            currLen +=1
  
            # New sequence, store 
            # beginning index. 
            if currLen == 1: 
                currIdx = k 
        else: 
            if currLen > maxLen: 
                maxLen = currLen 
                maxIdx = currIdx 
            currLen = 0
              
    if maxLen > 0: 
        print('Index : ',maxIdx,',Length : ',maxLen,) 
    else: 
        print("No positive sequence detected.") 
  
# Driver code 
arr = [ 1, 2, -3, 2, 3, 4, -6,  
        1, 2, 3, 4, 5, -8, 5, 6]  
n = len(arr) 
getLongestSeq(arr, n) 
  
# This code is contributed by "Abhishek Sharma 44" 

