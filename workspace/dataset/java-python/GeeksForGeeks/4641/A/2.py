

# Python3 program to find the Length of Longest  
# subsequence formed by consecutive segments  
# of at least length K  
  
# Returns the length of the longest common subsequence  
# with a minimum of length of K consecutive segments  
def longestSubsequenceCommonSegment(k, s1, s2) : 
      
    # length of strings  
    n = len(s1)  
    m = len(s2)  
  
    # declare the lcs and cnt array  
    lcs = [[0 for x in range(m + 1)] for y in range(n + 1)]  
    cnt = [[0 for x in range(m + 1)] for y in range(n + 1)] 
  
  
    # iterate from i=1 to n and j=1 to j=m  
    for i in range(1, n + 1) : 
        for j in range(1, m + 1) : 
            # stores the maximum of lcs[i-1][j] and lcs[i][j-1]  
            lcs[i][j] = max(lcs[i - 1][j], lcs[i][j - 1]) 
  
            # when both the characters are equal  
            # of s1 and s2  
            if (s1[i - 1] == s2[j - 1]): 
                cnt[i][j] = cnt[i - 1][j - 1] + 1;  
  
            # when length of common segment is  
            # more than k, then update lcs answer  
            # by adding that segment to the answer  
            if (cnt[i][j] >= k) : 
                  
                # formulate for all length of segments  
                # to get the longest subsequence with  
                # consecutive Common Segment of length  
                # of min k length  
                for a in range(k, cnt[i][j] + 1) : 
                      
                    # update lcs value by adding  
                    # segment length  
                    lcs[i][j] = max(lcs[i][j],lcs[i - a][j - a] + a) 
                      
    return lcs[n][m]  
  
  
# Driver code   
k = 4
s1 = "aggasdfa"
s2 = "aggajasdfa"
print(longestSubsequenceCommonSegment(k, s1, s2))  
  
# This code is contributed by Nikita Tiwari.  

