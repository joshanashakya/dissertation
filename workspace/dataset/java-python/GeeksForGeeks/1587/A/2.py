

# python program for finding s such 
# that sum from 1 to s equals to n 
  
# Function to find no. of elements 
# to be added to get s 
def findS(s): 
      
    l = 1
    r = int(s / 2) + 1
   
    # Apply Binary search 
    while (l <= r) : 
        # Find mid 
        mid = int((l + r) / 2) 
   
        # find sum of 1 to mid natural numbers 
        # using formula 
        sum = int(mid * (mid + 1) / 2) 
   
        # If sum is equal to n 
        # return mid 
        if (sum == s): 
            return mid 
   
        # If greater than n 
        # do r = mid-1 
        elif (sum > s): 
            r = mid - 1
   
        # else do l = mid + 1 
        else: 
            l = mid + 1
      
   
    # If not possible, return -1 
    return -1
  
  
s = 15
n = findS(s) 
if(n == -1): 
    print( "-1") 
else: 
    print( n ) 
  
# This code is contributed by Sam007 

