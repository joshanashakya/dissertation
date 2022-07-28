

# Python3 program to rearrange the  
# string such to maximize the  
# number of palindromic substrings  
  
# Function to return the newString  
def newString(s):  
  
    # length of string  
    l = len(s)  
  
    # hashing array  
    freq = [0] * (26)  
  
    # iterate and count  
    for i in range(0, l):  
        freq[ord(s[i]) - ord('a')] += 1
  
    # resulting string  
    ans = ""  
  
    # form the resulting string  
    for i in range(0, 26):  
  
        # number of times character appears  
        for j in range(0, freq[i]):  
  
            # append to resulting string  
            ans += chr(97 + i)  
      
    return ans  
  
# Driver Code  
if __name__ == "__main__": 
  
    s = "aabab"
    print(newString(s)) 
  
# This code is contributed by Rituraj Jain 

