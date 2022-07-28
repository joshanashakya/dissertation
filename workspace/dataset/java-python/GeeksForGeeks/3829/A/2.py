

# Python3 program to find length of longest bitonic  
# subarray. O(n) time and O(1) extra space 
  
# Function to find length of longest  
# bitonic subarray 
def bitonic(A, n): 
  
    # if A is empty 
    if (n == 0): 
        return 0; 
          
    # initializing max_len 
    maxLen = 1; 
          
    start = 0; 
    nextStart = 0; 
          
    j = 0; 
    while (j < n - 1): 
      
        # look for end of ascent      
        while (j < n - 1 and A[j] <= A[j + 1]): 
            j = j + 1; 
              
        # look for end of descent  
        while (j < n - 1 and A[j] >= A[j + 1]): 
                  
            # adjusting nextStart; 
            # this will be necessarily executed  
            # at least once, when we detect the 
            # start of the descent 
            if (j < n - 1 and A[j] > A[j + 1]): 
                nextStart = j + 1; 
                  
            j = j + 1; 
          
        # updating maxLen, if required 
        maxLen = max(maxLen, j - (start - 1)); 
              
        start = nextStart; 
      
    return maxLen; 
  
# Driver Code 
A = [12, 4, 78, 90, 45, 23]; 
n = len(A); 
print("Length of max length Bitonic Subarray is",  
                                  bitonic(A, n)); 
  
# This code is contributed by Shivi_Aggarwal 

