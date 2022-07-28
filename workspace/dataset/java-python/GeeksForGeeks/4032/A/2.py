

# Python3 program to find maximum  
# number of consecutive zeroes  
# after concatenating a binary string 
  
# returns the maximum size of a  
# substring consisting only of  
# zeroes after k concatenation 
def max_length_substring(st, n, k): 
  
    # stores the maximum length  
    # of the required substring 
    max_len = 0
  
    len = 0
    for i in range(0, n): 
  
        # if the current character is 0 
        if (st[i] == '0'): 
            len = len + 1; 
        else: 
            len = 0
  
        # stores maximum length of  
        # current substrings with zeroes 
        max_len = max(max_len, len) 
      
  
    # if the whole is filled  
    # with zero 
    if (max_len == n): 
        return n * k 
  
    pref = 0
    suff = 0
  
    # computes the length of the maximal 
    # prefix which contains only zeroes 
    i = 0
    while(st[i] == '0'): 
        i = i + 1
        pref = pref + 1
  
    # computes the length of the maximal  
    # suffix which contains only zeroes 
    i = n - 1
    while(st[i] == '0'): 
        i = i - 1
        suff = suff + 1
  
    # if more than 1 concatenations  
    # are to be made 
    if (k > 1): 
        max_len = max(max_len,  
                      pref + suff) 
  
    return max_len 
  
# Driver code 
n = 6
k = 3
st = "110010"
ans = max_length_substring(st, n, k) 
  
print(ans) 
  
# This code is contributed by ihritik 

