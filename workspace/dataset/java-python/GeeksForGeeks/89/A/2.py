

# Python3 implementation to find the 
# subsequence with alternating sign 
# having maximum size and maximum sum. 
  
# Function to find the subsequence 
# with alternating sign having 
# maximum size and maximum sum. 
def findSubsequence(arr, n): 
    sign = [0]*n 
  
    # Find whether each element 
    # is positive or negative 
    for i in range(n): 
        if (arr[i] > 0): 
            sign[i] = 1
        else: 
            sign[i] = -1
  
    k = 0
    result = [0]*n 
  
    # Find the required subsequence 
    i = 0
    while i < n: 
  
        cur = arr[i] 
        j = i 
  
        while (j < n and sign[i] == sign[j]): 
  
            # Find the maximum element 
            # in the specified range 
            cur = max(cur, arr[j]) 
            j += 1
  
        result[k] = cur 
        k += 1
  
        i = j - 1
        i += 1
  
    # print the result 
    for i in range(k): 
        print(result[i],end=" ") 
  
# Driver code 
if __name__ == '__main__': 
    # array declaration 
    arr=[-4, 9, 4, 11, -5, -17, 9, -3, -5, 2] 
  
    # size of array 
    n = len(arr) 
  
    findSubsequence(arr, n) 
  
# This code is contributed by mohit kumar 29 

