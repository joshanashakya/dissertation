

# Python3 implementation 
  
# Function to print 1 if the 
# it is possible to make all array 
# element equal to 1 else 0 
def checkAllOnes(arr, n, k): 
  
    brr = [0 for i in range(n)] 
  
    # Iterating over the array 
    for i in range(n): 
  
        # If element is 1 
        if (arr[i] == 1): 
  
            h = k + 1
            j = i 
  
            # Put b[j...j-k] = 0 
            while (j >= 0 and (h)): 
                brr[j] = 1
                h -= 1
                j -= 1
  
            h = k + 1
            j = i 
  
            # Put b[j...j+k] = 0 
            while (j < n and (h)): 
                brr[j] = 1
                j += 1
                h -= 1
  
    flag = 0
  
    # If any value in aux 
    # array equal to 0 
    # then set flag 
    for i in range(n): 
        if (brr[i] == 0): 
            flag = 1
            break
  
    # If flag is set this 
    # means array after 
    # conversion contains 
    # 0 so pr0 
    if (flag == 1): 
        print("0") 
  
    # else pr1 
    else: 
        print("1") 
  
# Driver Code 
arr = [1, 0, 1, 0] 
k = 2
n = len(arr) 
  
checkAllOnes(arr, n, k) 
  
# This code is contributed by Mohit Kumar 

