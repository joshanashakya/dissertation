

# Python3 program to print the number of  
# times str2 can be formed from str1 using  
# the characters of str1 only once 
import sys 
  
# Function to find the number of str2 
# that can be formed using characters of str1 
def findNumberOfTimes(str1, str2): 
      
    freq = [0] * 26
    l1 = len(str1) 
      
    # iterate and mark the frequencies  
    # of all characters in str1 
    for i in range(l1): 
        freq[ord(str1[i]) - ord("a")] += 1
    l2 = len(str2) 
    count = sys.maxsize 
      
    # find the minimum frequency of 
    # every character in str1 
    for i in range(l2): 
        count = min(count, freq[ord(str2[i]) - 
                                ord('a')]) 
    return count 
      
# Driver Code 
if __name__ == '__main__': 
    str1 = "foreeksgekseg"
    str2 = "geeks"
    print(findNumberOfTimes(str1, str2)) 
  
# This code is contributed by PrinciRaj1992 

