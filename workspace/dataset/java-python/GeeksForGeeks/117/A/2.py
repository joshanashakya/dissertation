

# Python3 program to find the sum between L-R 
# range by creating the array 
# Naive Approach 
  
# Function to find the sum between L and R 
def rangesum(n, l, r): 
  
    # array created 
    arr = [0] * n; 
  
    # fill the first half of array 
    c = 1; i = 0; 
    while (c <= n): 
        arr[i] = c; 
        i += 1; 
        c += 2; 
      
    # fill the second half of array 
    c = 2; 
    while (c <= n): 
        arr[i] = c; 
        i += 1; 
        c += 2; 
  
    sum = 0; 
  
    # find the sum between range 
    for i in range(l - 1, r, 1): 
        sum += arr[i]; 
      
    return sum; 
  
# Driver Code 
if __name__ == '__main__': 
  
    n = 12; 
    l, r = 1, 11; 
    print(rangesum(n, l, r)); 
      
# This code contributed by PrinciRaj1992 

