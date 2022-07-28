

# Python 3 implementation of above approach 
  
# Function to find maximum number of ABs 
def maxCountAB(s,n): 
    # variable A, B, AB for count strings that 
    # end with 'A' but not end with 'B', 'B' but 
    # does not end with 'A' and 'B' and ends 
    # with 'A' respectively. 
    A = 0
    B = 0
    BA = 0
    ans = 0
  
    for i in range(n): 
        S = s[i] 
        L = len(S) 
        for j in range(L-1): 
            # 'AB' is already present in string 
            # before concatenate them 
            if (S[j] == 'A' and S[j + 1] == 'B'): 
                ans += 1
  
        # count of strings that begins 
        # with 'B' and ends with 'A 
        if (S[0] == 'B' and S[L - 1] == 'A'): 
            BA += 1
  
        # count of strings that begins 
        # with 'B' but does not end with 'A' 
        elif (S[0] == 'B'): 
            B += 1
  
        # count of strings that ends with 
        # 'A' but not end with 'B' 
        elif (S[L - 1] == 'A'): 
            A += 1
  
    # updating the value of ans and 
    # add extra count of 'AB' 
    if (BA == 0): 
        ans += min(B, A) 
    elif (A + B == 0): 
        ans += BA - 1
    else: 
        ans += BA + min(B, A) 
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    s = ["ABCA", "BOOK", "BAND"] 
  
    n = len(s) 
  
    print(maxCountAB(s, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

