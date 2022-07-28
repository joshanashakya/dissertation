

# Python 3 implementation of the approach 
  
# Function to return the count 
# of the required sub-strings 
def maxSubStrings(s, k): 
    maxSubStr = 0
    n = len(s) 
  
    # Iterate over all characters 
    for c in range(27): 
        ch = chr(ord('a') + c) 
  
        # Count with current character 
        curr = 0
        for i in range(n - k): 
            if (s[i] != ch): 
                continue
            cnt = 0
            while (i < n and s[i] == ch and 
                                   cnt != k): 
                i += 1
                cnt += 1
      
            i -= 1
  
            # If the substring has a length k then 
            # increment count with current character 
            if (cnt == k): 
                curr += 1
  
        # Update max count 
        maxSubStr = max(maxSubStr, curr) 
  
    return maxSubStr 
  
# Driver Code 
if __name__ == '__main__': 
    s = "aaacaabbaa"
    k = 2
    print(maxSubStrings(s, k)) 
  
# This code is contributed by 
# Surendra_Gangwar 

