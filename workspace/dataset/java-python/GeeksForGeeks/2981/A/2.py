

# Python 3 program to count number  
# of strictly decreasing subarrays 
# in O(n) time. 
  
# Function to count the number of 
# strictly decreasing subarrays 
def countDecreasing(A, n): 
  
    cnt = 0 # Initialize result 
  
    # Initialize length of current 
    # decreasing subarray 
    len = 1
  
    # Traverse through the array 
    for i in range (n - 1) : 
          
        # If arr[i+1] is less than arr[i], 
        # then increment length 
        if (A[i + 1] < A[i]): 
            len += 1
  
        # Else Update count and  
        # reset length 
        else : 
            cnt += (((len - 1) * len) // 2); 
            len = 1
      
    # If last length is more than 1 
    if (len > 1): 
        cnt += (((len - 1) * len) // 2) 
  
    return cnt 
  
# Driver Code 
if __name__=="__main__": 
  
    A = [ 100, 3, 1, 13 ] 
    n = len(A) 
  
    print (countDecreasing(A, n)) 
  
# This code is contributed by ChitraNayal 

