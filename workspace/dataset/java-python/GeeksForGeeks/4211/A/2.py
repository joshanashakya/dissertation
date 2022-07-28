

# Python implementation of the above approach 
  
   
# Function to count the total bits 
def countBits(n): 
    count = 0; 
   
    # Iterate and find the 
    # number of set bits 
    while (n>0): 
        count+=1; 
   
        # Right shift the number by 1 
        n >>= 1; 
    return count; 
   
# Function to find the nearest number 
def findNearestNumber(n): 
   
    # Count the total number of bits 
    cnt = countBits(n); 
   
    # To get the position 
    cnt -= 1; 
   
    # If the last set bit is 
    # at odd position then 
    # answer will always be a number 
    # with the left bit set 
    if (cnt % 2): 
        return 1 << (cnt + 1); 
   
    else: 
   
        tempnum = 0; 
   
        # Set all the even bits which 
        # are possible 
        for i in range(0,cnt+1,2): 
            tempnum += 1 << i; 
   
        # If the number still is less than N 
        if (tempnum < n): 
   
            # Return the number by setting the 
            # next even set bit 
            return (1 << (cnt + 2)); 
   
        elif (tempnum == n): 
            return n; 
   
        # If we have reached this position 
        # it means tempsum > n 
        # hence turn off even bits to get the 
        # first possible number 
        for i in range(0,cnt+1,2): 
   
            # Turn off the bit 
            tempnum -= (1 << i); 
   
            # If it gets lower than N 
            # then set it and return that number 
            if (tempnum < n): 
                tempnum += (1 << i); 
                return tempnum; 
# Driver code 
n = 19; 
print(findNearestNumber(n)); 
  
# This code contributed by PrinciRaj1992  

