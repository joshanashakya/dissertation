

# Python 3 implementation of the approach 
  
# Returns length of the longest prefix 
# which is also suffix and the two do 
# not overlap. This function mainly is 
# copy of computeLPSArray() in KMP Algorithm 
def LengthlongestPrefixSuffix(s): 
    n = len(s) 
  
    lps = [0 for i in range(n)] 
  
    # Length of the previous 
    # longest prefix suffix 
    len1 = 0
  
    # Loop to calculate lps[i] 
    # for i = 1 to n - 1 
    i = 1
    while (i < n): 
        if (s[i] == s[len1]): 
            len1 += 1
            lps[i] = len1 
            i += 1
          
        else: 
              
            # This is tricky. Consider 
            # the example. AAACAAAA 
            # and i = 7. The idea is 
            # similar to search step. 
            if (len1 != 0): 
                len1 = lps[len1 - 1] 
  
                # Also, note that we do 
                # not increment i here 
              
            # If len = 0 
            else: 
                lps[i] = 0
                i += 1
  
    res = lps[n - 1] 
      
    # Since we are looking for 
    # non overlapping parts 
    if (res > int(n / 2)): 
        return int(n / 2) 
    else: 
        return res 
  
# Function that returns the prefix 
def longestPrefixSuffix(s): 
      
    # Get the length of the longest prefix 
    len1 = LengthlongestPrefixSuffix(s) 
  
    # Stores the prefix 
    prefix = "" 
  
    # Traverse and add charcaters 
    for i in range(len1): 
        prefix += s[i] 
  
    # Returns the prefix 
    return prefix 
  
# Driver code 
if __name__ == '__main__': 
    s = "abcab"
    ans = longestPrefixSuffix(s) 
    if (ans == ""): 
        print("-1") 
    else: 
        print(ans) 
          
# This code is contributed by 
# Surendra_Gangwar 

