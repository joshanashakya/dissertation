

# Python3 implementation of the approach 
MAX = 26
  
# Function to update the freq[] array 
# to store the frequencies of 
# all the characters of strr 
def updateFreq(strr, freq): 
    lenn = len(strr) 
  
    # Update the frequency of the characters 
    for i in range(lenn): 
        freq[ord(strr[i]) - ord('a')] += 1
  
# Function to return the maximum count 
# of times patt can be formed 
# using the characters of strr 
def maxCount(strr, patt): 
  
    # To store the frequencies of 
    # all the characters of strr 
    strrFreq = [0 for i in range(MAX)] 
    updateFreq(strr, strrFreq) 
  
    # To store the frequencies of 
    # all the characters of patt 
    pattFreq = [0 for i in range(MAX)] 
    updateFreq(patt, pattFreq) 
  
    # To store the result 
    ans = 10**9
  
    # For every character 
    for i in range(MAX): 
  
        # If the current character 
        # doesn't appear in patt 
        if (pattFreq[i] == 0): 
            continue
  
        # Update the result 
        ans = min(ans, strrFreq[i] // pattFreq[i]) 
  
    return ans 
  
# Driver code 
strr = "geeksforgeeks"
patt = "geeks"
  
print(maxCount(strr, patt)) 
  
# This code is contributed by Mohit Kumar  

