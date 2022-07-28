

# Python3 implementation of the approach 
  
# Maximum distinct characters possible 
MAX = 256
  
# To store the frequency of the characters 
freq = [[0 for i in range(MAX)] 
           for j in range(MAX)] 
  
# Function to pre-calculate  
# the frequency array 
def preCalculate(string, n): 
  
    # Only the first character has 
    # frequency 1 till index 0 
    freq[ord(string[0])][0] = 1
  
    # Starting from the second 
    # character of the string 
    for i in range(1, n): 
        ch = string[i] 
  
        # For every possible character 
        for j in range(MAX): 
  
            # Current character under consideration 
            charToUpdate = chr(j) 
  
            # If it is equal to the character 
            # at the current index 
            if charToUpdate == ch: 
                freq[j][i] = freq[j][i - 1] + 1
            else: 
                freq[j][i] = freq[j][i - 1] 
  
# Function to return the frequency of the 
# given character in the sub-string str[l...r] 
def getFrequency(ch, l, r): 
    if l == 0: 
        return freq[ord(ch)][r] 
    else: 
        return (freq[ord(ch)][r] - 
                freq[ord(ch)][l - 1]) 
  
# Function to return the first 
# non-repeating character in range[l..r] 
def firstNonRepeating(string, n, l, r): 
    t = [""] * 2
  
    # Starting from the first character 
    for i in range(l, r): 
  
        # Current character 
        ch = string[i] 
  
        # If frequency of the current character is 1 
        # then return the character 
        if getFrequency(ch, l, r) == 1: 
            t[0] = ch 
            return t[0] 
  
    # All the characters of the 
    # sub-string are repeating 
    return "-1"
  
# Driver Code 
if __name__ == "__main__": 
    string = "GeeksForGeeks"
    n = len(string) 
  
    queries = [(0, 3), (2, 3), (5, 12)] 
    q = len(queries) 
  
    # Pre-calculate the frequency array 
    preCalculate(string, n) 
  
    for i in range(q): 
        print(firstNonRepeating(string, n,  
                                queries[i][0],  
                                queries[i][1])) 
  
# This code is conributed by 
# sanjeev2552 

