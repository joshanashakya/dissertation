

# Python3 program to find the string 
# in lexicographic order which is 
# in between given two strings 
  
# Function to find the lexicographically 
# next string 
def lexNext(s, n): 
  
    # Iterate from last character 
    for i in range(n - 1, -1, -1): 
  
        # If not 'z', increase by one 
        if s[i] != 'z': 
            k = ord(s[i]) 
            s[i] = chr(k + 1) 
            return ''.join(s) 
  
        # if 'z', change it to 'a' 
        s[i] = 'a'
  
# Driver Code 
if __name__ == "__main__": 
    S = "abcdeg"
    T = "abcfgh"
    n = len(S) 
  
    S = list(S) 
    res = lexNext(S, n) 
  
    # If not equal, print the 
    # resultant string 
    if res != T: 
        print(res) 
    else: 
        print(-1) 
  
# This code is conributed by 
# sanjeev2552 

