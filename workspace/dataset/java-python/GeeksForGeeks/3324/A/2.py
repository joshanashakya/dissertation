

# Python3 implementation of the approach 
MAX = 26
  
# Function to return the minimum additions 
# required to balance the given str1ing 
def minimumAddition(str1, Len): 
  
    # To store the frequency of 
    # the characters of str1 
    freq = [0 for i in range(MAX)] 
  
    # Update the frequency of the characters 
    for i in range(Len): 
        freq[ord(str1[i]) - ord('a')] += 1
  
    # To store the maximum frequency from the array 
    maxFreq = max(freq) 
  
    # To store the minimum additions required 
    minAddition = 0
    for i in range(MAX): 
  
        # Every character's frequency must be 
        # equal to the frequency of the most 
        # frequently occurring character 
        if (freq[i] > 0): 
            minAddition += abs(maxFreq - freq[i]) 
  
    return minAddition 
  
# Driver code 
str1 = "geeksforgeeks"
Len = len(str1) 
  
print(minimumAddition(str1, Len)) 
  
# This code is contributed Mohit Kumar 

