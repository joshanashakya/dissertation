

# Python3 implementation of above  
# approach 
  
# Function that counts all the  
# sub-strings of length 'k'  
# which have all identical characters 
def solve(s, k) : 
  
    # count of sub-strings, length,  
    # initial position of sliding window  
    count, length, pos = 0, 0, 0
  
    # dictionary to store the frequency of  
    # the characters of sub-string  
    m = dict.fromkeys(s,0) 
  
    for i in range(len(s)) : 
          
        # increase the frequency of the character  
        # and length of the sub-string  
        m[s[i]] += 1
        length += 1
  
        # if the length of the sub-string  
        # is greater than K  
        if length > k : 
  
            # remove the character from  
            # the beginning of sub-string 
            m[s[pos]] -= 1
            pos += 1
            length -= 1
  
        # if the length of the sub string  
        # is equal to k and frequency of one  
        # of its characters is equal to the  
        # length of the sub-string  
        # i.e. all the characters are same  
        # increase the count  
        if length == k and m[s[i]] == length : 
            count += 1
  
    # display the number  
    # of valid sub-strings 
    print(count) 
              
  
  
# Driver code      
if __name__ == "__main__" : 
  
    s = "aaaabbbccdddd"
    k = 4
  
    # Function call 
    solve(s, k) 
                  
# This code is contributed by  
# ANKITRAI1 

