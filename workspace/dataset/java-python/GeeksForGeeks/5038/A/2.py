

# Python3 implementation of the approach 
  
# Function to return the length of the 
# smallest subdivisible by 2^k 
def findLength(s, k): 
      
    # To store the final answer 
    ans = 10**9
  
    # Left pointer 
    l = 0
  
    # Right pointer 
    r = 0
  
    # Count of the number of zeros and 
    # ones in the current substring 
    cnt_zero = 0
    cnt_one = 0
  
    # Loop for two pointers 
    while (l < len(s) and r <= len(s)): 
  
        # Condition satisfied 
        if (cnt_zero >= k and cnt_one >= 1): 
  
            # Updated the answer 
            ans = min(ans, r - l) 
  
            # Update the pointer and count 
            l += 1
            if (s[l - 1] == '0'): 
                cnt_zero -= 1
            else: 
                cnt_one -= 1
  
        else: 
  
            # Update the pointer and count 
            if (r == len(s)): 
                break
            if (s[r] == '0'): 
                cnt_zero += 1
            else: 
                cnt_one += 1
            r += 1
  
    if (ans == 10**9): 
        return -1
    return ans 
  
# Driver code 
s = "100"
k = 2
  
print(findLength(s, k)) 
  
# This code is contributed by Mohit Kumar 

