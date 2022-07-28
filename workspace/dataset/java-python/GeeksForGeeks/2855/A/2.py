

# Python3 Program to rearrange letters of string  
# to find a non-palindromic string if it exists  
  
# Function to print the non-palindromic string  
# if it exists, otherwise prints -1  
def findNonPalinString(s):  
  
    freq = [0] * (26)  
    flag = 0
  
    for i in range(0, len(s)):  
  
        # If all characters are not same, 
        # set flag to 1  
        if s[i] != s[0]: 
            flag = 1
  
        # Update frequency of the current  
        # character  
        freq[ord(s[i]) - ord('a')] += 1
  
    # If all characters are same  
    if not flag: 
        print("-1")  
      
    else: 
          
        # Print characters in sorted manner  
        for i in range(0, 26):  
            for j in range(0, freq[i]):  
                print(chr(ord('a') + i), 
                               end = "")  
  
# Driver Code  
if __name__ == "__main__": 
  
    s = "abba"
    findNonPalinString(s)  
  
# This code is contributed by 
# Rituraj Jain 

