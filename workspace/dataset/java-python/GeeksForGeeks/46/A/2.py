

# Python3 implementation of the approach 
  
# Function to return the count of times p 
# appaers in the prime factors of the 
# elements from the range [l, r] 
def getCount(l, r, p): 
  
    # To store the requried count 
    cnt = 0; 
    val = p; 
    while (True): 
  
        # Number of values in the range [0, r] 
        # that are divisible by val 
        a = r // val; 
  
        # Number of values in the range [0, l - 1] 
        # that are divisible by val 
        b = (l - 1) // val; 
  
        # Increment the power of the val 
        val *= p; 
  
        # (a - b) is the count of numbers in the 
        # range [l, r] that are divisible by val 
        if (a - b): 
            cnt += (a - b); 
  
        # No values that are divisible by val 
        # thus exiting from the loop 
        else: 
            break; 
  
    return int(cnt); 
  
# Driver Code 
l = 2; 
r = 8; 
p = 2; 
  
print(getCount(l, r, p)); 
  
# This code is contributed by princiraj 

