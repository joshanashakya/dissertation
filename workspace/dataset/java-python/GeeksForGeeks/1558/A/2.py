

# Python3 implementation of the approach 
import sys 
MAX = 26; 
  
# Function to return the maximum number 
# of times str1 can appear as a 
# non-overlapping sustring bin str2 
def maxSubStr(str1, len1, str2, len2): 
  
    # str1 cannot never be  
    # substring of str2 
    if (len1 > len2): 
        return 0; 
  
    # Store the frequency of 
    # the characters of str1 
    freq1 = [0] * MAX; 
    for i in range(len1): 
        freq1[ord(str1[i]) - 
              ord('a')] += 1; 
  
    # Store the frequency of  
    # the characters of str2 
    freq2 = [0] * MAX; 
    for i in range(len2): 
        freq2[ord(str2[i]) - 
              ord('a')] += 1; 
  
    # To store the required count  
    # of substrings 
    minPoss = sys.maxsize; 
  
    for i in range(MAX): 
  
        # Current character doesn't appear 
        # in str1 
        if (freq1[i] == 0): 
            continue; 
  
        # Frequency of the current character  
        # in str1 is greater than its  
        # frequency in str2 
        if (freq1[i] > freq2[i]): 
            return 0; 
  
        # Update the count of possible substrings 
        minPoss = min(minPoss, freq2[i] / 
                               freq1[i]); 
    return int(minPoss); 
  
# Driver code 
str1 = "geeks"; str2 = "gskefrgoekees"; 
len1 = len(str1); 
len2 = len(str2); 
  
print(maxSubStr(str1, len1, str2, len2)); 
  
# This code is contributed by 29AjayKumar 

