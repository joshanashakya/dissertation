

# Python3 implmentation to count the  
# number of ways to partition the  
# string such that each partition  
# have same number of distinct  
# characters in the string  
  
# Function to count the distinct  
# characters in the string  
def distinctChars(s) :  
  
    # Frequency of each character  
    freq = [0]*26;  
    count = 0;  
      
    # Loop to count the frequency  
    # of each character of the string  
    for i in range(len(s)) :  
        freq[ord(s[i]) - ord('a')] += 1;  
  
    # If frequency is greater than 0  
    # then the character occured  
    for i in range(26) : 
        if (freq[i] > 0) : 
            count += 1;  
  
    return count;  
  
# Function to count the number  
# of ways to partition the string  
# such that each partition have  
# same number of distinct character  
def waysToSplit(s) :  
    n = len(s);  
    answer = 0;  
      
    # Loop to choose the partition  
    # index for the string  
    for i in range(1, n) : 
          
        # Divide in two parts  
        left = s[0 : i];  
        right = s[i : n ];  
  
        # Check whether number of distinct  
        # characters are equal  
        if (distinctChars(left) == distinctChars(right)) : 
            answer += 1;  
      
    return answer;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    s = "ababa";  
  
    print(waysToSplit(s));  
      
# This code is contributed by Yash_R 

