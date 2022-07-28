

# Python3 implementation of the above approach 
  
# Return the count of string 
def maxPartition(s): 
      
    # P will store the answer 
    n = len(s) 
    P = 0
  
    # Current will store current string 
    # Previous will store the previous 
    # that has been taken already 
    current = "" 
    previous = "" 
  
    for i in range(n): 
  
        # Add a character to current string 
        current += s[i] 
  
        if (current != previous): 
  
            # Here we will create a partition and 
            # update the previous with 
            # current string 
            previous = current 
  
            # Now we will clear the current string 
            current = "" 
  
            # Increment the count of partition. 
            P += 1
  
    return P 
  
# Driver code 
s = "geeksforgeeks"
  
ans = maxPartition(s) 
  
print(ans) 
  
# This code is contributed by Mohit Kumar 

