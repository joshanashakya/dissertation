

# Python3 implmentation to count the  
# number of ways to partition the  
# string such that each partition  
# have same number of distinct  
# characters in the string  
  
# Function to count the number  
# of ways to partition the string  
# such that each partition have  
# same number of distinct character  
def waysToSplit(s) :  
  
    n = len(s); 
    answer = 0;  
      
    # Prefix and suffix array for  
    # distinct character from  
    # start and end  
    prefix = [ 0 ]*n;  
    suffix = [0 ]*n;  
  
    # To check whether a character  
    # has appeared till ith index  
    seen = [ 0 ]*26;  
  
    # Calculating prefix array  
    for i in range(n) : 
  
        prev = prefix[i - 1] if (i - 1 >= 0 ) else  0;  
  
        # Character appears for  
        # the first time in string  
        if (seen[ord(s[i]) - ord('a')] == 0) : 
            prefix[i] += (prev + 1);  
          
        else : 
            prefix[i] = prev;  
  
        # Character is visited  
        seen[ord(s[i]) - ord('a')] = 1;  
      
    # Resetting seen for  
    # suffix calculation  
    seen = [0]*len(seen);  
  
    # Calculating the suffix array  
    suffix[n - 1] = 0;  
    for i in range(n - 1, 0, -1) : 
        prev = suffix[i];  
  
        # Character appears  
        # for the first time  
        if (seen[ord(s[i]) - ord('a')] == 0) : 
            suffix[i - 1] += (prev + 1);  
          
        else : 
            suffix[i - 1] = prev;  
  
        # This character  
        # has now appeared  
        seen[ord(s[i]) - ord('a')] = 1;  
      
    # Loop to calculate the number  
    # partition points in the string  
    for i in range(n) : 
        # Check whether number of  
        # distinct characters are equal  
        if (prefix[i] == suffix[i]) : 
            answer += 1;  
      
    return answer;  
  
  
# Driver Code  
if __name__ == "__main__" :  
  
    s = "ababa";  
  
    print(waysToSplit(s));  
  
# This code is contributed by Yash_R 

