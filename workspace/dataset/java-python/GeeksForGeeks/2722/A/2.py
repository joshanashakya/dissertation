

# Python3 implementation of the approach 
  
# Function to find longest prefix suffix 
def compute_lps(s): 
  
    n = len(s) 
  
    # To store longest prefix suffix 
    lps = [0 for i in range(n)] 
  
    # Length of the previous 
    # longest prefix suffix 
    Len = 0
  
    # lps[0] is always 0 
    lps[0] = 0
    i = 1
  
    # Loop calculates lps[i] for i = 1 to n - 1 
    while (i < n): 
        if (s[i] == s[Len]): 
            Len += 1
            lps[i] = Len
            i += 1
  
        # (pat[i] != pat[Len]) 
        else: 
            if (Len != 0): 
                Len = lps[Len - 1] 
            # Also, note that we do not increment 
            # i here 
  
            # If Len = 0 
            else: 
                lps[i] = 0
                i += 1
              
  
    return lps 
  
# Function to find the longest substring 
# which is prefix as well as a 
# sub-of s[1...n-2] 
def Longestsubstring(s): 
  
    # Find longest prefix suffix 
    lps = compute_lps(s) 
    n = len(s) 
  
    # If lps of n-1 is zero 
    if (lps[n - 1] == 0): 
        print(-1) 
        exit() 
      
    for i in range(0,n - 1): 
  
        # At any position lps[i] equals to lps[n - 1] 
        if (lps[i] == lps[n - 1]): 
            print(s[0:lps[i]]) 
            exit() 
  
    # If answer is not possible 
    if (lps[lps[n - 1] - 1] == 0): 
        print(-1) 
    else: 
        print(s[0:lps[lps[n - 1] - 1]]) 
  
# Driver code 
  
s = "fixprefixsuffix"
  
# function call 
Longestsubstring(s) 
  
# This code is contributed by mohit kumar 

