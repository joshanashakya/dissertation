

# python 3 program to count all sub-arrays which 
# has all elements less than or equal to X 
  
# function to count all sub-arrays which 
# has all elements less than or equal to X 
def countSubArrays(arr, n, x): 
      
    # variable to keep track of length  
    # of subarrays with all 1s 
    len = 0
  
    # variable to keep track of  
    # all subarrays 
    count = 0
  
    # binary array of same size 
    binaryArr = [0 for i in range(n)] 
  
    # creating binary array 
    for i in range(0, n, 1): 
        if (arr[i] <= x): 
            binaryArr[i] = 1
        else: 
            binaryArr[i] = 0
  
    # start traversing the binary array 
    for i in range(0, n, 1): 
          
        # once we find the first 1,  
        # keep checking for number  
        # of consecutive 1s 
        if (binaryArr[i] == 1): 
            for j in range(i + 1, n, 1): 
                if (binaryArr[j] != 1): 
                    break
  
            # calculate length of the  
            # subarray with all 1s 
            len = j - i 
  
            # increment count 
            count += (len) * (int)((len + 1) / 2) 
  
            # initialize i to j 
            i = j 
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 5, 7, 8, 2, 3, 9] 
    x = 6
    n = len(arr) 
    print(int(countSubArrays(arr, n, x))) 
      
# This code is contributed by 
# Surendra_Gangwar 

