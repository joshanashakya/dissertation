

# Python3 program to count all sub-arrays which 
# has all elements less than or equal to X 
  
def countSubArrays(arr, x, n ): 
    count = 0; 
    start = -1; end = -1; 
  
    for i in range(n): 
        if(arr[i] < x): 
            if(start == -1): 
  
                # create a new subArray 
                start = i; 
                end = i; 
            else: 
                  
                # append to existing subarray 
                end = i; 
        else: 
            if(start != -1 and end != -1): 
  
                # given start and end calculate 
                # all subarrays within this range 
                length = end - start + 1; 
                count = count + ((length * 
                                 (length + 1)) / 2); 
            start = -1; 
            end = -1; 
  
    if(start != -1 and end != -1): 
  
        # given start and end calculate all 
        # subarrays within this range 
        length = end - start + 1; 
        count = count + ((length * 
                         (length + 1)) / 2); 
  
    return count; 
  
# Driver code  
arr = [ 1, 5, 7, 8, 2, 3, 9 ]; 
x = 6; 
n = len(arr); 
print(countSubArrays(arr, x, n)); 
  
# This code is contributed  
# by PrinciRaj1992 

