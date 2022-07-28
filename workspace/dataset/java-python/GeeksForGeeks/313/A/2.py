

# Python3 program to print the length of  
# the longest subarray with all elements  
# greater than X 
  
# Function to count number of segments 
def longestSubarray(a, n, x): 
    count = 0
    length = 0
  
    # Iterate in the array 
    for i in range(n): 
          
        # check if array element greater 
        # then X or not 
        if (a[i] > x): 
            count += 1
        else: 
            length = max(length, count) 
            count = 0
              
    # After iteration complete 
    # check for the last segment 
    if (count > 0): 
        length = max(length, count) 
    return length 
  
# Driver Code 
if __name__ == '__main__': 
    a = [ 8, 25, 10, 19, 19, 
             18, 20, 11, 18 ] 
    n = len(a) 
    k = 13
    print(longestSubarray(a, n, k)) 
  
# This code is contributed by 29AjayKumar 

