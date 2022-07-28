

# Python3 Program to find number of way 
# to split string such that each partition 
# starts with distinct character with 
# maximum number of partitions. 
  
# Returns the number of we can split 
# the string 
def countWays(s): 
    count = [0] * 26; 
  
    # Finding the frequency of each 
    # character. 
    for x in s: 
        count[ord(x) - 
              ord('a')] = (count[ord(x) - 
                                 ord('a')]) + 1; 
  
    # making frequency of first character 
    # of string equal to 1. 
    count[ord(s[0]) - ord('a')] = 1; 
  
    # Finding the product of frequency 
    # of occurrence of each character. 
    ans = 1; 
    for i in range(26): 
        if (count[i] != 0): 
            ans *= count[i]; 
  
    return ans; 
  
# Driver Code 
if __name__ == '__main__': 
    s = "acbbcc"; 
    print(countWays(s)); 
  
# This code is contributed by Rajput-Ji 

