

# Python3 implementation of the 
# approach 
  
# Returns the mininum number 
# of characters to be deleted 
# so that all remaining characters 
# occur unique number of times. 
def minimumDeletions(s): 
      
    # Stores how many times a 
    # character occurs. freqOfLetter[0] 
    # stores the frequency of letter 'a' 
    freqOfLetter = [0] * 26
  
    for i in range(len(s)): 
        freqOfLetter[ord(s[i]) - ord('a')] += 1
  
    # Number of characters that 
    # have a given frequency 
    LetterFreqMap = dict() 
  
    for i in range(26): 
  
        # insert the frequency of 
        # all lowercase letters in 
        # the map that have a 
        # frequency greater than 0 
        if (freqOfLetter[i] != 0): 
            LetterFreqMap[freqOfLetter[i]] = \ 
            LetterFreqMap.get(freqOfLetter[i], 0) + 1
  
    # Stores the number of deletions needed 
    deletions = 0
  
    # Iterate the map using iterator it 
    a = list(LetterFreqMap.keys()) 
    a = a[::-1] 
    a.sort() 
    while len(a) > 0: 
        it = a.pop() 
  
        # If frequency is 0 then all occurrences 
        # have been deleted. 
        if (it == 0): 
            break
  
        # Till more than 1 character has a 
        # given frequency. 
        while (LetterFreqMap[it] > 1): 
  
            # Delete a character that has  
            # conflicting frequency 
            deletions += 1
  
            # Now 1 less character 
            # has the given frequency f 
            LetterFreqMap[it] -= 1
  
            # But 1 more character 
            # has the frequency f - 1 
            if (it - 1) in LetterFreqMap.keys(): 
                LetterFreqMap[it - 1] += 1
            elif (it -1) > 0: # in case the after-subtracted frequency is not in keys list yet 
                a.insert(0,it-1) 
                LetterFreqMap[it-1] = 1
  
    return deletions 
  
# Driver Code 
s = "geeksforgeeks"
print(minimumDeletions(s)) 
  
# This code is contributed by Mohit Kumar 

