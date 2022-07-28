

# Python3 program to find lexicographically  
# next word which contains first K  
# letters of the English alphabet and  
# does not contain a palindrome as it's 
# substring of length more than one.  
  
# Function to return lexicographically next word  
def findNextWord(s, m):  
  
    # we made m as m+97 that means  
    # our required string contains  
    # not more than m+97(as per ASCII  
    # value) in it.  
    m += 97
    n = len(s)  
    i = len(s) - 1
      
    # increment last alphabet to make  
    # next lexicographically next word.  
    s[i] = chr(ord(s[i]) + 1) 
  
    while i >= 0 and i <= n - 1:  
          
        # if i-th alphabet not in first  
        # k letters then make it as "a"  
        # and then increase (i-1)th letter  
        if ord(s[i]) >= m: 
            s[i] = 'a'
            i -= 1
            s[i] = chr(ord(s[i]) + 1)  
  
        # to check whether formed string  
        # palindrome or not.  
        elif s[i] == s[i - 1] or s[i] == s[i - 2]:  
            s[i] = chr(ord(s[i]) + 1)  
  
        # increment i.  
        else: 
            i += 1
      
    # if i less than or equals to one  
    # that means we not formed such word.  
    if i <= -1: 
        print("-1")  
    else: 
        print(''.join(s))  
  
# Driver code  
if __name__ == "__main__":  
  
    string = "abcd"
    k = 4
    findNextWord(list(string), k)  
  
# This code is contributed by Rituraj Jain 

