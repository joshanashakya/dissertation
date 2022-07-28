

# Python 3 code to find longest 
# subarray with difference 
# between max and min as at-most 1. 
def longestSubarray(input, length): 
  
    prev = -1
    prevCount = 0
    currentCount = 1
  
    # longest constant range length 
    longest = 1
  
    # first number 
    current = input[0] 
  
    for i in range(1, length): 
  
        next = input[i] 
  
        # If we see same number 
        if next == current : 
            currentCount += 1
      
        # If we see different number,  
        # but same as previous. 
        elif next == prev : 
            prevCount += currentCount 
            prev = current 
            current = next
            currentCount = 1
          
        # If number is neither same  
        # as previous nor as current.  
        else: 
            longest = max(longest,  
                          currentCount + 
                          prevCount) 
            prev = current 
            prevCount = currentCount 
            current = next
            currentCount = 1
          
    return max(longest,  
            currentCount + prevCount) 
  
# Driver Code 
if __name__ == "__main__": 
    input = [ 5, 5, 6, 7, 6 ] 
    n = len(input) 
    print(longestSubarray(input, n)) 
      
# This code is contributed 
# by ChitraNayal 

