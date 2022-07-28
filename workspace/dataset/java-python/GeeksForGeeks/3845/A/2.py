

# Python 3 implementation of the above approach 
  
# Function to find the maximum number 
# of 1's before 0 
def noOfMoves(arr,n): 
    cnt = 0
    maxCnt = 0
  
    # Traverse the array 
    for i in range(n): 
        # If value is 1 
        if (arr[i] == 1): 
            cnt += 1
        else: 
            # If consecutive 1 followed 
            # by 0, then update the maxCnt 
            if (cnt != 0): 
                maxCnt = max(maxCnt, cnt) 
                cnt = 0
  
    # Print the maximum consecutive 1's 
    # followed by 0 
    print(maxCnt) 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1] 
    N = len(arr) 
  
    # Function Call 
    noOfMoves(arr, N) 
    arr1 = [1, 0, 1, 0, 1, 0, 1, 0] 
    N = len(arr1) 
  
    # Function Call 
    noOfMoves(arr1, N) 
  
# This code is contributed by Surendra_Gangwar 

