

# Python3 implementation of the above approach.  
  
# Function to do a binary search  
# on a given range.  
def usingBinarySearch(start, end, N, S) :  
  
    if (start >= end) : 
        return start;  
          
    mid = start + (end - start) // 2;  
  
    # Total sum is the sum of N numbers.  
    totalSum = (N * (N + 1)) // 2;  
  
    # Sum until mid  
    midSum = (mid * (mid + 1)) // 2;  
  
    # If remaining sum is < the required value,  
    # then the required number is in the right half  
    if ((totalSum - midSum) <= S) : 
  
        return usingBinarySearch(start, mid, N, S);  
      
    return usingBinarySearch(mid + 1, end, N, S);  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 5;  
    S = 11;  
  
    print(N - usingBinarySearch(1, N, N, S) + 1) ;  
      
# This code is contributed by AnkitRai01 

