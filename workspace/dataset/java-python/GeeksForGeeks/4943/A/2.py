

# Python 3 program to print the 
# lexicographically largest string that 
# can be formed from the characters 
# in range L and R 
  
# Function to return the lexicographically  
# largest string 
def printLargestString(s, l, r): 
  
    # hash array 
    freq = [0] * 26
  
    # make 0-based indexing 
    l -= 1
    r -= 1
  
    # iterate and count frequencies of character 
    for i in range(min(l, r), max(l, r) + 1) : 
        freq[ord(s[i]) - ord('a')] += 1
  
    # ans string 
    ans = "" 
  
    # iterate in frequency array 
    for i in range(25, -1, -1): 
  
        # add til all characters are added 
        while (freq[i]): 
            ans += chr(ord('a') + i) 
            freq[i] -= 1
  
    return ans 
  
# Driver Code 
if __name__ == "__main__": 
      
    s = "striver"
    l = 3
    r = 5
    print(printLargestString(s, l, r)) 
  
# This code is contributed by ita_c 

