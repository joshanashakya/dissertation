

# Python 3 program to find longest subsequence 
# of the form 0*1*0* in a binary string 
  
# Returns length of the longest subsequence 
# of the form 0*1*0* 
def longestSubseq(s): 
    n = len(s) 
  
    # Precomputing values in three arrays 
    # pre_count_0[i] is going to store count 
    #         of 0s in prefix str[0..i-1] 
    # pre_count_1[i] is going to store count 
    #         of 1s in prefix str[0..i-1] 
    # post_count_0[i] is going to store count 
    #         of 0s in suffix str[i-1..n-1] 
    pre_count_0 = [0 for i in range(n + 2)] 
    pre_count_1 = [0 for i in range(n + 1)] 
    post_count_0 = [0 for i in range(n + 2)] 
    pre_count_0[0] = 0
    post_count_0[n + 1] = 0
    pre_count_1[0] = 0
    for j in range(1, n + 1): 
        pre_count_0[j] = pre_count_0[j - 1] 
        pre_count_1[j] = pre_count_1[j - 1] 
        post_count_0[n - j + 1] = post_count_0[n - j + 2] 
  
        if (s[j - 1] == '0'): 
            pre_count_0[j] += 1
        else: 
            pre_count_1[j] += 1
        if (s[n - j] == '0'): 
            post_count_0[n - j + 1] += 1
  
    # string is made up of all 0s or all 1s 
    if (pre_count_0[n] == n or 
        pre_count_0[n] == 0): 
        return n 
  
    # Compute result using precomputed values 
    ans = 0
    for i in range(1, n + 1): 
        for j in range(i, n + 1, 1): 
            ans = max(pre_count_0[i - 1] + 
                      pre_count_1[j] - 
                      pre_count_1[i - 1] + 
                      post_count_0[j + 1], ans) 
    return ans 
  
# Driver Code 
if __name__ == '__main__': 
    s = "000011100000"
    print(longestSubseq(s)) 
      
# This code is contributed by 
# Surendra_Gangwar 

