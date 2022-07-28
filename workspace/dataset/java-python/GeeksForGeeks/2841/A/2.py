

# Python 3 program to find minimum length  
# substring having exactly k distinct character. 
  
# Function to find minimum length substring 
# having exactly k distinct character. 
def findMinLenStr(str, k): 
  
    n = len(str) 
  
    # Starting index of sliding window. 
    st = 0
  
    # Ending index of sliding window. 
    end = 0
  
    # To store count of character. 
    cnt = [0] * 26
  
    # To store count of distinct 
    # character in current sliding 
    # window. 
    distEle = 0
  
    # To store length of current 
    # sliding window. 
    currlen =0
  
    # To store minimum length. 
    minlen = n 
  
    # To store starting index of minimum 
    # length substring. 
    startInd = -1
  
    while (end < n): 
  
        # Increment count of current character 
        # If this count is one then a new 
        # distinct character is found in 
        # sliding window. 
        cnt[ord(str[end]) - ord('a')] += 1
        if (cnt[ord(str[end]) - ord('a')] == 1): 
            distEle += 1
  
        # If number of distinct characters is 
        # is greater than k, then move starting 
        # point of sliding window forward, 
        # until count is k. 
        if (distEle > k): 
            while (st < end and distEle > k): 
                if (cnt[ord(str[st]) - 
                        ord('a')] == 1): 
                    distEle -= 1
                cnt[ord(str[st]) - ord('a')] -= 1
                st += 1
  
        # Remove characters from the beginning of 
        # sliding window having count more than 1 
        # to minimize length. 
        if (distEle == k): 
            while (st < end and cnt[ord(str[st]) - 
                                    ord('a')] > 1): 
                cnt[ord(str[st]) - ord('a')] -= 1
                st += 1
  
            # Comapre length with minimum length 
            # and update if required. 
            currlen = end - st + 1
            if (currlen < minlen): 
                minlen = currlen 
                startInd = st 
  
        end += 1
  
    # Return minimum length substring. 
    return str[startInd : startInd + minlen] 
  
# Driver code 
if __name__ == "__main__": 
      
    str = "efecfefd"
  
    k = 4
  
    print(findMinLenStr(str, k)) 
  
# This code is contributed by Ita_c 

