

# Python 3 program to count number of substrings 
# in which each character has count less 
# than or equal to k. 
  
def findSubstrings(s, k): 
  
    # variable to store count of substrings. 
    ans = 0
    n = len(s) 
    for i in range(n): 
          
        # array to store count of each character. 
        cnt = [0] * 26
  
        for j in range(i, n): 
              
            # increment character count 
            cnt[ord(s[j]) - ord('a')] += 1
  
            # check only the count of current character 
            # because only the count of this 
            # character is changed. The ending point is 
            # incremented to current position only if 
            # all other characters have count at most 
            # k and hence their count is not checked. 
            # If count is less than k, then increase  
            # ans by 1. 
              
            if (cnt[ord(s[j]) - ord('a')] <= k): 
                ans += 1
  
            # if count is less than k, then break as 
            # subsequent substrings for this starting 
            # point will also have count greater than 
            # k and hence are reduntant to check. 
            else: 
                break
  
    # return the final count of substrings. 
    return ans 
  
# Driver code 
if __name__ == "__main__": 
      
    S = "aaabb"
    k = 2
    print(findSubstrings(S, k)) 
  
# This code is contributed by ita_c 

