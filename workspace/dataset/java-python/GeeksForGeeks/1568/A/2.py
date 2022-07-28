

# Python3 program to count number of non 
# increasing subarrays 
def countNonIncreasing(arr, n): 
      
    # Initialize result 
    cnt = 0; 
  
    # Initialize length of current  
    # non-increasing subarray 
    len = 1; 
  
    # Traverse through the array 
    for i in range(0, n - 1): 
  
        # If arr[i+1] is less than 
        # or equal to arr[i], 
        # then increment length 
        if (arr[i + 1] >= arr[i]): 
            len += 1; 
  
        # Else Update count and reset length 
        else: 
            cnt += (((len + 1) * len) / 2); 
            len = 1; 
              
    # If last length is more than 1 
    if (len > 1): 
        cnt += (((len - 1) * len) / 2); 
  
    return int(cnt); 
  
# Driver code 
if __name__ == '__main__': 
    arr = [5, 2, 3, 7, 1, 1]; 
    n = len(arr); 
  
    print(countNonIncreasing(arr, n)); 
  
# This code contributed by PrinciRaj1992 

